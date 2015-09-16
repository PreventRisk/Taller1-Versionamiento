import java.util.*;
import java.lang.*;
import java.io.*;

class Admin extends User
{
	private static int level;
	private static double rating;
	private static String lastname;
	private static String name;
	private static String username;
	private static String password;
	private static int age;
	
	public Admin(level, rating){
		this.level = level;
		this.rating = rating;
	}
	
	public int getLevel(){
		return level;
	}
	
	public double getRating(){
		return rating;
	}
	
	@Overload
	public static String getter_name(){
		return this.name;
	}

	
}