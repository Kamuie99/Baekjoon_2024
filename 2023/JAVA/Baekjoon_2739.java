import java.util.*;

public class Baekjoon_2739 {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		int num = 0;
		num = a.nextInt();
		
		for (int i=1; i<=9; i++) {
			System.out.printf("%d * %d = %d", num, i, num * i);
			System.out.println(); 
		}
		
	}

}
