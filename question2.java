import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
public class question2 {
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int length = 10;
		int[] numbers = new int[length];
		int []values = new int[length];
	System.out.print("input array element value");
		values[0] = (int) in.nextDouble();
		System.out.print("input array element value");
		values[1] = (int) in.nextDouble();
		System.out.print("input array element value");
		values[2] = (int) in.nextDouble();
		System.out.print("input array element value");
		values[3] = (int) in.nextDouble();
		System.out.print("input array element value");
		values[4] = (int) in.nextDouble();
		System.out.print("input array element value");
		values[5] = (int) in.nextDouble();
		System.out.print("input array element value");
		values[6] = (int) in.nextDouble();
		System.out.print("input array element value");
		values[7] = (int) in.nextDouble();
		System.out.print("input array element value");
		values[8] = (int) in.nextDouble();
		System.out.print("input array element value");
		values[9] = (int) in.nextDouble();
		
		//element at even index
		for (int i = 0; i < values.length; i= i+2) {
			
				System.out.println(values[i]);
			}
		//even elements
		System.out.println("even elements: ");
		for (double something : values){
			if (something % 2==0) {
			System.out.println(something +" ");
			}
		}
		//odd elements
		System.out.println("odd elements: ");
		for (double something : values) {
			if (something%2!=0) {
				System.out.println(something+" ");
			}
			
		}
		//backwards
		System.out.println("elements backwards: ");
		for (int i = values.length-1;i>=0; i--) {
			System.out.println(values[i]);
		}
			
		//1st,5th,last element
		System.out.println("first element: "+ values[1]+" fifth element: "+ values[4]+" last element: "+values[9]);

		//largest and smallest element
		int smallest = values[0];
        int biggest = values[0];
       
        for(int i=1; i< values.length; i++)
        {
                if(values[i] > biggest)
                        biggest = values[i];
                else if (values[i] < smallest)
                        smallest = values[i];
               
        }
        System.out.println("largest number: " + biggest);
        System.out.println("smallest Number: " + smallest);
		
        //sum of all elements
        System.out.println("sum of elements=");
        System.out.println(values[0]+"+"+values[1]+"+"+values[2]+"+"+values[3]+"+"+values[4]+"+"+values[5]+"+"+values[6]+"+"+values[7]+"+"+values[8]+"+"+values[9]);
        System.out.println(values[0]+values[1]+values[2]+values[3]+values[4]+values[5]+values[6]+values[7]+values[8]+values[9]);
	}
}
