package com.huc.subject;
/**
 * ����г�С��10��������3��5�ı�������Ȼ������3ؼ5ؼ6��9�����ǵĺ���23��
 * ���������������1000����Ϊ3��5�ı�������Ȼ���ĺ͡�
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
