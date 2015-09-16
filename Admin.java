import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Admin extends User
{
	private static int level;
	private static double rating;
	
	public Admin(level, rating){
		this.level = level;
		this.rating = rating;
	}
	
	public getLevel(){
		return level;
	}
	
	public getRating(){
		return rating;
	}
	
}