import java.util.*;

public class baekjoon_practice {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		
		int A = a.nextInt();
		int B = a.nextInt();
		int C = a.nextInt();
		
		a.close();
		
		System.out.println( (A+B)%C );
		System.out.println( (A%C + B%C) %C);
		System.out.println( (A*B)%C );
		System.out.println( (A%C * B%C) %C);
	}

}