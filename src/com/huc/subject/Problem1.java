package com.huc.subject;
/**
 * 如果列出小于10的所有是3或5的倍数的自然数，有3丶5丶6和9，它们的和是23。
 * 现在请你算出所有1000以下为3或5的倍数的自然数的和。
 * @author huc
 *
 */
public class Problem1 {
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 0; i < 1000; i++) {
			if(i%3==0||i%5==0){
				sum+=i;
			}
		}
		System.out.println(sum);
	}
}
