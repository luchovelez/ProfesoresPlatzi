package com.platzi.dao;

import java.util.List;

import com.platzi.model.Course;


public class CourseDaoImpl extends  AbstractSession implements CourseDao {

	@Override
	public void saveCourse(Course course) {
		// TODO Auto-generated method stub
		getSession().save(course);
		
	}

	@Override
	public List<Course> findAllTeachers() {
		// TODO Auto-generated method stub
		 return getSession().createQuery("from Course").list();
	}

	@Override
	public void deleteCourseById(Long idcourse) {
		Course course = findById(idcourse);
		if(course!=null) {
			getSession().delete(course);
		}
		
	}

	@Override
	public void updateCourse(Course course) {
		// TODO Auto-generated method stub
		getSession().update(course);
		
	}

	@Override
	public Course findById(Long idcourse) {
		// TODO Auto-generated method stub
		 return getSession().get(Course.class, idcourse);
	}

	@Override
	public Course findByName(String name) {
		// TODO Auto-generated method stub
		return (Course)getSession().createQuery(
				"from Course where nombre = :name")
				.setParameter("name", name).uniqueResult();
	}

	@Override
	public List<Course> findByIdTeacher(Long idTeacher) {
		// TODO Auto-generated method stub
		return getSession().createQuery("from Course c join c.teacher t where t.idTeacher = :idTeacher").setParameter("idTeacher", idTeacher).list();
	}

}
