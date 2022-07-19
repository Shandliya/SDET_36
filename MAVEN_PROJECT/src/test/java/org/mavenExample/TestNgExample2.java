package org.mavenExample;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNgExample2 {
	
	@Test
	public void practice3Test()
	{
	Reporter.log("Tyss--> test3",true);	
	}
	@Test
	
	public void practice4Test()
	{
		Reporter.log("Tyss-->test4",true);
		String url = System.getProperty("URL");
		System.out.println("url");
		String pwd = System.getProperty("PASSWORD");
		System.out.println("pwd");
		String hii = System.getProperty("hii Anuprita");
		System.out.println("good evening Anu");
		String hii = System.getProperty("hii");
		System.out.println("good evening");
		System.out.println("good afternoon");
		
	}
	

}
