package Algorithm_Task_One;

import java.util.Random;
import java.util.Scanner;

public class insertSort {
	static void insertSort(int[] v , int n) {
			int tmp; 
			for(int i = 1; i< n; i++) { 
				for(int j = i ; j >0; j--) {
					if(v[j] < v[j-1]) { // 0 > 1
						tmp = v[j-1];
						v[j-1] = v[j];
						v[j]=tmp;
						
						
					}
					
				}
			}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random(100);
		Scanner scan = new Scanner(System.in);
		System.out.print("Input nuber of data : ");
		int n = scan.nextInt();
		int[] v = new int[n];
		for(int i = 0; i<n; i++) {
			v[i] = rand.nextInt(1000000);
			
		}
		long ts = System.currentTimeMillis();
		insertSort(v,n);
		ts = System.currentTimeMillis() -ts;
		for(int i = 0; i < 10; i ++ ) {
			System.out.println(v[i]);
		}
		System.out.println("Elapsed time is " +ts + "ms.");
		
	}

}
