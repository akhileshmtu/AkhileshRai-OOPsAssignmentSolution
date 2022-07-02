package com.gl.driver;

import com.gl.department.AdminDepartment;// Import AdminDepartment Class from Department Package
import com.gl.department.HrDepartment;// Import HrDepartment Class from Department Package
import com.gl.department.TechDepartment;//Import TechDepartment Class from Department Package

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AdminDepartment admin = new AdminDepartment(); // Creating object for Class AdminDepartment
		System.out.println("Welcome to " + admin.departmentName());
		System.out.println(admin.getTodaysWork());	// printing method
		System.out.println(admin.getWorkDeadline());// printing method
		System.out.println(admin.isTodayAHoliday() + "\n");// printing method and create next line space

		HrDepartment hr = new HrDepartment(); // Creating object for Class HrDepartment
		System.out.println("Welcome to " + hr.departmentName());
		System.out.println(hr.doActivity());// printing method
		System.out.println(hr.getTodaysWork());// printing method
		System.out.println(hr.getWorkDeadline());// printing method
		System.out.println(hr.isTodayAHoliday() + "\n");// printing method and create next line space

		TechDepartment tech = new TechDepartment(); // Creating object for Class TechDepartment
		System.out.println("Welcome to " + tech.departmentName());
		System.out.println(tech.getTodaysWork());// printing method
		System.out.println(tech.getWorkDeadline());// printing method
		System.out.println(tech.getTechStackInformation());// printing method
		System.out.println(tech.isTodayAHoliday());// printing method

	}

}
