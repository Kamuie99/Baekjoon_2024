import java.util.*;

public class Baekjoon_2884 {

	public static void main(String[] args) {
		
		int H=0, M=0;
		Scanner time = new Scanner(System.in);
		H = time.nextInt();
		M = time.nextInt();
		
		if (M>=45) {
			System.out.printf("%d %d", H, M-45);
		} else if (M<45 && H>=1) {
			System.out.printf("%d %d", H-1, M+60-45);
		} else if (M<45 && H<1) {
			System.out.printf("%d %d", H+24-1, M+60-45);
		}
		System.out.println();
	}

}