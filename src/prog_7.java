import java.util.Scanner;

public class prog_7 {
    public static void main(String[] args) {

                take_input();
    }

    private static void take_input() {
        int size;
        System.out.println("Enter the size of first array");
        Scanner sc=new Scanner(System.in);
        size=sc.nextInt();
        int[] input =new int[size];
        System.out.println("Enter the elements");
        for (int i=0;i<input.length;i++){
            input[i]= sc.nextInt();
        }
        System.out.println("Enter the size of 2nd array" );
        int size2 = sc.nextInt();
        int[] input2 =new int[size2];
        System.out.println("Enter the elements");
        for (int i=0;i<input2.length;i++){
            input2[i]= sc.nextInt();
        }
        checker(input,input2);
    }

    private static void checker(int[] input, int[] input2) {
        int count=0;
        for(int i=0;i<input2.length;i++){
            for( int j=i;j<input.length;j++) {
                if(input2[i]==input[j]){
                    count++;
                    break;
                }
            }
        }

        if(count==input2.length){
            System.out.println("True");
            }
        else System.out.println("False");

    }
}
