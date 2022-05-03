package net.java.bookmanagement.model;

public class Book {
	protected int id;
    protected String name;
    protected String author;
  

    public Book() {}

    public Book(String name, String author) {
        super();
        this.name = name;
        this.author = author;
        
    }

   

    public Book(int id, String name, String author) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
	}

	public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    
   
}
