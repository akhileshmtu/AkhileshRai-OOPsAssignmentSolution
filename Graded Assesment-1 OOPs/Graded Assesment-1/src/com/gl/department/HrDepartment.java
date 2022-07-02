package com.gl.department;

public class HrDepartment extends SuperDepartment // HrDepartment Extend Class SuperDedpartment
{

	public String departmentName() {

		return "Hr Department"; // override departmentName

	}

	public String getTodaysWork() {

		return "Fill today's worksheet and mark your attendance";	// override getTodaysWork
	}

	public String getWorkDeadline() {

		return "Complete by EOD";	// override getWorkDeadline
	}

	public String doActivity() {

		return "team Lunch";	// override doActivity

	}
}
