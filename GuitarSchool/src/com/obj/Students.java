package com.obj;

public class Students<String> extends Finance {
	
	private static int SEQUENTIAL =1;
	
	int id;
	private String name;
	String contact;
	String instrument;
	
	public Students(String name, String contact, String instrument) {
		super();
		this.id = SEQUENTIAL++;
		this.setName(name);
		this.contact = contact;
		this.instrument = instrument;
	}


	public Students() {
		// TODO Auto-generated constructor stub
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


	
	

}
