import java.util.*;

public class Baekjoon_10950 {

	public static void main(String[] args) {
		int num = 0;
		Scanner C = new Scanner(System.in);
		num = C.nextInt();
		
		for (int i=1;i<=num;i++) {
			int a = 0, b = 0;
			a = C.nextInt();
			b = C.nextInt();
			System.out.printf("%d", a + b);
			System.out.println();
		}
		System.out.println();
	}

}
