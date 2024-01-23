import java.util.*;

public class Baekjoon_1330 {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		int num_1 = 0, num_2 = 0;
		num_1 = a.nextInt();
		num_2 = a.nextInt();
		
		if(num_1 > num_2) {
			System.out.println(">");
		} else if(num_1 < num_2) {
			System.out.println("<");
		} else {
			System.out.println("==");
		}
		System.out.println();
	}

}