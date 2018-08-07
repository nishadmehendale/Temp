package com.cg.resumebuilder;

import java.time.LocalDate;

public class Candidate {
	private String firstName, lastName, gender, highestQualification, hobbies, address, website;
	private String date;
	private String contactNumber;
	private String[] skills;
	public Candidate(String firstName, String lastName, String gender, String highestQualification, String hobbies,
			String address, String website, String string, String string2, String[] skills) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.highestQualification = highestQualification;
		this.hobbies = hobbies;
		this.address = address;
		this.website = website;
		this.date = string;
		this.contactNumber = string2;
		this.skills = skills;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getGender() {
		return gender;
	}
	public String getHighestQualification() {
		return highestQualification;
	}
	public String getHobbies() {
		return hobbies;
	}
	public String getAddress() {
		return address;
	}
	public String getWebsite() {
		return website;
	}
	public String getDate() {
		return date;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public String[] getSkills() {
		return skills;
	}
	
}

