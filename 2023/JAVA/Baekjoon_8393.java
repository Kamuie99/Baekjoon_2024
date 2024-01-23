import java.util.*;

public class Baekjoon_8393 {

	public static void main(String[] args) {
		int n = 0, sum = 0;
		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();
		
		for (int i=1; i<=n; i++)
			sum += i;
		System.out.println(sum);
	}

}