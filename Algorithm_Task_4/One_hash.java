package Algorithm_Task_4;

import java.util.Scanner;

public class One_hash {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int m = 4999999;
        String[] values = new String[m];
        int[] keys = new int[m];
        String str= sc.nextLine();
        int count = 0;
        for(int i =0; i<str.length();i++){
            for(int j =i;j<str.length();j++){
                String value = str.substring(i,j+1);
                int h = (value.hashCode()&0x7fffffff)%m;
                values[h] = value;
                keys[h] = h;
            }
        }
        for(int i =0; i<values.length;i++){
            if(values[i] != null){
                count++;
            }
        }
        System.out.println(count);
    }
}
