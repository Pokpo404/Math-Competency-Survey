import java.util.ArrayList;
import java.util.Scanner;
public class Helper {

	
	
	public static School registerSchl(Scanner input) {
		String name;
		String street;
		String district;
		String postcode;
		String state;
		String principal;
	
		input.nextLine();
		System.out.print("Enter school name: ");
		name = input.nextLine();
		System.out.print("Enter Address street:");
		street = input.nextLine();
		System.out.print("Enter Addess district:");
		district = input.nextLine();
		System.out.print("Enter Address postcode:");
		postcode = input.nextLine();
		System.out.print("Enter Address state: ");
		state = input.nextLine();
		System.out.print("Enter principal name: ");
		principal = input.nextLine();
		
		Address addr = new Address(street, district, postcode, state);
		School schl = new School(name, addr, principal);
		
		return schl;
	}
	
	public static void getSchool(ArrayList<School> schools, Scanner in) {
		
		System.out.println("Masuk x?");
		String temp;
		System.out.print("Enter name of school: ");
		in.nextLine();
		temp = in.nextLine();
		for (int i = 0; i < schools.size(); i++) {
			if(temp.equalsIgnoreCase(schools.get(i).getName())) {
				schools.get(i).print();
				break;
			}
		}
		
	}
	
	public static void inputMarks(ArrayList<School> schools, Scanner in) {
		
		int index;
		int numStud;
		
		for (int i = 0; i < schools.size(); i++) {
			System.out.println((i+1) + ") " + schools.get(i).getName());
		}	
		
		System.out.print("Which school are you inputting data into:");
		index = in.nextInt();
		
		System.out.println("How many paticipants are in this school?");
		numStud = in.nextInt();
		
		schools.get(index - 1).setNumParticipants(numStud);
	}
	
	public static void getHighest(ArrayList<School> schools) {
		
		School temp = schools.get(0);
		
		for(int i = 1; i < schools.size(); i++) {
			if(schools.get(i).getAvg() > temp.getAvg()){
				temp = schools.get(i);
			}
		}
		
		System.out.println("Highest performing school: " + temp.getName() 
						+ "\nAverage marks: " + temp.getAvg());
	}
}
