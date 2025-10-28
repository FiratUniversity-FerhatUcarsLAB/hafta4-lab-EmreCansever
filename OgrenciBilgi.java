/*
* Ad Soyad: Emre Cansever
* Ogrenci No: 250541060
* Tarih: 28.10.2025
* Aciklama: Öğrenci Bilgi Sistemi
*/

import java.util.Scanner;
public class OgrenciBilgi {
    public static void main(String[] args) {


        System.out.println("  ÖĞRENCİ BİLGİ SİSTEMİ");
        Scanner isim = new Scanner(System.in);
        System.out.println("Adınızı giriniz:");
        String Ad= isim.nextLine();
        Scanner soyisim = new Scanner(System.in);
        System.out.println("Soyisim giriniz:");
        String Soyisim= soyisim.nextLine();
        Scanner OgrNo= new Scanner(System.in);
        System.out.println("Öğrenci numaranızı giriniz:");
        int Numara= OgrNo.nextInt();
        Scanner yas= new Scanner(System.in);
        System.out.println("Yaşınızı giriniz:");
        int Yas= yas.nextInt();
        Scanner gpa = new Scanner(System.in);
        System.out.printf("Not ortalamanızı giriniz:");
        double Gpa= gpa.nextDouble();



        System.out.println(" ÖĞRENCİ BİLGİ SİSTEMİ");
        System.out.println("ÖĞRENCİ ADI:" + Ad);
        System.out.println("ÖĞRENCİ SOYADI:" + Soyisim);
        System.out.println("ÖĞRENCİ NUMARASI:" + Numara);
        System.out.println("ÖĞRENCİ YAŞI:" + Yas);
        System.out.printf("GPA: %s",Gpa);
    }
}
