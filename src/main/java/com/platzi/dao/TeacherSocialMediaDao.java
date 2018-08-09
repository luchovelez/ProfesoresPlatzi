package com.platzi.dao;

import java.util.List;

import com.platzi.model.TeacherSocialMedia;

public interface TeacherSocialMediaDao {
	
	
	void saveCourse(TeacherSocialMedia socialMedia);
	
	List<TeacherSocialMedia>findAllTeachers();
	
	void deleteTeacherSocialMediaById(Long idTeacherSocialMedia);
	
	void updateTeacherSocialMedia(TeacherSocialMedia TeacherSocialMedia);
	
	TeacherSocialMedia findById(Long idTeacherSocialMedia);
	
	TeacherSocialMedia findByName(String name);
	
	
	
	

}
