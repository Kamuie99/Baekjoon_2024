import java.util.*;

public class Baekjoon_2480 {

	public static void main(String[] args) {
		int try_1 = 0, try_2 = 0, try_3 =0;
		Scanner dice = new Scanner(System.in);
		try_1 = dice.nextInt();
		try_2 = dice.nextInt();
		try_3 = dice.nextInt();
		
		if (try_1 == try_2 && try_2 == try_3 && try_1 == try_3) {
			System.out.println(10000 + try_1 * 1000);
		} else if (try_1 == try_2 || try_1 == try_3) {
			System.out.println(1000 + try_1 * 100);
		} else if (try_2 == try_3) {
			System.out.println(1000 + try_2 * 100);
		} else 
		{
			System.out.print(Math.max(try_1, Math.max(try_2,  try_3))*100);

		}
	}

}
