package Programming_FianlExam;
import java.util.Scanner;

public class Main {
    static class Example{
        Example(){}
        int count(String str,char c){
            int count = 0;
            for(int i=0; i<str.length();i++){
                char ch = str.charAt(i);
                if (ch ==c){
                    count++;
                }
            }
            return count;
        }
        static void capital(char ch){
            System.out.println((char)((int)ch -32));
        }

    }
    static class Appliance{
        private String name;
        private int power;
        Appliance(String str, int n) {
            name = str;
            power =n;
        }
        String getName(){
            return name;
        }
        int getPower(){
            return power;
            }
    }
    static class Aircon{
        private String name;
        private int ele;
        private int ondo;

        Aircon(String str, int n1, int n2) {
            name = str;
            ele = n1;
            ondo = n2;
        }

        void show(){
            System.out.println(name+"("+ele+"V)의 온도는 "+ondo+"도" );
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Example ex = new Example();
        System.out.println(ex.count("oxxoooxoox",'o'));

        Example.capital('n');

        Appliance tv = new Appliance("최시운tv",110);
        System.out.println(tv.getName()+"("+tv.getPower()+"V)");

        Aircon cool = new Aircon("최시운에어콘",220,20);
        cool.show();

        int a = sc.nextInt();
        int ans = a;
        int b = 0;
        int count = 0;
        while(true){
            if(a< 10){
                b = a;
            }
            else {
                b = a/10+ a%10;
            }
            a = (a%10)*10 + b%10;
            count++;
            if(a == ans){
                System.out.println(count);
                break;
            }

        }



    }
}
