package com.huc.subject;
/**
 * 2520是能被1到10的自然数整除的最小正整数。
 * 那么，能被1到20的自然数整除的最小正整数是……？
 * @author huc
 *
 */
public class Problem5 {
	public static void main(String[] args) {
		for (int i = 1; i < 1000000000; i++) {
			for (int j = 1; j < 21; j++) {
				if(i%j==0){
					if(j==20){
						System.out.println(i+"---"+j);
						break;
					}
				}else{
					break;
				}
			}
		}
		System.out.println("ok");
	}
}
