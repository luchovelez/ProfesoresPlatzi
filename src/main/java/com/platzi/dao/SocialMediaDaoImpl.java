package com.platzi.dao;

import java.util.List;

import com.platzi.model.SocialMedia;
import com.platzi.model.Teacher;

public class SocialMediaDaoImpl extends  AbstractSession implements SocialMediaDao {

	@Override
	public void saveSocialMedia(SocialMedia socialMedia) {
		getSession().save(socialMedia);
	
		
	}

	@Override
	public List<SocialMedia> findAllTeachers() {
		
		return getSession().createQuery("from SocialMedia").list();
	}

	@Override
	public void deletesocialMediaById(Long idsocialMedia) {
		SocialMedia socialmedia = findById(idsocialMedia);
		if(socialmedia!=null) {
			getSession().delete(socialmedia);
		}
		
	}

	@Override
	public void updateSocialMedia(SocialMedia socialMedia) {
		getSession().update(socialMedia);
	}

	@Override
	public SocialMedia findByName(String name ) {
		
		return (SocialMedia)getSession().createQuery(
				"from SocialMedia where name = :name")
				.setParameter("name", name).uniqueResult();

	}

	@Override
	public SocialMedia findById(Long idSocialMedia) {
		
		return getSession().get(SocialMedia.class, idSocialMedia);
	
	}

}
