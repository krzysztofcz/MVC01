package pl.coderslab.controller;

public class Book {
	private String title;
	private String author;
	private int isbn;
	/**
	 * @param title
	 * @param author
	 * @param isbn
	 */

	public Book(String title, String author, int isbn) {
		this.title = title;
		this.author = author;
		this.isbn = isbn;
	}
	
	public String toString() {
		return (this.getTitle()+","+this.getAuthor()+" "+this.getIsbn());
	}
	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * @return the author
	 */
	public String getAuthor() {
		return author;
	}
	/**
	 * @param author the author to set
	 */
	public void setAuthor(String author) {
		this.author = author;
	}
	/**
	 * @return the isbn
	 */
	public int getIsbn() {
		return isbn;
	}
	/**
	 * @param isbn the isbn to set
	 */
	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}
}
