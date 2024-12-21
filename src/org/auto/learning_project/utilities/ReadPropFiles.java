  package org.auto.learning_project.utilities;


import java.io.FileReader;
import java.util.Properties;

public class ReadPropFiles 
{

	public static String readconfig(String key) throws Exception
	{
		FileReader fr = new FileReader("./DataFolder/config.properties");
		
		Properties prop = new Properties();
		prop.load(fr);
		return prop.get(key).toString();
		
	}
	
	public static String readelement(String key) throws Exception
	{
		FileReader fr = new FileReader("./DataFolder/element.properties");
		
		Properties prop = new Properties();
		prop.load(fr);
		return prop.get(key).toString();
		
	}
}
/* Defines a method to read a specific key-value pair from a .properties file named element.properties. 
 
public: The method is accessible from anywhere.
static: No object of the class is required to call this method; it can be called directly using the class name.
String: The method returns a string value, which is the value associated with the given key.
throws Exception: Declares that this method might throw an Exception, such as file handling or key-related errors.

Reading the Properties File:
FileReader fr = new FileReader("./DataFolder/element.properties");

Creates a FileReader object to read the file element.properties located in the ./DataFolder directory.
The FileReader reads the file character by character.

Loading Properties:
Properties prop = new Properties();
prop.load(fr);
A Properties object is instantiated.
The 'load' method reads the key-value pairs from the element.properties file and loads them into the 
Properties object (prop).
The file is expected to contain data in the format:
key1=value1
key2=value2
Fetching the Key's Value:

return prop.get(key).toString();
The get method retrieves the value associated with the provided key from the Properties object.
The toString() method ensures the returned value is a String.

Key Functionalities
Input: A string key for which the value is required.
Output: The corresponding value from the element.properties file as a String.
Example of element.properties File:
properties

username=admin
password=12345
url=http://example.com
Example Usage of the Method:

public class PropertiesExample {
    public static void main(String[] args) {
        try {
            String value = readelement("username");
            System.out.println("Value for 'username': " + value); // Output: admin
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
Potential Exceptions
FileNotFoundException: If element.properties does not exist in the specified path.
NullPointerException: If the specified key does not exist in the properties file, prop.get(key) will return null.
IOException: If there’s an issue reading the file.

-----------------------
'FileReader' is a Class to read files that extends the Superclass 'InputStreamReader'  
abd implements: Closeable, AutoCloseable, Readable 

Properties is a class commonly used for handling configuration or properties files. 
It extends the Hashtable class and stores key-value pairs, both as strings.

Superclass: Hashtable<Object, Object>
Implements: Map<Object, Object>, Cloneable, Serializable
Primarily used for managing application settings or configuration data.
Keys and values in a Properties object must be strings.
Often used with .properties files, which contain key-value pairs in the format:

Provides built-in methods for loading, saving, and modifying properties files.
*/