package projeler;
import java.util.Scanner;
public class hesapyap {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        System.out.println("1-Toplama 2-Çıkarma 3-Çarpma 4-Bölme 5-Üslü ifade hesapla 6-Karekök 7-Hipotenüs Hesapla");
        System.out.println("Hangi işlemi yapmak istersiniz?");
        int islem= scanner.nextInt();
        if(islem==1){
            toplama();
        }
        else if(islem==2){
            çıkarma();
        }
        else if(islem==3){
            çarpma();
        }
        else if(islem==4){
            bölme();
        }
        else if(islem==5){
            üslü_ifade();
        }
        else if(islem==6){
            System.out.println("Hangi sayının karekökünü bulmak istersiniz: ");
            double sayi= scanner.nextInt();
            sayi=Math.sqrt(sayi);
            System.out.println(sayi);
        }
        else if(islem==7){
            hipotenushesapla();
        }
        else{
            System.out.println("Geçersiz bir değer girdiniz!");
        }
    }
    static void toplama(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir sayı girin: ");
            int sayi= scanner.nextInt();
            int toplam=sayi;
            while(sayi!=0){
                System.out.println("Bir sayı giriniz(Çıkış için 0): ");
                sayi= scanner.nextInt();
                toplam=toplam+sayi;
            }
            System.out.println(toplam);
    }
    static void çıkarma(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir sayı giriniz: ");
        int sayi= scanner.nextInt();
        int sonuc=sayi;
        while(sayi!=0){
            System.out.println("Çıkartacağınız sayıyı giriniz(Çıkış için 0): ");
            sayi= scanner.nextInt();
            sonuc= sonuc-sayi;
        }
        System.out.println(sonuc);
    }
    static void çarpma(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir sayı giriniz: ");
        int sayi= scanner.nextInt();
        int sonuc=sayi;
        while(sayi!=1){
            System.out.println("Bir çarpan giriniz(Çıkış için 1): ");
            sayi= scanner.nextInt();
            sonuc=sonuc*sayi;
        }
        System.out.println(sonuc*1);
    }
    static void bölme(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bölüneni girin: ");
        int sayi= scanner.nextInt();
        double sonuc=sayi;
        while(sayi!=1){
            System.out.println("Bölen giriniz(Çıkış için 1): ");
             sayi= scanner.nextInt();
            sonuc=sonuc/sayi;    
        }
        System.out.println(sonuc);
    }
    static void üslü_ifade(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Üslü ifadenin tabanını girin: ");
        int taban= scanner.nextInt();
        System.out.println("Üslü ifadenin üssünü girin: ");
        int üs= scanner.nextInt();
        int sonuc=1;
        while(üs>0){
            sonuc=sonuc*taban;
            üs=üs-1;
        }
        System.out.println(sonuc);
    }
    static void hipotenushesapla(){
        Scanner scanner =new Scanner(System.in);
        System.out.println("Üçgenin dik kenarlarından birinin uzunluğunu giriniz.");
        int x=scanner.nextInt();
        System.out.println("Üçgenin diğer dik kenarının uzunluğunu girin.");
        int y=scanner.nextInt();
        double z=(x*x)+(y*y);
          z= Math.sqrt(z);
        System.out.println("Üçgenin hipotenüsünün uzunluğu: "+z);
    }
}
