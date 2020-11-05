package com.ListnersDemo;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGListner implements ITestListener {

	public void onTestStart(ITestResult result) {
		
		System.out.println("Test case onTestStart "+result.getName());
	}
//sucess
	public void onTestSuccess(ITestResult result) {
		
		System.out.println("Test case onTestSuccess "+result.getName());
	}

//fail
	public void onTestFailure(ITestResult result) {
		
		System.out.println("Test case onTestFailure "+result.getName());

	}

	public void onTestSkipped(ITestResult result) {

		System.out.println("Test case onTestSkipped"+result.getName());
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

		System.out.println("Test case onTestFailedButWithinSuccessPercentage"+result.getName());
	}

	public void onStart(ITestContext context) {
		System.out.println("Test case onStart"+context.getName());
	}

	public void onFinish(ITestContext context) {
		System.out.println("Test case onFinish"+context.getName());
	}

}
