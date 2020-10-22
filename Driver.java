package marina1021w3d3assignment;

public class Driver {
	public static void printBook(Book[] bookArray) {
		for (int i = 0; i < bookArray.length; i++) {
			System.out.println("Title: " + bookArray[i].getTitle() + " " +
					"Author: " + bookArray[i].getFirstName() + " " + bookArray[i].getLastName() + 
					"Years: " +  bookArray[i].getYears() + " " + 
					"Price: $" + bookArray[i].getPrice() + " " + "tax, Total: $" + bookArray[i].getTotalPrice()
								);
		}
	}
	
	public static void main(String[] args) {
		Book[] bArray = new Book[3];
		bArray[0] = new Book("", "Albert", "Dao", 2000, 40.20);
		bArray[1] = new Book("Momo", "Eric", "Smith", 1800, 4.55);	
		bArray[2] = new Book("Lord of the Rings", "J.R.R.", "Tolkien", 2020, 9.55);	
		
		printBook(bArray);
		
		
		bArray[0].setTitle("Harry Potter");
		
		bArray[0].setFirstNameAuthor("");
		bArray[0].setLastNameAuthor(null);
		
		bArray[1].setYears(2000);
		
		bArray[2].setPrice(100.00);
		
		System.out.println("\nPrinting the book after up date");
		printBook(bArray);
		
		
	}
}
