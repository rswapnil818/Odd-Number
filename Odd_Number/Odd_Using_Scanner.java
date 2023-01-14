package Odd_Number;

import java.util.Scanner;

public class Odd_Using_Scanner {

	public static void main(String[] args) {
		int a;
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter value");
		a =s.nextInt();
			
		if(a%2==1)
		{
			System.out.println(a+" odd number");
		}else
		{
			System.out.println("even number");
		}
		s.close();

	    }

        }
