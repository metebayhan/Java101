import java.util.Scanner;
public class ATM {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String username, password;
        int attempt = 4, option;
        double balance = 2500, deposit, withdraw;

        while (attempt > 0) {
            
        System.out.print("Kullanıcı Adı: ");
        username = input.nextLine();
        System.out.print("Parola: ");
        password = input.nextLine();

       
        
        if (username.equals("username") && password.equals("password")) {
       do {
            System.out.println("Yapacağınız işlemi seçiniz: Bakiye Öğrenme [1] | Para Yatırma [2] | Para Çekme [3] | Çıkış [4]");
        option = input.nextInt();      
        switch (option) {
            
            case 1:
            System.out.println("Bakiyeniz: " + balance);
            break;
            
            case 2:
            System.out.print("Yatırmak istediğiniz tutarı giriniz: ");
            deposit = input.nextDouble();
            balance += deposit;
            System.out.println("Güncel bakiyeniz: " + balance);
            break;

            case 3:
            System.out.print("Çekmek istediğiniz tutarı giriniz: ");
            withdraw = input.nextDouble();
            if (withdraw <= balance) {
                balance -= withdraw;
            } else {
                System.out.println("Yetersiz bakiye.");
            }
            break;

            case 4:
            System.out.println("Çıkış yaptınız.");
            input.nextLine();
            break;

            default: 
            System.out.println("Lütfen geçerli bir işlem giriniz.");
       }
            } while (option != 4); {}
        }  else  { 
            attempt--;
            System.out.println("Hatalı şifre veya kullanıcı adı girdiniz. Kalan hakkınız: " + attempt + "/3");
             if (attempt == 0) {
                System.out.println("Hesabınız bloke edildi. Lütfen bankanızla iletişime geçiniz."); }
                
    }  

    
    
} 
    input.close();
    }
} 

