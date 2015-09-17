package software2;

import java.util.Date;

public class Forum {
	
	private String name="";
	private Date dateCreated;
	private String category = "";
	
	public void setName(String name) {
		this.name = name;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	public void setCategory(String category) {
		this.category = category;
	}
	
	public String getName() {
		return name;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public String getCategory() {
		return category;
	}



	public Forum(String n, Date d, String c){
		setName(n);
		setDateCreated(d);
		setCategory(c);
		
	}
	
}
