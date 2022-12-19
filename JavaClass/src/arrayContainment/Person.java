package arrayContainment;

import java.util.Arrays;

public class Person {

	private String id ;
	private String name ,address;
	IdProof i[];
	
	Person(String id,String name,String address,IdProof i[])
	{
		this.id=id;
		this.address=address;
		this.name=name;
		this.i=i;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public IdProof[] getI() {
		return i;
	}

	public void setI(IdProof[] i) {
		this.i = i;
	}
	
	public String toString ()
	{
		return id+" "+name+" "+address+" "+Arrays.toString(i);
	}
}
