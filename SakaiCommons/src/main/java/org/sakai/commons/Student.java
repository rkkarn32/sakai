package org.sakai.commons;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Student extends Person{
	
	@ManyToMany
	@JoinTable(name="Student_Section",
			joinColumns={@JoinColumn(name="student_id")},
			inverseJoinColumns={@JoinColumn(name="section_id")}
	)
	private List<Section> sections;
	
	@ManyToOne
	private Teacher advisor;
	
	private int rollNum;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	public Student(String name, String phone, String email,Address address,int rollNum,UserCredential user) {
		super(name, phone, email, address);
		this.rollNum=rollNum;
		setUser(user);
	}
	public void addSection(Section section){
		this.sections.add(section);
	}
	public List<Section> getSections() {
		return sections;
	}
	public void setSections(List<Section> sections) {
		this.sections = sections;
	}
	public Teacher getAdvisor() {
		return advisor;
	}
	public void setAdvisor(Teacher advisor) {
		this.advisor = advisor;
	}
	public int getRollNum() {
		return rollNum;
	}
	public void setRollNum(int rollNum) {
		this.rollNum = rollNum;
	}
	
	
}
