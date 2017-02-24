package com.huc.subject;
/***
 * Fibonacci数列的每后一项都是前面两项的和，若开始的头两项是1和2，那么前10个项就是：
 * 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
 * 请求出以上Fibonacci数列中不超过400,0000的所有偶数的和。
 * @author huc
 *
 */
public class Problem2 {
	public static void main(String[] args) {
		int a = 0,b = 1,c = 0,sum = 0;
		for (;;) {
			c = a+b;//后一项==第一项+第二项
			a = b;//将第二项给到第一项，往前移动一位
			b = c;//将后一项给到第二项，往前移动一位
			if(c>4000000){
				break;
			}
			if(c%2==0){//求偶
				sum+=c;
			}
		}
		System.out.println(sum);
	}
}
