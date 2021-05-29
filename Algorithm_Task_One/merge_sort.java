package Algorithm_Task_One;

import java.util.ArrayList;

public class merge_sort {
	static void MergeSort(int[] list) {
		int[] tmp = new int[list.length];
		MergeSort(list,tmp,0,list.length-1);
	}
	static void MergeSort(int[] list,int[]tmp,int front, int tail) {
		if(front<tail) {
			int mid = (front+tail)/2;
			MergeSort(list,tmp,front,mid);
			MergeSort(list,tmp,mid+1,tail);
			merge(list,tmp,front,mid,tail);
		}
	}
	
	static void merge(int[] list,int[] tmp,int front,int mid,int tail) {
		for(int i = 0; i <=list.length-1; i++) {
		tmp[i] = list[i];
		}
		int first = front;
		int second = mid+1;
		int index = front;
		while (first <=mid && second <=tail) {
			if(tmp[first] <=tmp[second]) {
				list[index] = tmp[first];
				first++;
			}
			else {
				list[index] = tmp[second];
				second++;
			}
			index ++;
		}
		for(int i = 0; i<=mid-first; i++) {
			list[index+i] = list[first+i];
		}	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] list = {3,9,4,7,5,0,1,6,8,2};
		System.out.println();
		MergeSort(list);


	}

}
