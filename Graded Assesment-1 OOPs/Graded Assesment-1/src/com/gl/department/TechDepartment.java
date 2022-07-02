package com.gl.department;

public class TechDepartment extends SuperDepartment // TechDepartment Extend Class SuperDepartment
{

	public String departmentName() {

		return "Tech Department";	// override departmentName

	}

	public String getTodaysWork() {

		return "Complete coding of module 1";	// override getTodaysWork

	}

	public String getWorkDeadline() {

		return "Complete by EOD";	// override getWorkDeadline

	}

	public String getTechStackInformation() {

		return "Core Java";		// override getTechStackInformation

	}
}
