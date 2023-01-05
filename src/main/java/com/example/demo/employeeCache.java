package com.example.demo;

import java.util.List;

public interface employeeCache {
	
	public void start();
	
	public void push(List<employee> employees);
	
	public void finish();
	
	public int fetchCount(String department);
	

}
