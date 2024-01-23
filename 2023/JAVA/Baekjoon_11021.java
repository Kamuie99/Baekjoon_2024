import java.util.*;
public class Baekjoon_11021 {

	public static void main(String[] args) {
		int n = 0;
		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();
		
		for(int i=1;i<=n;i++) {
			int a=0, b=0;
			a = scanner.nextInt();
			b = scanner.nextInt();
			System.out.printf("Case #%d: %d", i, a + b);
			System.out.println();
		}
	}

}