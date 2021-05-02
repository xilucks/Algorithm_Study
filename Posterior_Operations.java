import java.util.Scanner;
public class Posterior_Operations {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] stack = new int[1000];
		int top = -1;
		String num;
		char num2 = 0 ;
		while(num2 != '=') {
			num = scan.next();
			num2 = num.charAt(0);
			if (num2 - '0' >= 0) {
                stack[++top] = num2 - '0';
            }
			else {
				switch (num2) {
                case '+':
                    stack[top - 1] += stack[top];
                    top--;
                    break;
               
                case '-':
                    stack[top - 1] -= stack[top];
                    top--;
                    break;
                case '*':
                    stack[top - 1] *= stack[top];
                    top--;
                    break;
                case '/':
                    stack[top - 1] /= stack[top];
                    top--;
                    break;
			}
		}
	
	}
			System.out.println(stack[0]);

}
}