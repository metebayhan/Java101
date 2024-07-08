import java.util.Scanner;
public class VucutKitle {
    public static void main(String[] args) {
        double kilo, boy, kitleIndex;
        Scanner input = new Scanner(System.in);
        System.out.print("Boyunuz: " );
        boy = input.nextDouble();
        System.out.print("Kilonuz: ");
        kilo = input.nextDouble(); 
        kitleIndex = kilo / (boy * boy);
        System.out.println("Vücut Kitle Indeksiniz: " + kitleIndex);
        
        if (kitleIndex <= 24.9 && kitleIndex >= 18.5) {
            System.out.println("Vücut kitle indeksiniz için normal kilo aralığındasınız.");
        } 
        
        else {
            System.out.println("Vücut kitle indeksiniz için normal kilo aralığında değilsiniz. ");
        }
        }
        
    }
    

