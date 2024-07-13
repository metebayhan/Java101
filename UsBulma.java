import java.util.Scanner;

public class UsBulma {
    public static void main(String[] args){
        int deger;
        Scanner input = new Scanner(System.in);

        System.out.println("Sınır değeri belirleyiniz: ");
        deger = input.nextInt();
        
        System.out.print("Dördün kuvvetleri: ");

        for (int i = 1; i < deger; i *= 4) {
            System.out.println(i + " ");
        }
                            
        System.out.println("Beşin kuvvetleri: ");

        for (int i = 1; i < deger; i *= 5) {
            System.out.println(i + " ");
        }
      
input.close();

    }    
}
