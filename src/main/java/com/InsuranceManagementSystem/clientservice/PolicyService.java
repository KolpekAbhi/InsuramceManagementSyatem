package com.InsuranceManagementSystem.clientservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.InsuranceManagementSystem.cliententity.PolicyData;
import com.InsuranceManagementSystem.clientrepository.PolicyRepository;

@Service
public class PolicyService {

	@Autowired
	PolicyRepository pr;
	
	public String insertdata(PolicyData policydata) {

		return pr.insertdata(policydata);
	}

}
