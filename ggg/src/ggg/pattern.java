package ggg;

public class pattern {
public static void main(String[] k) {
	int i,j;
	for(i=1;i<=5;i++) {
		for(j=1;j<=5-i;j++) {
			System.out.print(" ");
		}
		for(j=1;j<=i;j++) {
			System.out.print("*");
		}
		System.out.println();
	}
}
}
