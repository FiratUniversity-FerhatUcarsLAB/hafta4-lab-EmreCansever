import java.util.Scanner;
public class MaasHesap {
    public static void main(String[] args) {

        final double Sgk= 0.14;
        final double gelirv= 0.15;
        final double Damgav= 0.00759;

        Scanner ad = new Scanner(System.in);
        System.out.println("Adınızı Soyadınızı Giriniz:");
        String isim = ad.nextLine();
        Scanner maas = new Scanner(System.in);
        System.out.println("Brüt Maaşınızı Giriniz:");
        Double netmaas = maas.nextDouble();
        Scanner hsaat = new Scanner(System.in);
        System.out.println("Haftalık Çalışma Saatinizi Giriniz:");
        Double tsaat = hsaat.nextDouble();
        Scanner msaat = new Scanner(System.in);
        System.out.println("Mesai Saatinizi Giriniz:");
        Double mesaat = msaat.nextDouble();

        double mucret= (netmaas/160)*mesaat*1.5;
        double togelir= mucret+netmaas;
        double skesıntı= netmaas*Sgk;
        double gkesıntı= netmaas*gelirv;
        double dkesıntı= netmaas*Damgav;
        double tokesıntı= skesıntı+gkesıntı+dkesıntı;
        double toplammas= netmaas-tokesıntı;



        System.out.println("===================");
        System.out.println("   MAAS BORDROSU   ");
        System.out.println("===================");
        System.out.println("Adı Soyadı:" + isim);
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("GELİRLER:");
        System.out.printf("   Brut Maas     : %s\n",netmaas);
        System.out.printf("   Mesai Ucreti  : %s\n",mucret);
        System.out.println("--------------------");
        System.out.printf("   Toplam Gelir  : %s\n" + "        ",togelir);
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("KESİNTİLER:");
        System.out.printf("   SGK Kesintisi : %s\n",skesıntı);
        System.out.printf("   Gelir Vergisi : %s\n",gkesıntı);
        System.out.printf("   Damga Vergisi : %s\n",dkesıntı);
        System.out.println("---------------------");
        System.out.printf("   Toplam Kesinti: %s\n",tokesıntı);
        System.out.println(" ");
        System.out.printf("NET MAAŞ: %s\n",toplammas);




    }
}

