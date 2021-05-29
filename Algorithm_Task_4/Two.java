package Algorithm_Task_4;

import java.util.Scanner;

public class Two {
	static void mergeSort(String[] arr) {
		String[] tmp = new String[arr.length];
		mergeSort(arr,tmp,0,arr.length-1);
		
	}
	static void mergeSort(String[]arr,String[]tmp,int start,int end) {
		
		if(start<end) {
		int mid = (start+end)/2;
		mergeSort(arr,tmp,start,mid);
		mergeSort(arr,tmp,mid+1,end);
		merge(arr,tmp,start,mid,end);
	
		}
	}
	static void merge(String[] arr, String[] tmp, int start, int mid, int end) {
		for(int i =0; i<arr.length; i++) {
			tmp[i] = arr[i];
		}
		int part1 = start;
		int part2 = mid+1;
		int index = start;
		while(part1<=mid && part2<=end) {
		if((int)tmp[part1].charAt(0) < (int)tmp[part2].charAt(0)) {
				arr[index] = tmp[part1];
				part1 ++;
			}
			else if((int)tmp[part1].charAt(0) > (int)tmp[part2].charAt(0)) {
				arr[index] = tmp[part2];
				part2 ++;
			}
			
			else {
				int addindex = 0;
				if(addindex > tmp[part1].length() || addindex>tmp[part2].length()) {
					break;
				}
				else {
				while((int)tmp[part1].charAt(addindex) < (int)tmp[part2].charAt(addindex) ||
					(int)tmp[part1].charAt(addindex) > (int)tmp[part2].charAt(addindex)) {
					addindex++;
				}
				if((int)tmp[part1].charAt(addindex) < (int)tmp[part2].charAt(addindex)) {
					arr[index] = tmp[part1];
					part1 ++;
					break;
				}
				else if((int)tmp[part1].charAt(addindex) > (int)tmp[part2].charAt(addindex)) {
					arr[index] = tmp[part2];
					part2 ++;
					break;
				}
				}
			}
			index++;
		}
		for(int i =0; i<=mid-part1;i++) {
			arr[index+i] = tmp[part1+i];
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] arr = new String[n];
		for(int i = 0; i<n; i++) {
			arr[i] = sc.next();
		}
		mergeSort(arr);
		for(int i =0; i <arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
	}

}