
public class mergesort {
	static void mergeSort(int[] arr) {
		int[] tmp = new int[arr.length];
		mergeSort(arr,tmp,0,arr.length-1);
	}
	static void mergeSort(int[] arr, int[]tmp,int front,int end) {
		if(front <end) {
			int mid = (front+end)/2;
			mergeSort(arr,tmp,front,mid);
			mergeSort(arr,tmp,mid+1,end);
			merge(arr,tmp,front,mid,end);
		}
	}
	static void merge(int[] arr, int[] tmp, int front, int mid, int end) {
		for(int i = front; i<=end; i++) {
			tmp[i] = arr[i];
		}
		int first = front;
		int second = mid+1;
		int index = front;
		while(first <=mid &&second <=end) {
			if(tmp[first] <= tmp[second]) {
				arr[index] = tmp[first];
				first ++;
			}
			else {
				arr[index]=tmp[second];
				second++;
			}
			index ++;
		}
		for(int i = 0; i<= mid-first; i++) {
			arr[index +i] = tmp[first+i];
		}
	}
	static void printArray(int[] arr) {
		for(int data : arr) {
			System.out.print(data+", ");
		}
		System.out.println();
	}
	public static void main(String args[]) {
		int[] arr = {3,9,4,7,5,0,1,6,8,2};
		printArray(arr);
		mergeSort(arr);
		printArray(arr);
	}

}
