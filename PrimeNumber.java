import java.util.Scanner;
public class PrimeNumber {

	public static void main(String[] args) {
		int count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number:");
		int n = sc.nextInt();
		for(int i = 2 ;i <= Math.sqrt(n); i++) {
			if(n%i == 0) {
				count = count + 1;
			}
		}
		if(count == 0) {
			System.out.println("Prime number");
		}
		else {
			System.out.println("not");
		}
		sc.close();
		
	}

}
