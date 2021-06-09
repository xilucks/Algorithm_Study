import java.util.Random;
import java.util.Scanner;

public class double_array_practice {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        System.out.print("row ���� �Է��Ͻÿ� : ");
        int row = sc.nextInt();
        System.out.print("column ���� �Է��Ͻÿ� : ");
        int col = sc.nextInt();
        int[][] arr = new int[row][col];
        for(int i =0 ; i<row; i++){
            for(int j=0; j<col;j++){
                arr[i][j] = rand.nextInt(100)+1;
            }
        }
        for(int i =0; i<row; i++){
            int sum =0;
            for(int j =0; j<col;j++){
                System.out.print(arr[i][j] + "\t");
                sum += arr[i][j];
            }
            System.out.println("|| " + sum);
        }
        System.out.println("=================");
        for(int i = 0; i<col; i++){
            int sum = 0;
            for(int j =0; j<row; j++){
                sum += arr[j][i];
            }
            System.out.print(sum+"\t");
        }
    }
}