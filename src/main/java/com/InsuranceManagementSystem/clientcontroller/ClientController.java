package com.InsuranceManagementSystem.clientcontroller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.InsuranceManagementSystem.cliententity.ClientData;
import com.InsuranceManagementSystem.clientservice.ClientService;

@RestController
public class ClientController {
	
	
	@Autowired
	ClientService cs;
	
	@PostMapping("/insert")
	public String insertclientdata(@RequestBody ClientData clientdata)
	{
        return	cs.insertclientdata(clientdata);
	}

	@GetMapping("/get")
	public List<ClientData> getdata()
	{
		return cs.getdata();
	}
	
	@GetMapping("/value/{id}")
	public List<ClientData> getbyid(@PathVariable int id)
	{
		return cs.getbyid(id);
	}
	
	@PutMapping("/update/{id}")
	public String updatedata(@PathVariable int id , @RequestBody ClientData clientdata)
	{
		return cs.updatedata(id,clientdata);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deletedata(@PathVariable int id)
	{
		return cs.deletedata(id);
	}
	
}
