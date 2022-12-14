package eshop.beans;

public class CartItem {
  private String author;
  private String title;
  private double price;
  private String bookID;
  private String quantity;
  private String ISBN;

	public CartItem(Book book, int quantity) {
		bookID = book.getId();
		ISBN = book.getISBN();
		title = book.getTitle();
		author = book.getAuthor();
		price = book.getPrice();
		this.quantity = new Integer(quantity).toString();
	  }

	public String getAuthor() { return author; }
	public void setAuthor(String author) { this.author = author; }

	public String getISBN() { return ISBN; }
	public void setISBN(String ISBN) { this.ISBN = ISBN; }
	
	public String getTitle() { return title; }
	public void setTitle(String title) { this.title = title; }

	public double getPrice() { return price; }
	public void setPrice(double price) { this.price = price; }

	public String getBookID() { return bookID; }
	public void setBookId(String bookID) { this.bookID = bookID; }

	public String getQuantity() { return quantity; }
	public void setQuantity(String quantity) { this.quantity = quantity; }
  }
