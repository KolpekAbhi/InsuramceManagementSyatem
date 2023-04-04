package com.InsuranceManagementSystem.cliententity;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class ClaimData {

	private String claim_number;
	private String description;
	private String claim_date;
	private String claim_status;
	
	@ManyToOne
	private PolicyData policydata;
	
	@Id
	public String getClaim_number() {
		return claim_number;
	}
	public void setClaim_number(String claim_number) {
		this.claim_number = claim_number;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getClaim_date() {
		return claim_date;
	}
	public void setClaim_date(String claim_date) {
		this.claim_date = claim_date;
	}
	public String getClaim_status() {
		return claim_status;
	}
	public void setClaim_status(String claim_status) {
		this.claim_status = claim_status;
	}
	
	public PolicyData getPolicydata() {
		return policydata;
	}
	public void setPolicydata(PolicyData policydata) {
		this.policydata = policydata;
	}
	
	@Override
	public String toString() {
		return "ClaimData [claim_number=" + claim_number + ", description=" + description + ", claim_date=" + claim_date
				+ ", claim_status=" + claim_status + ", policydata=" + policydata + "]";
	}
	
	
	
	
}
