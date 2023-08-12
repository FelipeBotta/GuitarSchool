package com.obj;

public class Student extends Finance {
	
	private static int SEQUENTIAL =1;
	
	int id;
	private String name;
	private String contact;
	private String instrument;
	
	public void Student() {
		
	}
	
	public void addStudent(String name, String contact, String instrument) {
		Student aluno = new Student();
		this.id = SEQUENTIAL++;
		this.setName(name);
		this.contact = contact;
		this.instrument = instrument;
		
		
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}


	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getInstrument() {
		return instrument;
	}

	public void setInstrument(String instrument) {
		this.instrument = instrument;
	}
	
	@Override
	public String toString() {
		return "Student [getName()=" + getName() + ", getId()=" + getId() + ", getContact()=" + getContact()
				+ ", getInstrument()=" + getInstrument() + "]";
	}


	
	

}
