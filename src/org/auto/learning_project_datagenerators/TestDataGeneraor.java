package org.auto.learning_project_datagenerators;

import org.testng.annotations.DataProvider;

public class TestDataGeneraor 
{

	
	@DataProvider(name="staticdata")
	public Object[] [] testdata()
	{
		Object[] [] data = {{"nepal@gmail.com"},{"nepal123"}};    //2-D array
				return data;
	}
			
}
