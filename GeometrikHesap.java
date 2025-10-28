/*
* Ad Soyad: Emre Cansever
* Ogrenci No: 250541060
* Tarih: 28.10.2025
* Aciklama: Geometrik Hesap Aracı
*/


import java.util.Scanner;

public class GeometrikHesap {
    public static void  main(String[] args) {
        final double PI = 3.14;
        System.out.println("====GEOMETRİK HESAPLAYICI====");
        Scanner yarıcap=new Scanner(System.in);
        System.out.println("YARIÇAP GİRİNİZ:");
        Double Yarıcap= yarıcap.nextDouble();
        double dairealan= Yarıcap*Yarıcap*PI;
        double dairecevre= 2*PI*Yarıcap;
        double dairecap= 2*Yarıcap;
        double kurehacim= 4/3*PI*Yarıcap*Yarıcap*Yarıcap;
        double kyuzeyalan= 4*PI*Yarıcap*Yarıcap;


        System.out.println("SONUÇLAR=");
        System.out.println("--------");
        System.out.printf("Yarıçap: %s\n",Yarıcap);
        System.out.printf("Daire Alanı: %s\n",dairealan);
        System.out.printf("Daire Çevresi: %s\n",dairecevre);
        System.out.printf("Daire Çapı: %s\n",dairecap);
        System.out.printf("Küre Hacmi: %s\n",kurehacim);
        System.out.printf("Kürenin Yüzey Alanı: %s\n",kyuzeyalan);



    }
}
