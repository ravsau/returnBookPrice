
public class BookApp {

	public static void main(String[] args) {

		Book a =new Book();
		a.setTitle("A tale of Two Cities");
		a.setAuthor("Charles Dickens");
		a.setInfo("It's a story about Two Cities");
		a.setPrice(55.77);
		a.setAvailable(true);


		Book b=new Book("Siddhartha","Herman Hesse","Philosophical book about a man's search for meaning",10,false);



		System.out.println(a.getTitle());

		System.out.println(a.getAuthor());

		System.out.println(a.getInfo());

		System.out.println("$ "+a.getPrice());

		System.out.println("Available: "+a.getAvailable());

		System.out.println("---------------------------------");

		System.out.println(b.getTitle());

		System.out.println(b.getAuthor());

		System.out.println(b.getInfo());

		System.out.println("$ "+b.getPrice());

		System.out.println("Available: "+b.getAvailable());


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
