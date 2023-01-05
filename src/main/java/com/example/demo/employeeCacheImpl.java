package com.example.demo;

import java.util.ArrayList;
import java.util.List;

public class employeeCacheImpl implements employeeCache {
	//employeeDTO dto=new employeeDTO();
	List<employee> emp=new ArrayList<>();

	@Override
	public void start() {
		// TODO Auto-generated method stub

	}

	@Override
	public void push(List<employee> employees) {
		if(!employees.isEmpty()) {
			emp.addAll(employees);
		}
	}

	@Override
	public void finish() {
		// TODO Auto-generated method stub

	}

	@Override
	public int fetchCount(String department) {
		int count=0;
		for(employee e : emp) {
			if(e.getDepartment().equals(department)) {
				count++;
			}
		}		
		
		return count;
	}

}
