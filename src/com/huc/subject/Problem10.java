package com.huc.subject;

/**
 * 10以下的质数的和为2 + 3 + 5 + 7 = 17。
 * 请求出200,0000以下所有质数的和。142913828922
 * Created by hucheng on 2017/2/25.
 */
public class Problem10{
    public static void main(String[] args) {
        long beginTime = System.currentTimeMillis();
        int max = 2000000;
        boolean[] flag = new boolean[max+1];
        for (int i = 0; i <=max ; i++) {
            flag[i] = true;
        }

        flag[0] = flag[1] = false;
        int n = (int)Math.ceil(Math.sqrt(max));
        for (int i = 0; i < n; i++) {
            if(flag[i]){
                for (int j = 2*i; j <=max ; j=j+i) {
                    flag[j] = false;
                }
            }
        }

        long sum = 0;
        for (int i = 0; i < max; i++) {
            if(flag[i]){
                sum+=i;
            }
        }
        System.out.println("2000000所有质数和："+sum);
        long endTime = System.currentTimeMillis();
        System.out.println("共用了 " + (endTime-beginTime) + " 毫秒.");
    }
}
