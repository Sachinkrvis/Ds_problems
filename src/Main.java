import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int n= input.nextInt();
        int a= 2*n;
        for(int i = 1;i<=n;i++){
            for(int j=1 ;j<=a;j++){
                if(i <j  && j< a-i+1){
                    System.out.print(" ");

                }
                else{
                    System.out.print("*");
                }

            }
            System.out.println("");
        }

        for(int i=n;i>0;i--){
            for(int j=a;j>0;j--){
                if(i<j && j<a-i+1){
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }

            }
            System.out.println("");
        }
    }
}