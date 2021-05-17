package Algorithm_Task_One;
import java.util.*;
public class QuickSort {
	public static void main(String[] args) {
		int[] array = {5,3,8,4,9,1,6,2,7};
		PrintArray(array);
		QuickSort(array, 0, array.length-1);
		PrintArray(array);
	}


	public static void QuickSort(int[] array, int start, int end) {
		if(start >= end) {
			return;
		}
		int pivot = start;
		int i = start +1;	//pivot보다 큰 수.
		int j = end;	//pivot보다 작은 수.
		int tmp;
		
		while(i <=j) {
			while(array[i]<= array[pivot] && i <end) {
				i++;
			}
			while(array[j] >= array[pivot] && j>start) {
				j--;
			}
			
			if(i >= j) {
				tmp = array[j];
				array[j] = array[pivot];
				array[pivot] = tmp;
			}
			else {
				tmp = array[j];
				array[j] = array[i];
				array[i] = tmp;
			}
			
		}
	
		QuickSort(array,start, j-1);
		QuickSort(array,j+1, end);

	}
	public static void PrintArray(int[] array) {
		for(int a = 0; a<array.length; a++) {
			System.out.print(array[a]+" ");
		}
		System.out.println("");
	}

}
