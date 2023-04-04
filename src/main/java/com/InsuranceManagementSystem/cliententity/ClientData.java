package com.InsuranceManagementSystem.cliententity;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ClientData {

	private int id ;
	private String First_Name ;
	private String last_Name;
	private String DOB ;
	private String Address;
	private String contact;
	
	
   
	@Id 
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirst_Name() {
		return First_Name;
	}

	public void setFirst_Name(String first_Name) {
		First_Name = first_Name;
	}

	public String getLast_Name() {
		return last_Name;
	}

	public void setLast_Name(String last_Name) {
		this.last_Name = last_Name;
	}

	public String getDOB() {
		return DOB;
	}

	public void setDOB(String dOB) {
		DOB = dOB;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	

	@Override
	public String toString() {
		return "ClientData [id=" + id + ", First_Name=" + First_Name + ", last_Name=" + last_Name + ", DOB=" + DOB
				+ ", Address=" + Address + ", contact=" + contact + "]";
	}

}
