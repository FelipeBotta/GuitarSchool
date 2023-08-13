package com.obj;

public class Student extends Finance {
	
	
	int id;
	private String name;
	private String contact;
	private String instrument;
	


	public void Student() {
		
	}
	
	public void Student(String name, String contact, String instrument) {
		this.name = name;
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
	
	public void setId(int id) {
		this.id = id;
		
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
        return "Student [id=" + id + ", name=" + name + ", contact=" + contact + ", instrument=" + instrument + "]";
    }


	
	

}
