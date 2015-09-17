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

	public static String getter_name(){
		return this.name;
	}

	public static void setter_name(String new_name){
		this.name = new_name;
	}

	public static String getter_lastname(){
		return this.lastname;
	}

	public static void setter_lastname(String new_lastname){
		this.lastname = new_lastname;
	}

	public static String getter_username(){
		return this.username;
	}

	public static void setter_username(String new_username){
		this.username = new_username;
	}

	public static String getter_password(){
		return this.password;
	}

	public static void setter_password(String new_password){
		this.password = new_password;
	}

	public static int getter_age(){
		return this.age;
	}

	public static void setter_age(String new_age){
		this.age = new_age;
	}	


}