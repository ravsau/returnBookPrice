
public class Book {


	private String title; 
	private String author; 
	private String info; 
	private double price;
	private Boolean isInStock;




	public Book(){


	}

	public Book(String title, String author, String info, double price, Boolean isInStock){

		this.title=title; 
		this.author=author;; 
		this.info=info; 
		this.price=price;
		this.isInStock=isInStock;

	}

	public void setTitle(String title){

		this.title=title;

	}

	public String getTitle(){

		return title;

	}

	public void setAuthor(String author){

		this.author=author;

	}

	public String getAuthor(){

		return author;

	}

	public void setInfo(String info){

		this.info=info;

	}

	public String getInfo(){

		return info;

	}

	public void setPrice(double price){

		this.price=price;

	}

	public double getPrice(){

		return price;

	}

	public void setAvailable(Boolean is){

		this.isInStock=is;

	}

	public Boolean getAvailable(){

		return isInStock;

	}



}

/*Create a project in Eclipse called BookApplication

Create a Book class that allows for Book title, author, description, price and isInStock variables

The Book class shall contain private member variables, a default constructor, an overloaded constructor 
and a method called getDisplayText() which prints the author, title and description.



The application shall also contain getters and setters for each private member variable.

Create another class called BookApp which contains the main method. In the main method you shall 
create an instance of a Book and print the Author, Title and Description.

 */