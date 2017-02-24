package com.huc.subject;
/**
 * 通过列出前6个质数，我们可知第6个质数是13。
 * 那么第10001个质数是多少呢？
 * @author huc
 *
 */
public class Problem7 {
	public static void main(String[] args) {
		int n = 2,c = 0;
		for (int i = 1; i < 10; i++) {
			if(n%i==0){
				c++;
			}
		}
		if(c==2){
			System.out.println("是质数:"+n);
		}else{
			System.out.println("不是质数:"+n);
		}
	}
	
}
