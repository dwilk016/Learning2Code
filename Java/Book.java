class Book{
	private int isbn;
	private String title;
	private String author;
	private String publisher;

	Book(int isbn, String title, String author, String publisher){
		this.isbn = isbn;
		this.title = title;
		this.author = author;
		this.publisher = publisher;
	}

	void setIsbn(int isbn){
		this.isbn = isbn;
	}	
	int getIsbn(){
		return isbn;
	}

	void setTitle(String title){
		this.title = title;
	}
	String getTitle(){
		return title;
	}

	void setAuthor(String author){
		this.author = author;
	}
	String getAuthor(){
		return author;
	}

	void setPublisher(String publisher){
		this.publisher = publisher;
	}		
	String getPublisher(){
		return publisher;
	}

	void printBook(){
		System.out.printf("%-20s %-20s%n", title, author);
		System.out.printf("%-20d %-20s%n%n", isbn, publisher);
	}



}