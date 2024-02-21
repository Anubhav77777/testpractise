package flutter;

import java.util.Scanner;

public class Caondition2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first  number :");
        int a=sc.nextInt();
        System.out.println("You have entered :"+a);
//        System.out.println("Enter the second number:");
//        int b=sc.nextInt();
//        System.out.println("You have entered :"+b);
     String  result =a%2==0?"no is even":"no is odd";
     System.out.println(result);
     
        
        


	}

}
