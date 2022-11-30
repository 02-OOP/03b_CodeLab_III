package com.cc.java;

public class Person {
	
	private String familyName;
	private String firstName;
	private int birthYear;
	
	/**
	 * 
	 * @param familyName: Familienname des MA
	 * @param firstName : Vorname des MA 
	 * @param birthYear : Geburtsjahr MA
	 */
	public Person(String familyName, String firstName, int birthYear) {		
		this.familyName = familyName;
		this.firstName = firstName;
		this.birthYear = birthYear;
	}

	//-----------------  Getter / Setter --------------//

	/**
	 * Getters
	 * @return familyName  // Familienname MA
	 * @return fistName // Vorname MA
	 * @return birthYear // Geburtsjahr MA
	 * 
	 */
	protected String getFamilyName() {
		return familyName;
	}
	
	protected String getFirstName() {
		return firstName;
	}

	protected int getBirthYear() {
		return birthYear;
	}


	/**
	 * Setter
	 * @param name // Familienname MA
	 */

	protected void setFamilyName(String familyName) {
		this.familyName = familyName;
	}
	
	//----------------- Methoden --------------//
	
	/**
	 *  Ausgabe --> production
	 */
	protected String getPersonalData() {
		return "Hi, I'm " + firstName + " " + familyName + " & I was born in "+  this.birthYear + ".";		
	}

}
