package com.demo.junit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.demo.junit1.App;
import com.demo.junit1.EmployeeDetails;

public class AppTest
{
App empLogic=new App();
EmployeeDetails empDetails=new EmployeeDetails();

@Test
public void testCalculateAppraisal(){
 empDetails.setName("Ashok");
 empDetails.setAge(27);
 empDetails.setMonthlySalary(2000d);
 double appraisal=empLogic.calculateAppraisal(empDetails);
 assertEquals(500, appraisal,0.0);
}

@Test
public void testCalculateYearlySalary(){
 empDetails.setName("Ashok");
 empDetails.setAge(27);
 empDetails.setMonthlySalary(9000d);
 double salary=empLogic.calculateYearlySalary(empDetails);
 assertEquals(108000,salary,0.0);
}
}