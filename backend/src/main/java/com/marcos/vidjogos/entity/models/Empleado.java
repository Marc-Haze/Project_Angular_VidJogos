package com.marcos.vidjogos.entity.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "empleado")
public class Empleado implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	long id;
	@Column(name = "name")
	String name;
	@Column(name = "job")
	String job;
	@Column(name = "image")
	String image;

	
	//Getters y Setters
	public long getId() { 
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	//Constructor
	public Empleado(long id, String name, String job, String image) {
		super();
		this.id = id;
		this.name = name;
		this.job = job;
		this.image = image;
	}

	public Empleado() {}
	
	
}

