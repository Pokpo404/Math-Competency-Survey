
public class School {
    // attributes
    private String name;
    private Address address;
    private String principal;
    private Marks marks;

    public School(String name, Address addr, String principal) {
    	this.name = name;
    	this.address = addr;
    	this.principal = principal;
    }
    // setter and getter
    // setter for name
    public void setName(String name) {
        this.name = name;
    }
    public void setAddress(Address address) {
        this.address = address;
    }

    public String getName( ) {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    public String getPrincipal() {
        return principal;
    }

    public void setPrincipal(String principal) {
        this.principal = principal;
    }

    public void setNumParticipants(int num) {
        marks = new Marks();
        marks.createData(num);

    }
    
    public float getAvg() {
    	return marks.calcAvg();
    }
    
    public void print() {
    	System.out.println("School name: " + name);
    	System.out.println("Principal: " + name);
    	System.out.println("Address: " + address.getStreet() + "," + " " + address.getDistrict() 
    					+ "," + "\n\t " + address.getPostcode() + "," + " " + address.getState());
    	if(marks != null) {
    		System.out.println("Average marks: " + marks.calcAvg());
    	} else {
    		System.out.println("Marks have not been inputted yet");
    	}
    	
    }
}
			