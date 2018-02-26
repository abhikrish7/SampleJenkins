package com.register.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.register.vo.StudentModel;

@RestController
@RequestMapping("/apps")
public class StudentController {
	
	@Autowired
	StudentModel studentDetails;
	
	@RequestMapping(value="getInfo", method=RequestMethod.GET)
	public StudentModel getStudentDetails() {
		
		studentDetails.setId("13MO04");
		studentDetails.setStudentclass("MTech");
		studentDetails.setAge(25);
		studentDetails.setCollege("PSG");
		studentDetails.setCity("Kovai");
		
		
		return studentDetails;
	}

}
