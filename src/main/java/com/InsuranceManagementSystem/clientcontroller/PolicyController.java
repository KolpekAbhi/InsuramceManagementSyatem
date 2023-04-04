package com.InsuranceManagementSystem.clientcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.InsuranceManagementSystem.cliententity.PolicyData;
import com.InsuranceManagementSystem.clientservice.PolicyService;

@RestController
public class PolicyController {

	
	@Autowired
	PolicyService ps;
	
	@PostMapping("/insert")
	public String insertdata(@RequestBody PolicyData policydata)
	{
		return ps.insertdata(policydata);
	}
}
