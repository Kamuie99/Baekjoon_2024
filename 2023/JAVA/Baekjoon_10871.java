package Baekjoon;

import java.util.*;

public class Baekjoon_10871 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, x;
		n = sc.nextInt();
		x = sc.nextInt();
		int [] N = new int[n];
		
		for(int i=0; i<n; i++) {
			N[i] = sc.nextInt();
			if(N[i]<x) System.out.print(N[i]+" ");
		}
		
	}

}
