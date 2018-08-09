package com.platzi.dao;

import java.util.List;

import com.platzi.model.Teacher;

public interface TeacherDao {
	
	void saveTeacher(Teacher teacher);
	
	List<Teacher>findAllTeachers();
	
	void deleteTeacherById(Long idteacher);

	
	void updateTeacher(Teacher teacher);
	
	Teacher findById(Long idTeacher);
	
	Teacher findByName(String name);
	
	
	

}
