package com.cisc181.core;

import java.util.UUID;

public class Enrollment {
	public UUID SectionID;
	public UUID StudentID;
	public UUID EnrollmentID;
	public double Grade;
	
	public double getGrade() {
		return Grade;
	}

	private Enrollment() {
		this.SectionID = UUID.randomUUID();
		this.StudentID = UUID.randomUUID();
		this.EnrollmentID = UUID.randomUUID();
	}
	
	public Enrollment(UUID studentID, UUID sectionID) {
		this.StudentID = studentID;
		this.SectionID = sectionID;
		this.EnrollmentID = UUID.randomUUID();
		
	}
	
	public void setGrade(double Garde) {
		this.Grade = Grade;
	}
}
