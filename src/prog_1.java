import java.sql.SQLOutput;
import java.util.Scanner;


public class prog_1 {


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size =sc.nextInt();

        take_input(size);

    }

    private static void take_input(int size) {

        Scanner sc=new Scanner(System.in);
        int input[] = new int[size];
        for(int i=0;i<size;i++){
            input[i]=sc.nextInt();

        }

        check_digits(input);
    }
    public static void check_digits(int input[]) {

        int arr[] ={0,0,0,0,0,0,0,0,0,0};
        for(int i=0;i<input.length;i++){
            if(input[i]<9) {
                int temp=input[i];
                arr[temp]++;
            }
            else{
                int n=input[i];
                while(n!=0){
                    int rem=n%10;

                    if(rem<9) {
                        arr[rem]++;

                    }
                    n=n/10;
                }

            }
        }
        for(int i=0;i<arr.length;i++) {


            if (arr[i] > 0) {
                System.out.print(i+" ");

            }
        }
    }
    }

