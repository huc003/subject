package com.huc.subject;
/**
 * ����һ����ǰ���ת����ͬһ�����Ļ����Ǹ����ͽ�����������������������λ���Ļ����ɵ�����������9009 = 91 �� 99��
 * ���ҳ���������λ���Ļ����ɵ�����������
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
						System.out.println("��ǰ����������:"+max);
					}
				}
			}
		}
		System.out.println("����������:"+max);
	}
	/**
	 * �ж��Ƿ��ǻ�����
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
