import java.util.Scanner;

public class Diamond_pattern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n= input.nextInt();
        // for the rows
        for(int i=1;i<=n;i++){
            // for the spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            // for the stars
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n-1;i>=1;i--) {
            // for the spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // for the stars
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }




    }


}
