
import java.util.Scanner;
public class AlgorithmsExercise1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

	/* 1.1.1
		a) 7 ==> integer value
			b) 200.0000002 
			c) true
	 1.1.2
		a) 1.618 -> double
		b) 10.0 -> added and double due to 4.0
		c) true -> boolean
		d) 33 -> 1+2 as in and 3 as String 
 */
	// 1.1.3 Write a program that takes three integer command-line arguments and prints equal if all three are equal, and not equal otherwise.
		int int1 = Integer.parseInt(args[0]);
		int int2 = Integer.parseInt(args[1]);
		int int3 = Integer.parseInt(args[2]);
		
		if(int1==int2&&int1==int3)
			System.out.print("Equal");
		else
			System.out.print("Not Equal");
/*
	//1.1.4
		a. if (a > b) then c = 0; =>No keyword called "then"
		b. if a > b { c = 0; } => No parenthesis for if statement
		c. if (a > b) c = 0; => nothing wrong, 
		d. if (a > b) c = 0 else b = 0; ==> missing semi colon after c=0 	
*/
		
	// 1.1.5 Write a code fragment that prints true if the double variables x and y are both  strictly between 0 and 1 and false otherwise.
		
		double x,y;
		
		System.out.println("Enter two variable");
		x = sc.nextDouble();
		y = sc.nextDouble();
		if((x>0 && x<1)&&(y>0 &&y<1))
			System.out.print("True");
		else
			System.out.print("False");
		
	//1.1.6 : manually solved
		int f = 0; 
		int g = 1; 
		for (int i = 0; i <= 15; i++) 
		{
			System.out.println("i = "+i + " and f = "+ f +" and g = " +g);
			f = f + g;
			g = f - g; 
		}
		//1.1.7 : manually solved. 
		
		//1.1.8 b, 'b' +'c' ... 197 as ascii value of a is 96, b is 97, c is 98, e ... 'a' + 4 results in e
		
		//1.1.9 binary value
		int k = 5 ;
		System.out.println(Integer.toBinaryString(k));
		
		System.out.println("Enter a postive integer");
		int posint = sc.nextInt();
		String s = "";
		while(posint>0) {
			s = posint%2 + s;
			posint = posint/2;
			}
		System.out.print(s);
		//1.1.10 What is wrong with the following code fragment? 
		// to fix  		int[] a = new int[10];
		
		//1.1.11
		boolean[][] barr = {{true, false, true},{false, true, true}};
		
		for (int i = 0; i < barr.length; i++) {
			for (int j = 0; j < barr[i].length; j++) {
				if (barr[i][j])
					System.out.print("*");
				else
					System.out.print(" ");
				}
			System.out.println();
		}		
		//1.1.12 What does the following code fragment print? >> there is only one print statement  0 to 9 loop printed
		
		//1.1.13 transpose 
		
		int [][]a = {{1,2,3},{4,5,6}, {7,8,9}};
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j]+ " ");				
			}
			System.out.println();
			}
		System.out.println("Transpose");
		for (int i = 0; i < a[0].length; i++) { //col
			for (int j = 0; j < a.length; j++) { //row
				System.out.print(a[j][i]+ " ");				
			}
			System.out.println();
		}
		
		
		
	}
}
