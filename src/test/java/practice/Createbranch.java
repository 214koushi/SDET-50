package practice;

import org.testng.annotations.Test;

public class Createbranch {

@Test(groups = "smoke")
public void AddBranch() {
	System.out.println("Added");
}

@Test(groups = "regression")
public void EditBranch() {
	System.out.println("Edited");
}
	
}
