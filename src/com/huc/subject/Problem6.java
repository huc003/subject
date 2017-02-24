package com.huc.subject;
/**
 * 前十个正整数的平方和是：1*1 + 2*2 + ... + 10*10 = 385
 * 前十个正整数的和的平方是：(1 + 2 + ... + 10)*(1 + 2 + ... + 10) = 55*55 = 3025
 * 因此前十个正整数的和的平方，与前十个正数整数的平方和，的差是2640。
 * 现在请你求出前一百个正整数的和的平方与前一百个正整数的平方和的差。
 * @author huc
 *
 *
 */
public class Problem6 {
	public static void main(String[] args) {
		int n = 0;
		for (int i = 1; i <= 100; i++) {//整数平方的和
			n+=i*i;
		}
		System.out.println(n);
		int sum = 0;
		for (int i = 1; i <= 100; i++) {//整数和的平方
			sum+=i;
		}
		sum = sum*sum;
		System.out.println(sum);
		System.out.println("差:"+(sum-n));
	}
}
