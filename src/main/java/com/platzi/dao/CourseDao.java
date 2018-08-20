package com.platzi.dao;

import java.util.List;

import com.platzi.model.Course;

public interface CourseDao {
	
	void saveCourse(Course course);
	
	List<Course>findAllTeachers();
	
	void deleteCourseById(Long idcourse);
	
	void updateCourse(Course course);
	
	Course findById(Long idcourse);
	
	Course findByName(String name);
	
	List <Course> findByIdTeacher(Long idTeacher);

}
