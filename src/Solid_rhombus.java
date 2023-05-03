
import java.util.Scanner;

public class Solid_rhombus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for(int i= 1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        // this code is also correct so you can also use that
//        //int a = 2*n-1;
//        int b= n;
//         for(int i = 1;i<=n;i++){
//             for(int j=1 ; j<=2*n-1-i+1;j++){
//                 if(j<b){
//                     System.out.print(" ");
//                 }
//                 else{
//                     System.out.print("*");
//                 }
//
//
//             }
//             b--;
//             // a--;
//             System.out.println();
//         }
    }
}
