package com.huc.subject;
/**
 * ǰʮ����������ƽ�����ǣ�1*1 + 2*2 + ... + 10*10 = 385
 * ǰʮ���������ĺ͵�ƽ���ǣ�(1 + 2 + ... + 10)*(1 + 2 + ... + 10) = 55*55 = 3025
 * ���ǰʮ���������ĺ͵�ƽ������ǰʮ������������ƽ���ͣ��Ĳ���2640��
 * �����������ǰһ�ٸ��������ĺ͵�ƽ����ǰһ�ٸ���������ƽ���͵Ĳ
 * @author huc
 *
 *
 */
public class Problem6 {
	public static void main(String[] args) {
		int n = 0;
		for (int i = 1; i <= 100; i++) {//����ƽ���ĺ�
			n+=i*i;
		}
		System.out.println(n);
		int sum = 0;
		for (int i = 1; i <= 100; i++) {//�����͵�ƽ��
			sum+=i;
		}
		sum = sum*sum;
		System.out.println(sum);
		System.out.println("��:"+(sum-n));
	}
}
