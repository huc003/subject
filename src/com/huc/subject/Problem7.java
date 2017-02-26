package com.huc.subject;
/**
 * 通过列出前6个质数，我们可知第6个质数是13。
 * 那么第10001个质数是多少呢？
 * @author huc
 *
 */
public class Problem7 {
	public static void main(String[] args) {
		int n = 1;
		for (int j = 2; j < 150000; j++) {
			int c = 0;
			if(n<=10001){
				for (int i = 1; i < 150000; i++) {
					if(j%i==0){
						c++;
					}
					if (c>2){
						break;
					}
				}
				if(c==2){
					System.out.println("是质数:"+j+"-----个数："+n++);
				}
			}
		}
	}
	
}
