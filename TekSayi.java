import java.util.Scanner;

public class TekSayi {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int deger, toplam = 0;
        

        do {
        System.out.print("Lütfen bir değer giriniz:");
        deger = input.nextInt();

        if (deger % 4 == 0 || deger % 2 == 0) {
            toplam += deger;
            
        }
    } while (deger % 2 == 0 && deger > 0); {
        
        System.out.println("Toplamınız: " + toplam);
        
    } 
    

    input.close();

    }    
}
