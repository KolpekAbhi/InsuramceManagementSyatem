package com.InsuranceManagementSystem.clientrepository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.InsuranceManagementSystem.cliententity.PolicyData;

@Repository
public class PolicyRepository {

	
	@Autowired
	SessionFactory sf;
	
	public String insertdata(PolicyData policydata) {

      Session s = sf.openSession();
      Transaction tr = s.beginTransaction();
      
      
      s.save(tr);
      tr.commit();
	  return "data Insert Successfully..!";
	}

}
