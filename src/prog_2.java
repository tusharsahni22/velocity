import java.util.Scanner;
public class prog_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size =sc.nextInt();
        take_input(size);


    }

    private static void take_input(int size) {
        Scanner sc= new Scanner(System.in);
        int[] input = new int[size];
        for(int i=0;i<size;i++){
            input[i]=sc.nextInt();
        }
        checker(input);


    }

    private static void checker(int[] input) {
        int value3 =0;
        int value4 =0;
        for(int i=0;i<input.length;i++){
            if(input[i]==3){
                for(int j=i;j<input.length;j++){
                    if(input[j]==4){
                        int temp =input[i+1];
                        input[i+1]=input[j];
                        input[j]=temp;
                    }
                }
            }
            if(input[i]==4){
                value4++;
                        
            }
        }
        for (int i=0;i<input.length;i++){
            System.out.print(input[i]+" ");
        }
    }





}
