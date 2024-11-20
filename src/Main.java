import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		
		
		int num = sc.nextInt();
		
		num += 1;
		while (!isDistinct(num)) {
			num++;
		}
		System.out.println(num);

	}

	private static boolean isDistinct(int num) {
		// TODO Auto-generated method stub
		int[] record = new int[10];
		for (int i=0;i<10;i++)
			record[i] = 0;
		
		while (num>0) {
			int digit = num % 10;
			if (record[digit] == 0) {
				record[digit] = 1;
			} else {
				return false;
			}
			num = num / 10;
		}
		return true;
	}

}
