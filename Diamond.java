import java.util.Scanner;
public class Diamond {

	public static void main(String[] args) {
		int n;
		int a,b;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter no of rows:");
		n = sc.nextInt();
		int k;
		for(int i = 1;i <= n; i++) {
			k = 0;
			for(int j = 1 ;j <= i ; j++) {
				while(k < n-i) { 
					System.out.print(" ");
					k = k + 1;
				}
				if(j == i) {
					System.out.print("*");
				}
				else {
					System.out.print("* ");
				}
			}
			System.out.print("\n");
		}
		//second part:-
		for(int i = 1; i <= n; i++) {
			k = 0;
			for(int j = 1; j <= n-i;j++) {
				while(k != i) {
					System.out.print(" ");
					k++;
				}
				if(j == n-i) {
					System.out.print("*");
				}
				else {
					System.out.print("* ");
				}
			}
			System.out.print("\n");
		}
		sc.close();

	}

}
