package com.platzi.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table(name="redsocial")
public class SocialMedia implements Serializable {
	
	@Id
	@Column(name="ID_red")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long idSocialMedia;
	
	@Column(name="nombre")
	private String name;
	
	@Column(name="icono")
	private String icon;
	
	@OneToMany
	@JoinColumn(name="ID_red")
	private Set<TeacherSocialMedia> teacherSocialMedias;
	

	public SocialMedia(String name, String icon) {
		super();
		this.name = name;
		this.icon = icon;
	}



	public long getIdSocialMedia() {
		return idSocialMedia;
	}



	public void setIdSocialMedia(long idSocialMedia) {
		this.idSocialMedia = idSocialMedia;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getIcon() {
		return icon;
	}



	public void setIcon(String icon) {
		this.icon = icon;
	}



	public SocialMedia() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Set<TeacherSocialMedia> getTeacherSocialMedias() {
		return teacherSocialMedias;
	}



	public void setTeacherSocialMedias(Set<TeacherSocialMedia> teacherSocialMedias) {
		this.teacherSocialMedias = teacherSocialMedias;
	}
	
	
	
	

}
