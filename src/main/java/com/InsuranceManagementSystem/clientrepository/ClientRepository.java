package com.InsuranceManagementSystem.clientrepository;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.InsuranceManagementSystem.cliententity.ClientData;

@Repository
public class ClientRepository {

	@Autowired
	SessionFactory sf;
	
	public String insertclientdata(ClientData clientdata) {

       Session s = sf.openSession();
       Transaction tr = s.beginTransaction();
       
      
      s.save(clientdata);
      tr.commit();
	  return "Data Added Successfully";
	}

	public List<ClientData> getdata() {

		Session s = sf.openSession();
		Criteria c = s.createCriteria(ClientData.class);
		return c.list();
	}

	public String updatedata(int id, ClientData clientdata) {

    Session s = sf.openSession();
    Transaction tr = s.beginTransaction();
    
    ClientData c = s.get(ClientData.class, id);
    
    c.setFirst_Name(clientdata.getFirst_Name());
    c.setId(clientdata.getId());
    c.setLast_Name(clientdata.getLast_Name());
    c.setDOB(clientdata.getDOB());
    c.setAddress(clientdata.getAddress());
    c.setContact(clientdata.getContact());
    
    s.save(c);
    tr.commit();
    
     return "Update Data Successfully";
	}

	
	public List<ClientData> getbyid(int id) {

		Session s = sf.openSession();
		Criteria c = s.createCriteria(ClientData.class);
		c.add(Restrictions.eq("id", id));
		return c.list();
	}

	public String deletedata(int id) {


		Session s = sf.openSession();
		Transaction tr = s.beginTransaction();
		
		ClientData c = s.get(ClientData.class, id);
		s.delete(c);
		tr.commit();
		
		return "Delete Data Successfully..!!";
	}

}
