import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    // Application code
    public static void main(String args[]){
    	Scanner input = new Scanner(System.in);
    	ArrayList<School> schools = new ArrayList<School>();  	
    	int userInput;
    	String welcomeMsg = "MATHEMATICS COMPETENCY SURVEY\n\t1. Register school\n\t"
    						+ "2. School info\n\t3. Input data\n\t4. Display highest\n\t0. Quit";
    	
    	System.out.println(welcomeMsg);
    	userInput = input.nextInt();
    	
    	while(userInput > 0) {
    		switch (userInput) {
    		case 1:
    			schools.add(Helper.registerSchl(input));
    			break;
    		case 2:
    			Helper.getSchool(schools, input);
    			break;
    		case 3:
    			Helper.inputMarks(schools, input);
    			break;
    		case 4:
    			Helper.getHighest(schools);
    			break;
    		}
    		
    		System.out.println(welcomeMsg);
    		userInput = input.nextInt();
    	}
    	input.close();
    }
}