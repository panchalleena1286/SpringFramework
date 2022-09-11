package com.spring.assignment;

public class Test {
	
	int testId;
	String testTitle;
	int testMarks;
	
	public Test() {
		
	}

	public Test(int testId, String testTitle, int testMarks) {
		super();
		this.testId = testId;
		this.testTitle = testTitle;
		this.testMarks = testMarks;
	}

	public int getTestId() {
		return testId;
	}

	public void setTestId(int testId) {
		this.testId = testId;
	}

	public String getTestTitle() {
		return testTitle;
	}

	public void setTestTitle(String testTitle) {
		this.testTitle = testTitle;
	}

	public int getTestMarks() {
		return testMarks;
	}

	public void setTestMarks(int testMarks) {
		this.testMarks = testMarks;
	}

	@Override
	public String toString() {
		return "testId=" + testId + ", testTitle=" + testTitle + ", testMarks=" + testMarks;
	}
	
	

}
