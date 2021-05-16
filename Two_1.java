import java.util.Scanner;
public class Two_1 {
	static int count = 0;
	static int result = 0;
	static void hanoi(int n,int m) {
		
		if(n == 1) {
			count ++;
			if(count == m) {
				result =  n;
				System.out.println(result);
				System.exit(0);
			}
		}
		else {
			hanoi(n-1,m);
			count++;
			if(count == m) {
				result =  n;
				System.out.println(result);
				System.exit(0);
			}
			hanoi(n-1,m);
		}
		

		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		hanoi(32,num);
	}

}
