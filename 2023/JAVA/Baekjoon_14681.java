import java.util.*;

public class Baekjoon_14681 {

	public static void main(String[] args) {
		int num_a =0, num_b=0;
		Scanner a = new Scanner(System.in);
		
		num_a = a.nextInt();
		num_b = a.nextInt();
		
		if (num_a > 0 && num_b > 0) {
			System.out.println("1");
		} else if (num_a < 0 && num_b > 0) {
			System.out.println("2");
		} else if (num_a <0 && num_b < 0) {
			System.out.println("3");
		} else {
			System.out.println("4");
		}
		System.out.println();
	}

}