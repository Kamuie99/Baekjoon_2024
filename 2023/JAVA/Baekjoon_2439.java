package Baekjoon;

import java.util.*;
public class Baekjoon_2439 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N_1 = scanner.nextInt();
		int N = N_1 + 1;
		
		for (int i=1; i<N; i++) {
			for(int j=N-1; j>0;j--) {
				if (i<j) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}
			System.out.println("");
		}
	}

}
