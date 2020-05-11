import java.util.Scanner;
public class PyramidPattern {

	public static void main(String[] args) {
		int n;
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
		sc.close();
	}
	
}
