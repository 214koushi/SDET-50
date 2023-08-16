package practice;

import org.testng.annotations.Test;

public class CreateEmp {

	
	@Test(groups = "smoke")
	public void AddEmpl() {
		System.out.println("Added new Employee");
	}

	@Test(groups = "regression")
	public void EditEmpl() {
		System.out.println("Employee Edited");
	}
		
}
