package org.auto.learning_project.utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class CaptureScreenshot 
{
	public static void evidence(WebDriver driver, String name) throws Exception
	{
	try
	{
		TakesScreenshot ts = (TakesScreenshot) driver;  
		/*
Purpose: This line is used to cast the WebDriver instance (driver) to the TakesScreenshot interface.
Explanation:TakesScreenshot is an interface in Selenium that provides the method getScreenshotAs() to capture screenshots.
(TakesScreenshot) is a typecast because WebDriver does not directly provide the getScreenshotAs() method.
driver is the WebDriver instance controlling the browser.After this line, the ts object can be used to capture screenshots.
		*/
		
		File srcFile = ts.getScreenshotAs(OutputType.FILE);
		// Specify the destination where the screenshot will be saved
		/*
Purpose: Captures the screenshot and stores it as a file object.
Explanation:ts.getScreenshotAs() is the method to capture the screenshot.
OutputType.FILE specifies that the screenshot should be returned as a File object.
The captured screenshot is temporarily saved in a file object called srcFile.
		*/
		
		File destFile = new File("./Screenshot/" + name + ".png");
		// Save the screenshot to the specified location
		/*
Purpose: Specifies the destination path and filename for saving the screenshot.
Explanation:new File() creates a new File object representing the destination location.
"./Screenshot/" indicates a directory named "Screenshot" in the project root directory.
name is a variable (presumably defined elsewhere in the code) holding the name of the screenshot file.
".png" specifies the file format for the screenshot.
The resulting file path will look like ./Screenshot/example.png (if name = "example").	
*/		
		
		FileUtils.copyFile(srcFile, destFile);
/*
Purpose: Copies the temporary screenshot file (srcFile) to the specified destination (destFile).
Explanation:FileUtils is a utility class from the Apache Commons IO library.
copyFile() is a method that copies the contents of the source file to the destination file.
After this line, the screenshot is saved permanently at the specified destination path.
 */
		
		System.out.println("Screenshot taken and saved as" + name + ".png");//+ destFile.getPath()
	}
	catch (IOException e) 
	{
		System.out.println("An error occurred while saving the screenshot: " + e.getMessage());
	} finally 
	{
		// Close the browser
		driver.quit();		
	}
}

}
/* Summary of Workflow:
Cast the WebDriver instance to TakesScreenshot to access the getScreenshotAs() method.
Capture the screenshot and store it as a temporary file.
Specify the desired destination and filename for the screenshot.
Copy the temporary file to the destination, saving the screenshot.
*/

	
