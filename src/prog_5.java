import java.util.Scanner;

public class prog_5 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int size;
        size= sc.nextInt();
        take_value(size);
    }

    private static void take_value(int size) {
        int[] input = new int[size];
        Scanner sc= new Scanner(System.in);
        for(int i=0;i<input.length;i++){
            input[i]= sc.nextInt();
        }
        checker(input);
    }

    private static void checker(int[] input) {
        int[] arr={0,0,0,0,0,0,0,0,0,0};
        for(int i=0;i<input.length;i++){
            for(int j=i+1; j<input.length;j++){
                if(input[i]==input[j]){
                    arr[input[i]]++;

                }
            }
        }
        for(int i=0;i<arr.length;i++) {
            if (arr[i] > 2) {
                System.out.print(i+" ");
            }
        }
    }
}

