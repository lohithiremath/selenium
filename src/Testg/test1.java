package Testg;

import org.testng.Reporter;
import org.testng.annotations.Test;

import net.bytebuddy.build.Plugin.Factory.UsingReflection.Priority;

public class test1 {
	@Test(priority = 1,invocationCount = 2)
	
	public void calls()
	{
		 
		Reporter.log("calls",true);
	}
	
     @Test(priority = 0,invocationCount = 3,enabled = false)
	
	public void setting()
	{
		Reporter.log("setting",true);
	}
     @Test (priority = 0,invocationCount = 3)
 	
 	public void chats()
 	{
 		Reporter.log("chats",true);
 	}

}
