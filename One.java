import java.util.Scanner;

public class One {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int[] Array = new int[a];
		for(int i = 0; i <a ; i++) {
			Array[i] = sc.nextInt();
		}
		int min;
		int tmp;
		for(int i = 0 ; i< a-1; i++) {
			min = i;
			for(int j =i; j<a;j++) {
				if(Array[j]<Array[min]) {
					tmp = Array[j];
					Array[j]=Array[min];
					Array[min] =tmp;
				}
			}
		}
		System.out.println(Array[0]+ " "+Array[a-1]);
	}

}
