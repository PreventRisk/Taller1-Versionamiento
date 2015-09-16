/* package whatever;
don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public abstract class User
{
	private static String lastname;
	private static String name;
	private static String username;
	private static String password;
	private static int age;
	
	
	public User(String name, String lastname, int age, String username, String password){
		this.name = name;
		this.lastname = lastname;
		this.username = username;
		this.password = password;
		this.age = age;
	}

	public static void getter_name(){
		return this.name;
	}
}