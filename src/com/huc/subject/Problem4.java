package com.huc.subject;
/**
 * 假如一个数前后掉转后还是同一个数的话，那个数就叫做「回文数」。由两个二位数的积构成的最大回文数是9009 = 91 × 99。
 * 请找出由两个三位数的积构成的最大回文数。
 * @author huc
 *
 */
public class Problem4 {
	public static void main(String[] args) {
		int n = 0,max = 0;
		for (int i = 100; i <1000; i++) {
			for (int j = 100; j < 1000; j++) {
				n = i*j;
				if(fun(n)){
					if(max<n){
						max = n;
						System.out.println("当前最大回文数是:"+max);
					}
				}
			}
		}
		System.out.println("最大回文数是:"+max);
	}
	/**
	 * 判断是否是回文数
	 */
	public static boolean fun(int n){
		String s = n+"";
		String k = "";
		for (int j = s.length()-1; j >=0; j--) {
			k+=s.charAt(j);
		}
		if(k.equals(s)){
			return true;
		}
		return false;
	}
}
