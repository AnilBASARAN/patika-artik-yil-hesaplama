import java.util.Scanner;
public class ArtikYil {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int year;
        boolean isTrue;

        // kullanıcıdan yıl değerini alıp year değişkenine kaydediyoruz, bunu koşullarla karşılaştırıp isTrue
        // değerine  true false değerleri verip yazdırıyoruz çıktı olarak olumlu veya olumsuz olarak
        System.out.print(" Yıl Giriniz  :   ");
        year = input.nextInt();

        if(year % 100 == 0 ){
            if(year % 400 == 0) isTrue = true;
            else isTrue = false;
        }else{
            if(year % 4 == 0) isTrue = true;
            else isTrue = false;
        }
        if(isTrue) System.out.print(year + " bir artık yıldır  !");
        else System.out.print(year + " bir artık yıl değildir  !");
    }
}
