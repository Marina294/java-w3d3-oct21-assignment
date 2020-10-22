package marina1021w3d3assignment;
//title ---> Unknown
//firstname Author ---> John
//Lastname Author  ---> Doe
//int years   ---> < 1900
//double price

//Title: " "Author : firstname lastname published in year

public class Book {
//	instance variables
	private String title;
	private String firstNameAuthor;
	private String lastNameAuthor;
	private int years;
	private double price;
	
//	if
	public Book(String title, String firstNameAuthor, String lastNameAuthor, 
				int years, Double price) {
		if (title == "" || title == null) {
			this.title = "No name";
		} else {
			this.title = title;
		}
		
		if (firstNameAuthor == "" || firstNameAuthor == null) {
			this.firstNameAuthor = "Unknown";
		} else {
			this.firstNameAuthor = firstNameAuthor;
		}
		
		if (lastNameAuthor == "" || lastNameAuthor == null) {
			this.lastNameAuthor = "Unknown";
		} else {
			this.lastNameAuthor = lastNameAuthor;
		}
		
		if (years <= 1900) {
			this.years = 1900;
		} else {
			this.years = years;
		}

		if (price <= 0) {
			this.price = 0;
		} else {
			this.price = price; 	
		}
		
	}
		 /*
	     * @return title 
	     */
		public String getTitle() {
			return this.title;
		}	
		 /*
	     * @return first name 
	     */
		public String getFirstName() {
			return this.firstNameAuthor;
		}
		
	    /*
	     * @ return last name
	     */

		public String getLastName() {
			return this.lastNameAuthor;
		}	
		
	    /*
	     * @ return years
	     */		
		public int getYears() {
			return this.years;
		}
		
		
	    /*
	     * @ return price
	     */		
		
		public double getPrice() {
			return this.price;
		}			
		
		 /*
	     * Set
	     * @param 
	     */
		public void setTitle(String title) {
		if (title == "" || title == null) {
			this.title = "Unknown";
		} else {
			this.title = title;
		}
		}
		
		public void setFirstNameAuthor(String firstNameAuthor) {
			if(firstNameAuthor == "" || firstNameAuthor == null) {
			this.firstNameAuthor = "Unknown";
		} else {
			this.firstNameAuthor = firstNameAuthor;
		}
		}
		
		public void setLastNameAuthor(String lastNameAuthor) {
			if (lastNameAuthor == "" || lastNameAuthor == null) {
			this.lastNameAuthor = "Doe";
		} else {
				this.lastNameAuthor = lastNameAuthor;
		}
		}
		
		public void setYears(int years) {
			if (years >= 1900) {
				this.years = years;
			} else {
				this.years = 1900;
			}
		}
		
		
		public void setPrice(double price) {
			if (price >= 0) {
				this.price = price; 
			} else {
				this.price = 0;
			}
		}			
		
//		tax
		public double getTotalPrice() {
			double total = Math.floor((price + (price * 0.05)) * 100 / 100);
			return total;
		}
	}

