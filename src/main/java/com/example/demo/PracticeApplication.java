package com.example.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PracticeApplication {

	public static void main(String[] args) {
		employeeCache empInter = new employeeCacheImpl();
		List<employee> input = new ArrayList<>();
		Scanner in = new Scanner(System.in);

		while(true) {
			System.out.println("Enter Employee Name");
			String name=in.nextLine();
			if(name.equals("exit")) {
				break;
			}
			System.out.println("Enter Employee Department");
			String department=in.nextLine();			
			employee e = new employee();
			e.setName(name);
			e.setDepartment(department);
			input.add(e);			
		}
		empInter.push(input);
		
		SpringApplication.run(PracticeApplication.class, args);
		empInter.push(input);
		int count=empInter.fetchCount("d1");
		System.out.println("d1EMPLOYEE COUNT = "+count);
	}

}
