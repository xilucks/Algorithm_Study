import java.util.Scanner;

public class Parentheses {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		char[] stack = new char[1000];
		String sentence;
		int top = -1;

		sentence = scan.next();
		
		for(int i = 0; i < sentence.length(); i++) {
			char chr = sentence.charAt(i);
			if(chr == '(' || chr == '{' || chr == '[') {
				stack[++top] = chr;
				}
			else if (top < 0 ) {
				top = 0;
				break;
			}
			else {
				if(chr == ')') {
					if(stack [top] == '(') {
						top--;
					}
					
				}
				if(chr == '}') {
					if(stack [top] == '{') {
						top --;
					}
				
				}
				if(chr == ']') {
					if(stack [top] == '[') {
						top --;
					}
					
				}
			}
			}
		
		if ( top == -1 ) {
			System.out.println("OK");
		}
		else {
			System.out.println("ERROR");
		}
		
}
}