import java.util.Scanner;

public class Prog_4 {
    private static int a=0;
    private static int b=0;
    private static int next=1;
    private static int febo=0;

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number of line you want to print");
        int line= sc.nextInt();
        for(int i=0;i<=line;i++){
            for(int j=0;j<i;j++) {

                System.out.print(feboc()+" ");


            }
            System.out.println("");
        }


    }



    private static int feboc() {

        int febo=0;
         a=b;
         b=next;
         febo=a+b;
         next=febo;
         return febo ;
    }
}
