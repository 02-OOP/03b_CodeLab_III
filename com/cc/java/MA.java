package com.cc.java;
import java.time.LocalDate;

public class MA extends Person{
	
	protected String workID;
	protected String department;
	protected String role;
	protected int hiredYear;
	
	/**
	 * Konstruktor Klasse
	 * 
	
	 * @param workID		: MA-Nr, intern
	 * @param department	: Abteilung
	 * @param role			: Job
	 */
	
	public MA(String familyName, String firstName, int birthYear, String workID, String department, String role, int hiredYear) {
		super(familyName,firstName,birthYear);
		
		this.workID = workID;
		this.department = department;
		this.role = role;
		this.hiredYear = hiredYear;
				
	}
	
	//-----------------  Methoden --------------//	

	// Verhalten Lunch
	protected String hasLunch() {
		return "Hi, I'm " + getFirstName() + " " + getFamilyName() + " and I'm having lunch!";	
	}
	
	// Verhalten Arbeitsbeginn
	protected String startsWork() {
		return "Hi, I'm " + getFirstName() + " " + getFamilyName() + " and I'm starting my work at " + department + " department as a " + role + ".";		
	}
	
	// Verhalten Berechnung Betriebszugehörigkeit
	protected String getEmployedTime() {

		LocalDate today = LocalDate.now();
		int yearsPassed = today.getYear() - hiredYear;

		String yearString = "year";
		if (yearsPassed > 1) {yearString = "years";}
					
		return "Hi, I'm " + getFirstName() + " " + getFamilyName() + " and I've been working here since " + yearsPassed + " " + yearString +  ".";		
	}
	
	// Methode wird durch Subklassen überschrieben ... Polymorphie! 
	protected String doYourWork() {
		return null;
	}


}
