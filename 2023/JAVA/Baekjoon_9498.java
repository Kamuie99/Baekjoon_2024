import java.util.*;

public class Baekjoon_9498 {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		int input_num = 0;
		input_num = a.nextInt();
		
		if (input_num<=100 && input_num>=90) {
			System.out.println("A");
		} else if (input_num<90 && input_num>=80) {
			System.out.println("B");
		} else if (input_num<80 && input_num>=70) {
			System.out.println("C");
		} else if (input_num<70 && input_num>=60) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}
		System.out.println();
	}

}