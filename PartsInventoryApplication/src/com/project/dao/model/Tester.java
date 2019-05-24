package com.project.dao.model;

import com.project.model.Parts;

public class Tester {
	
	public static void main(String[] args) {
		
		PartsImplementation partImp=new PartsImplementation();
		
		Parts parts1=new Parts("12-12-12","Laptop", "123456", "XXX1234");
		
		Parts part2=new Parts("01-01-2020","Yoga Laptop","98765","SKUXXX999");
		
	
		partImp.addParts(part2); 	
		
		
	}

}
