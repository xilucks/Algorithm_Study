import java.util.Scanner;

public class Parentheses {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		char[] stack = new char[1000];
		String sentence;
		int chrcount = 0;
		System.out.println("°ıÈ£½Ö ÀÔ·Â");
		sentence = scan.next();
		for(int i = 0; i < sentence.length(); i++) {
			char chr = sentence.charAt(i);
			if(chr == '(' || chr == '{' || chr == '[' || chr ==')' || chr == '}' || chr == ']') {
				stack[chrcount] = chr;
				chrcount ++;
			}
			else {
				continue;
			}
		}
		for (int j = 0; j < chrcount ; j ++) {
			if(stack[j] == ')') {
				if(stack[j-1] != '(') {
					System.out.println("false");}
				else {
					continue;}
				
			}
			if(stack[j] == '}') {
				if(stack[j-1] != '{') {
					System.out.println("false");}
				else {
					continue;}
			}
				
			if(stack[j] == ']') {
				if(stack[j-1] != '[') {
					System.out.println("false");}
				else {
					continue;
				}
				}
		
		
		

	}


}
}