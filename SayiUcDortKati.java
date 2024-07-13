import java.util.Scanner;
public class SayiUcDortKati{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int deger;
        System.out.print("Lütfen bir değer giriniz: ");
        deger = input.nextInt();

        System.out.println("Bu sayılar üçe ve dörde tam bölünüyor:");
        
        for (int i = 0; i <= deger; i++){
            if (i % 12 != 0){
                continue;
                
            }
            System.out.println(i);
            

        } 
        input.close();

    
    }

}