import java.util.Scanner;
    public class KDVTutari {
        public static void main(String[] args) {
           
            double tutar; 
            Scanner input = new Scanner(System.in);
            System.out.println("Tutar Giriniz: ");
            tutar = input.nextDouble();
            double kdvOrani = (tutar <= 1000) ? 0.18 : 0.08;
            double kdvTutar = tutar * kdvOrani;
            double kdvliTutar = tutar + kdvTutar;
            System.out.println("Katma Değer Vergisi: " + kdvTutar);
            System.out.println("KDV Hariç: " + tutar);
            System.out.println("KDV Dahil: " + kdvliTutar);

            



    

    
        }
    }