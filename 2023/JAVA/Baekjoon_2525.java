import java.util.*;

public class Baekjoon_2525 {

	public static void main(String[] args) {
		int A = 0, B = 0, C = 0;
		Scanner oven = new Scanner(System.in);
		A = oven.nextInt();
		B = oven.nextInt();
		C = oven.nextInt();
		
		B += C;
		if (B>=60) {
			A = A + (B/60);
			B = B % 60;
			if(A>=24) {
				A = A % 24;
			}
			System.out.printf("%d %d", A, B);
		} else if (B<60) {
			System.out.printf("%d %d", A, B);
		}
		System.out.println();
	}
}