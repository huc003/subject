package com.huc.subject;
/**
 * 13195的质因数有5丶7丶13丶29。
 * 问：600851475143的最大质因数是……？
 * @author huc
 *
 */
public class Problem3 {
	public static void main(String[] args) {
		long sum = 600851475143l;
		for (int i = 2; i <= sum; i++) {
			if(sum%i==0){
				sum = sum / i;
				System.out.println(i);
				i=1;
			}
		}
	}
}
