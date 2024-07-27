import java.util.Scanner;

public class TersUcgen {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Satır sayısı giriniz: ");
        int satir = input.nextInt();

        for (int i = 0; i <= satir; i++) {
            
            for (int j = 0; j <= satir - i; j++ ){
                System.out.print("*");    
            }
            System.out.println(" ");
        }
        input.close();
    }    
}
