import java.util.Scanner;

public class HighestFactor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int  temp = 0 ;
		int num = 0;
		System.out.print("Enter a number:");
		int n= sc.nextInt();

		for(int i = n-1;i >= Math.sqrt(n);i--) {
			if(n%i == 0) {
				temp = i;
				num = n/i;
				break;
			}
			else {
				temp = 1;
				num = n;
			}
		}
		sc.close();
		System.out.println(temp+"*"+num);

	}

}
