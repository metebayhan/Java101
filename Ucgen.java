import java.util.Scanner;
public class Ucgen {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Satır sayısı giriniz: ");
        int n = input.nextInt();

        for (int i = 1; i <= n; i++){
            for (int a = 1; a <= n - i; a++){
                System.out.print(" ");
            }
            for (int b = 1; b < 2*i + 1; b++){
                System.out.print("*");
            }
            System.out.println();
        }
        input.close();
    }    
    
}
