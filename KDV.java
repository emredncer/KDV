import java.util.Scanner;
public class KDV {
    public static void main(String[] args) {
        double girdi, kdvOrani, toplam, kdv;
        Scanner deger = new Scanner(System.in);
        System.out.print("Fiyat bilgisi giriniz: ");
        girdi = deger.nextDouble();
        kdvOrani = (girdi >= 1000) ? 0.18 : 0.8;
        kdv = girdi * kdvOrani;
        toplam = kdv+girdi;
        System.out.println("Ürün için kdv orani: "+ kdvOrani);
        System.out.println("Ürün için kdv miktarı: "+kdv);
        System.out.println("Ürünün kdvli fiyatı: "+ toplam);
    }
}
