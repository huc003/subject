package com.huc.subject;
/**
 * 2520���ܱ�1��10����Ȼ����������С��������
 * ��ô���ܱ�1��20����Ȼ����������С�������ǡ�����
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
