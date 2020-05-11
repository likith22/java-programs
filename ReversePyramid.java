import java.util.Scanner;

public class ReversePyramid {

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("enter no of rows:");
		n = sc.nextInt();
		int k ;
		for(int i = 1;i <= n; i++) {
			k = 1;
			for(int  j =1; j<= n-i+1; j++) {
				while(k != i) {
					System.out.print(" ");
					k = k+1;
				}
				if(j == n-i+1) 
					System.out.print("*");
				else
					System.out.print("* ");
				
			}
			System.out.println();
		}
		sc.close();
	}

}
