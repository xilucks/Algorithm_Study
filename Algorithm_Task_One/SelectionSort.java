package Algorithm_Task_One;
import java.util.*;

public class SelectionSort {
	static void selectionsort(int [] v, int n) {
		int min ;
		int tmp;
		for(int i = 0; i< n-1; i++) {
			min = i;
			for(int j = i; j<n; j++) {
				if(v[min]> v[j]) {
					tmp = v[j];
					v[j] = v[min];
					v[min] = tmp;
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
		selectionsort(v,n);
		ts = System.currentTimeMillis() -ts;
		for(int i = 0; i < 10; i ++ ) {
			System.out.println(v[i]);
		}
		System.out.println("Elapsed time is " +ts + "ms.");
		
	}
	}


