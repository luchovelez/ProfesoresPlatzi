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
@Table(name="curso")
public class Course implements Serializable {
	
	
	@Id
	@Column(name="ID_curso")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idCurso;
	
	@Column(name="nombre")
	private String name;
	
	@Column(name="tema")
	private String themes;
	
	@Column(name="proyecto")
	private String proyect;
	
	@ManyToOne(optional=true,fetch=FetchType.EAGER)
	@JoinColumn(name="ID_profesor")
	private Teacher teacher;
	

	
	
	
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Course(String name, String themes, String proyect) {
		super();
		this.name = name;
		this.themes = themes;
		this.proyect = proyect;
		
		
	}


	public Long getIdCurso() {
		return idCurso;
	}
	public void setIdCurso(Long idCurso) {
		this.idCurso = idCurso;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getThemes() {
		return themes;
	}
	public void setThemes(String themes) {
		this.themes = themes;
	}
	public String getProyect() {
		return proyect;
	}
	public void setProyect(String proyect) {
		this.proyect = proyect;
	}
	public Teacher getTeacher() {
		return teacher;
	}
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}



	

}
