import java.util.*;

public class Baekjoon_2753 {

	public static void main(String[] args) {
		
		int num = 0;
		Scanner a = new Scanner(System.in);
		num = a.nextInt();
		
		if(num%400==0) {
			System.out.println("1");
		} else if(num%4==0 && num%100!=0) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}
		System.out.println();
	}

}