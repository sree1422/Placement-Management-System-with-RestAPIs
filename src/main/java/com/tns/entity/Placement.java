package com.tns.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="placement_details")
public class Placement {
	@Id
	@Column(name="tns_id")
	private String id;
	@Column(name="student_name")
	private String name;
	@Column(name="student_qualification")
	private String qualification;
	@Column(name="placed_year")
	private Integer year;
	public String getid() {
		return id;
	}
	public void setid(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public Integer getYear() {
		return year;
	}
	public void setYear(Integer year) {
		this.year = year;
	}
	@Override
	public String toString() {
		return "Placement [id=" + id + ", name=" + name + ", qualification=" + qualification + ", year=" + year + "]";
	}
	public Placement(String id, String name, String qualification, Integer year) {
		super();
		this.id = id;
		this.name = name;
		this.qualification = qualification;
		this.year = year;
	}
	public Placement() {
		super();
	}
	
}
