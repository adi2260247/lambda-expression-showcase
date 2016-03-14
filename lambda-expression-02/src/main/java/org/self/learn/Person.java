package org.self.learn;

import java.time.LocalDate;

public class Person {

	public enum Sex {
		MALE, FEMALE;
	}
	
	private String name;
	private LocalDate dob;
	private Sex gender;
	private String emailAddress;
	
	public Person(String name, LocalDate dob, Sex gender, String emailAddress) {
		this.name = name;
		this.dob = dob;
		this.gender = gender;
		this.emailAddress = emailAddress;
	}
	
	public String getName() {
		return name;
	}
	public LocalDate getDob() {
		return dob;
	}
	public Sex getGender() {
		return gender;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	
}
