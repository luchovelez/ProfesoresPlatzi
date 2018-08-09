package com.platzi.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="profesor_red")
public class TeacherSocialMedia implements Serializable {
	
	@Id
	@Column(name="ID_profesor_red")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idSocialMedia;
	
	@Column(name="nickname")
	private String nickname;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="ID_profesor")
	private Teacher teacher;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="ID_red")
	private SocialMedia socialMedia;
	
	
	
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public TeacherSocialMedia(Teacher teacher, SocialMedia socialMedia, String nickname) {
		super();
		this.teacher = teacher;
		this.socialMedia = socialMedia;
		this.nickname = nickname;
	}
	public TeacherSocialMedia() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getIdSocialMedia() {
		return idSocialMedia;
	}
	public void setIdSocialMedia(Long idSocialMedia) {
		this.idSocialMedia = idSocialMedia;
	}
	public Teacher getTeacher() {
		return teacher;
	}
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	public SocialMedia getSocialMedia() {
		return socialMedia;
	}
	public void setSocialMedia(SocialMedia socialMedia) {
		this.socialMedia = socialMedia;
	}
	
	
	
	
	

}
