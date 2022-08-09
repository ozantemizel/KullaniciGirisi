import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName, passWord;

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen kullanıcı adını giriniz.");
        userName=input.nextLine();
        System.out.println("Lütfen şifrenizi giriniz.");
        passWord=input.nextLine();

        if(userName.equals("Patika")&&passWord.equals("Java1234")) {
            System.out.println("Tebrikler Giriş yaptınız!");
        }else {
            System.out.println("Kullanıcı Bilgileriniz yanlış! Şifrenizi sıfırlamak isterseniz 1'e basınız." +
                    "Çıkış yapmak için 2'ye basınız.");
            int a=input.nextInt();
            if(a==1){
                Scanner inp = new Scanner(System.in);
                System.out.println("Yeni şifrenizi giriniz.");
                String newPassword = inp.nextLine();
                if(newPassword.equals("Java1234")){
                    System.out.println("Yeni şifreniz eski şifreniz ile aynı olamaz. Lütfen tekrar deneyiniz.");
                } else {
                    System.out.println("Şifreniz değiştirilmiştir.");
                }

            } else if(a==2){
                System.out.println("Çıkış yapıldı");
            } else {
                System.out.println("Hatalı giriş yaptınız!");
            }
        }
    }
}
