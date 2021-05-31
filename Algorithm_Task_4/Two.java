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
				int addindex= 1;
				int smalllength = 0;//둘중 길이가 짧은거 만큼 돌림
				int result = -1;//-1이면 정렬이 안된거 0이면 된거
				int p1length = tmp[part1].length();
				int p2length = tmp[part2].length();
				if(p1length >= p2length) smalllength = p2length;
				else smalllength = p1length;
				while(addindex <smalllength) {
					if(tmp[part1].charAt(addindex)<tmp[part2].charAt(addindex)) {
						arr[index] = tmp[part1];
						part1++;
						result = 0;
						break;
					}
					else if(tmp[part1].charAt(addindex)>tmp[part2].charAt(addindex)) {
						arr[index] = tmp[part2];
						part2 ++;
						result = 0;
						break;
					}
					addindex++;
				}
				if(result != 0 &&tmp[part1].length() <= tmp[part2].length()) {
					arr[index] = tmp[part1];
					part1 ++;
				
				}
				else if(result != 0 &&tmp[part1].length() > tmp[part2].length()){
					arr[index] = tmp[part2];
					part2 ++;
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
