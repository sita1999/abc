package ggg;

import java.util.Scanner;

public class arr  {
	public static void main(String[] args){
		Scanner sc =new Scanner(System.in);
		int a,b,c;
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		if(a>b) {
			if(a>c) {
				System.out.print(a);
				}
			else {
				System.out.print(c);
			}
		}else {
			if(b>c) {
			System.out.print(b);
		}else {
			System.out.print(c);
		}
	}

	}
}
