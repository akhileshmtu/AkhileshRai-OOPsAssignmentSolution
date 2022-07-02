package com.gl.department;

public class AdminDepartment extends SuperDepartment // AdminDepartment Extend class SuperDepertment
{

	public String departmentName() {

		return "Admin Department ";	// override departmentName
	}

	public String getTodaysWork() {

		return "Complete your documents Submission";	// override getTodaysWork
	}

	public String getWorkDeadline() {

		return "Complete by EOD";	// override getWorkDeadline
	}

}
