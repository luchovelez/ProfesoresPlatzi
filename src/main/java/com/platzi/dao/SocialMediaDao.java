package com.platzi.dao;

import java.util.List;

import com.platzi.model.SocialMedia;
import com.platzi.model.TeacherSocialMedia;

public interface SocialMediaDao {
	
	void saveSocialMedia(SocialMedia socialMedia);
	
	List<SocialMedia>findAllSocialmedia();
	
	void deletesocialMediaById(Long idsocialMedia);
	
	void updateSocialMedia(SocialMedia socialMedia);
	
	SocialMedia findById(Long idsocialMedia);
	
	SocialMedia findByName(String name);
	
	TeacherSocialMedia FindSocialMediaByIdAndName(Long id, String nickname);
	
	
	
}
