package com.InsuranceManagementSystem.clientservice;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.InsuranceManagementSystem.cliententity.ClientData;
import com.InsuranceManagementSystem.clientrepository.ClientRepository;

@Service
public class ClientService {

	@Autowired
	ClientRepository cr;
	
	public String insertclientdata(ClientData clientdata) {

		return cr.insertclientdata(clientdata);
	}

	public List<ClientData> getdata() {

		return cr.getdata();
	}

	public String updatedata(int id, ClientData clientdata) {


		return cr.updatedata(id,clientdata);
	}

	public List<ClientData> getbyid(int id) {

		return cr.getbyid(id);
	}

	public String deletedata(int id) {

		return cr.deletedata(id);
	}
	

}
