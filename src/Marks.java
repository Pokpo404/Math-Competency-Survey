import java.util.Scanner;

public class Marks {
    // Section A: marks
    private float marks[];
    private int numdata;
    Scanner in = new Scanner(System.in);

    // Section B: operation
    public void createData(int numdat) {
        marks = new float[numdat];   // an array
        for (int i=0; i<numdat; i++) {
			int temp;
			System.out.println("Enter mark #" + (i+1));
			temp = in.nextInt();
			marks[i] = temp;
        }
        numdata = numdat;
    }

    public float calcAvg() {
        float sum =0;
        for (int i=0; i<numdata; i++) {
            sum += marks[i];
        }
        float avg = sum / numdata;
        return avg;
    }

    public void setMark(int mark, int index) {
        this.marks[index]=mark;
    }
    public float getMark(int index) {
        return marks[index];
    }
}
