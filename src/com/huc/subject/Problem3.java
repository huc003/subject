package com.huc.subject;
/**
 * 13195����������5ؼ7ؼ13ؼ29��
 * �ʣ�600851475143������������ǡ�����
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
