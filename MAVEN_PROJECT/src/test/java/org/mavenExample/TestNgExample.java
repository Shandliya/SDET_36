package org.mavenExample;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNgExample {
	@Test
	public void practice1Test()
	{
	Reporter.log("Tyss--> test",true);	
	}
	@Test
	public void practice2Test()
	{
		String BROWSER = System.getProperty("browser");
		String URL = System.getProperty("url");
		System.out.println("----->browser is"+BROWSER+"---->url is"+URL);
		Reporter.log("Tyss-->test3",true);
		System.out.println("hiiiii");
		System.out.println("heyyy Hello");
		System.out.println("hii anu");
		System.out.println("hii RUPESH");
		
		
		//hello good evening
		//hello good night
		//hai r
	System.out.println("byee");
		
		
	}
	

}
