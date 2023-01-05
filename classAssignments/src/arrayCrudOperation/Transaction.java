package arrayCrudOperation;
import java.util.Date;

import java.util.Arrays;

public class Transaction {

	private String bookName;
	private StudentL s[];
	
	private Date issueDate,returnDate;
	
	
	Transaction(String bookName,Date issueDate,Date returnDate,StudentL s[] )
	{
		this.bookName=bookName;
		this.issueDate=issueDate;
		this.returnDate=returnDate;
		this.s=s;
		
	}
	public Date getIssueDate() {
		return issueDate;
	}
	public void setIssueDate(Date issueDate) {
		this.issueDate = issueDate;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	
	
	
	public Date getReturnDate() {
		return returnDate;
	}
	public void setReturnDate(Date returnDate) {
		this.returnDate = returnDate;
	}
	public StudentL[] getS() {
		return s;
	}
	public void setS(StudentL[] s) {
		this.s = s;
	}

	
	
	public String toString()
	{
		return bookName+" "+issueDate+" "+returnDate+" "+Arrays.toString(s);
	}
	
	
	
	
	
}
