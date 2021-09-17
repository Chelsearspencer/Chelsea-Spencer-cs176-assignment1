import java.util.Scanner;
import java.util.Arrays;
public class question1 {
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub	
	
	final int length = 10;
	int[] numbers = new int[length];
	
	
	int []values = new int[length];
	values[0]= 17;
	values[9]= 29;
	
	System.out.println(" ");
	System.out.println("array with 17 & 29  ");
	System.out.println(Arrays.toString(values));
	Arrays.fill(values,1,9,-1);
	System.out.println(" ");
	System.out.println("array filled with -1   ");
	System.out.println(Arrays.toString(values));
	
	System.out.println(" ");
	System.out.println("array with +1   ");	
	for (int i = 0; i < values.length; i++) {
		values[i]++;
	}
	System.out.println(Arrays.toString(values));
	
	
	System.out.println(" ");
	System.out.println("elements printed 1 per line:   ");
	for (int i = 0; i < 10; i++) {	
System.out.println(values[i]);
	}
	
	System.out.println(" ");
	System.out.println("elements in single line:   ");
	for (int i = 0; i < 10; i++) {	
System.out.print(values[i]+",");
	}

}
}