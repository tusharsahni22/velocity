import java.util.Scanner;

public class prog_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size= sc.nextInt();
        take_input(size);
    }

    private static void take_input(int size) {
        Scanner sc=new Scanner(System.in);
        int input[]=new int[size];
        System.out.println("Enter the element in array");
        for(int i=0;i<input.length;i++){
            input[i]=sc.nextInt();
        }
        System.out.println("Enter the no. of element to check");
        int number=sc.nextInt();
        checker(input,number);

    }

    private static void checker(int[] input, int number) {
        int length =input.length-number;
        int count=0;
        for(int i=0;i<number;i++){

                if(input[i]==input[length]){
                    count++;
                    length++;

                }

        }

        if(count == number){
            System.out.println("True");
        }
        else System.out.println("False");
    }
}
