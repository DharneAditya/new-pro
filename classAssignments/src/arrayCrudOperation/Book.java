package arrayCrudOperation;

public class Book {

	private int id,copyNo;
	private String name, author;
	
	Book(int id,int copyNO,String name,String author)
	{
		
		this.id=id;
		this.copyNo=copyNO;
		this.name=name;
		this.author=author;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCopyNo() {
		return copyNo;
	}

	public void setCopyNo(int copyNo) {
		this.copyNo = copyNo;
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
	
	
	public String toString()
	{
		return id+" "+copyNo+" "+name+" "+author;
	}
	
	
	
}
