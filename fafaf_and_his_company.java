package codeforces;

import java.util.Scanner;

public class fafaf_and_his_company {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 0;
		for(int i = 1;i<=n/2;i++)
		{
			if(n % i == 0)
				count++;
		}
		System.out.println(count);
	}
	

}
