import java.util.Scanner;
public class BuyuktenKucuge{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double a, b, c;

        System.out.print("Birinci sayıyı giriniz: ");
        a = input.nextDouble();
        System.out.print("İkinci sayıyı giriniz: ");
        b = input.nextDouble();
        System.out.print("Üçüncü sayıyı giriniz: ");
        c = input.nextDouble();
    
        if (a > b && a > c) {
            if (b > c) {
                System.out.println("Sıralamanız: " + a + " > " + b + " > " + c);
            } else { 
                System.out.println("Sıralamanız: " + a + " > " + c + " > " + b);
            }
        } else if (b > a && b > c) {
            if (a > c) {
                System.out.println("Sıralamanız: " + b + " > " + a + " > " + c);
            } else { 
                System.out.println("Sıralamanız: " + b + " > " + c + " > " + a);
            } } else if (c > a && c > b) {
                if (a > b) {
                    System.out.println("Sıralamanız: " + c + " > " + a + " > " + b);   
                } else {
                    System.out.println("Sıralamanız: " + c + " > " + b + " > " + a);
                }
            }
                 else {
                    System.out.println("Geçerli bir değer giriniz.");
                }
                input.close();
}
}