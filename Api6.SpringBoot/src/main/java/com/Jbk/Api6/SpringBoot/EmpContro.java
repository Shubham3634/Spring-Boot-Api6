package com.Jbk.Api6.SpringBoot;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/abc")
public class EmpContro {
	
	@PostMapping("/addemployee")
	public ResponseEntity<String> showEmployee(@RequestBody Employee emp) {
			
		System.out.println("Employee Name:"+emp.getName());
		System.out.println("Phone No:"+emp.getPhoneno());
		System.out.println("Department:"+emp.getDepartmentit());
		System.out.println("Emp Id:"+emp.getCid());
		System.out.println("Data reading Succesfull..!");
		
		
		return new ResponseEntity<>("Employee Added Sucessfully", HttpStatus.OK);
	}
}
