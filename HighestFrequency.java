import java.util.Scanner;
import java.util.Arrays;
public class HighestFrequency {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = {0,0,0,0,0};
		int count = 1;
		int num = 0;
		int max = 0;
		for(int i = 0;i < arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		for(int i = 0;i < arr.length; i++) {
			count = 1;
			for(int j = i+1; j < arr.length; j++) {
				if(arr[i] == arr[j] && num!=arr[i]) {
					count= count+1;
				}
			}
			if(count > max) {
				max = count;
				num = arr[i];
			}
		}
		System.out.println("most frequent nnumber is "+num+" frequency is "+max);
		sc.close();
	}
}