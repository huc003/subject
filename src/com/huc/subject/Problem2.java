package com.huc.subject;
/***
 * Fibonacci���е�ÿ��һ���ǰ������ĺͣ�����ʼ��ͷ������1��2����ôǰ10������ǣ�
 * 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
 * ���������Fibonacci�����в�����400,0000������ż���ĺ͡�
 * @author huc
 *
 */
public class Problem2 {
	public static void main(String[] args) {
		int a = 0,b = 1,c = 0,sum = 0;
		for (;;) {
			c = a+b;//��һ��==��һ��+�ڶ���
			a = b;//���ڶ��������һ���ǰ�ƶ�һλ
			b = c;//����һ������ڶ����ǰ�ƶ�һλ
			if(c>4000000){
				break;
			}
			if(c%2==0){//��ż
				sum+=c;
			}
		}
		System.out.println(sum);
	}
}
