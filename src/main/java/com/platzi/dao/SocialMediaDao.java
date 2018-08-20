package com.platzi.dao;

import java.util.List;

import com.platzi.model.SocialMedia;

public interface SocialMediaDao {
	
	void saveSocialMedia(SocialMedia socialMedia);
	
	List<SocialMedia>findAllTeachers();
	
	void deletesocialMediaById(Long idsocialMedia);
	
	void updateSocialMedia(SocialMedia socialMedia);
	
	SocialMedia findById(Long idTeacher);
	
	SocialMedia findByName(String name);
	
	
	
}
