package com.platzi.dao;

import java.util.Iterator;
import java.util.List;


import org.hibernate.Session;

import com.platzi.model.Teacher;
import com.platzi.model.TeacherSocialMedia;



public class TeacherDaoImpl extends  AbstractSession implements TeacherDao{


	public void saveTeacher(Teacher teacher) {
		
		getSession().save(teacher);
	
	}


	public List<Teacher> findAllTeachers() {
		
		return getSession().createQuery("from Teacher").list();
		
	}

	
	public void updateTeacher(Teacher teacher) {
		getSession().update(teacher);
	
	}

	public Teacher findById(Long idTeacher) {
		
		return getSession().get(Teacher.class, idTeacher);
	}

	public Teacher findByName(String name) {
		// TODO Auto-generated method stub
		
		return (Teacher)getSession().createQuery(
				"from Teacher where nombre = :name")
				.setParameter("name", name).uniqueResult();
	}

	public void deleteTeacherById(Long idTeacher) {
		Teacher teacher = findById(idTeacher);
		if(teacher!=null) {
			
			Iterator<TeacherSocialMedia> i = teacher.getTeacherSocialMedia().iterator();
			while(i.hasNext()) {
				TeacherSocialMedia teacherSocialMedia = i.next();
				i.remove();
				getSession().delete(teacherSocialMedia);
			}
			teacher.getTeacherSocialMedia().clear();
			getSession().delete(teacher);
		}
	
	
		
	}




	

}
