package ggg;

import java.util.Scanner;

public class arr  {
	public static void main(String[] args){
		Scanner sc =new Scanner(System.in);
		int a,b;
		a=sc.nextInt();
		b=sc.nextInt();
		if(a>b) {
			if(a==10)
				System.out.println("equal to 10");
			else
				System.out.println(" not equal to 10");
		}else {
			System.out.println("less than a");
		}
	}

}
