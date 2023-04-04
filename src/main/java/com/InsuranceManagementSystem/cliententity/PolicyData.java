package com.InsuranceManagementSystem.cliententity;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;



@Entity
public class PolicyData {

	private String policy_number; 
	private String policy_type; 
	private String coverage_amount;
	private boolean premium; 
	private String start_date; 
	private String end_date;
	
	@ManyToOne
	private ClientData clientdata;
	
	
	@Id
	public String getPolicy_number() {
		return policy_number;
	}
	public void setPolicy_number(String policy_number) {
		this.policy_number = policy_number;
	}
	public String getPolicy_type() {
		return policy_type;
	}
	public void setPolicy_type(String policy_type) {
		this.policy_type = policy_type;
	}
	public String getCoverage_amount() {
		return coverage_amount;
	}
	public void setCoverage_amount(String coverage_amount) {
		this.coverage_amount = coverage_amount;
	}
	public boolean isPremium() {
		return premium;
	}
	public void setPremium(boolean premium) {
		this.premium = premium;
	}
	public String getStart_date() {
		return start_date;
	}
	public void setStart_date(String start_date) {
		this.start_date = start_date;
	}
	public String getEnd_date() {
		return end_date;
	}
	public void setEnd_date(String end_date) {
		this.end_date = end_date;
	}
	
	public ClientData getClientdata() {
		return clientdata;
	}
	public void setClientdata(ClientData clientdata) {
		this.clientdata = clientdata;
	}
	
	@Override
	public String toString() {
		return "PolicyData [policy_number=" + policy_number + ", policy_type=" + policy_type + ", coverage_amount="
				+ coverage_amount + ", premium=" + premium + ", start_date=" + start_date + ", end_date=" + end_date
				+ ", clientdata=" + clientdata + "]";
	}

	
}
