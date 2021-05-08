import java.util.Scanner;

public class prog_6 {
    private static int sum = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        size = sc.nextInt();
        take_value(size);
    }

    private static void take_value(int size) {
        int[] input = new int[size];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < input.length; i++) {
            input[i] = sc.nextInt();
        }
        checker(input);
    }

    private static void checker(int[] input) {

        for(int i=0;i<input.length;i++){
            int value=input[i];
            sum=0;
            for(int j=0;j<input.length;j++) {
                if (value < input[j]) {
                    sum(input[j]);
                }
            }
            if(sum==0){
                product(value);
            }
            else System.out.print(sum +" ");
        }
    }

    private static void product( int i) {
        int product=0;
        product=i*i;
        System.out.print(product+" ");
    }

    private static void sum(int input) {
        sum = sum+input;

    }
}
