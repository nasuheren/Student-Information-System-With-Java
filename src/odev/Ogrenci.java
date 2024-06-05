package odev;

import java.util.Random;
import java.util.Scanner;

/**
 * @author Faruk Yilmaz and NasuhEren Demirci.
 * @since 21.11.2020
 */

public class Ogrenci {
    /**
     * @param ogrNo öðrenci numarasýný girmek için tanýmlandý
     * @param name öðrenci ismini girmek için tanýmlandý
     * @param yas öðrencinin yaþýný göstermek için kullanýldý
     * @param tcNo öðrencinin kimlik numarasý için kullanýldý
     * @param devam danýþmanýn sistemi kullanmasý için tanýmlandý
     * @param i for döngüsü için kullanýldý
     */
    private int ogrNo;
    private String name;
    private int yas;
    private int tcNo;
    String devam = "E";
    int i = 0;


    Ogrenci(int yas) {
        /**
         * Ogrenci constructor'ý öðrenci ile ilgili olan bilgilerin yer aldýðý metod olarak tanýmlandý
         */

        for (i = 0; i < 40; i++) {
            System.out.println("Not girmek için 'E', girmemek için 'H' ye basýnýz: ");
            Scanner girdi = new Scanner(System.in);
            devam = girdi.nextLine();
            if (devam.equalsIgnoreCase("E")) {
                System.out.println("Öðrenci ismini giriniz: ");
                System.out.println("Öðrencinin numarasýný giriniz: ");
                this.yas = yas;
                Random sayi = new Random();
                tcNo = sayi.nextInt(2147483645);
                Scanner scanner = new Scanner(System.in);
                name = scanner.nextLine();
                ogrNo = scanner.nextInt();
                System.out.println("TC No:" + getTcNo() + "\nYas:" + getYas() + "\nAd:" + getName() + "\nOkul Numarasý:" + getOgrNo());
                System.out.println("Not girmek için 1'e , Ders programýný görmek için 2'ye basýnýz: ");
                Scanner input = new Scanner(System.in);
                int secim = input.nextInt();

                switch (secim) {
                    case 1:
                        Ders ders1 = new Ders(0, 0, 0);
                        System.out.println("Ortalamasi: " + ders1.Ortalama());
                        System.out.println("Kredisi: " + ders1.Kredi());
                        System.out.println("Transkript: " + ders1.Transkript());
                        break;
                    case 2:
                        DersProgrami program1 = new DersProgrami();
                        System.out.println("Ogrencinin Ders Programi: " + program1.Program());
                        break;
                }
            } else if (devam.equalsIgnoreCase("H")) {
                break;
            } else {
                System.out.println("Belirtilen harfler dýþýnda baþka bir þey girmeyiniz.");
            }
        }
        System.out.println("Ýþleminiz tamamlanmýþtýr.");
    }

    /**
     * @return öðrenci hakkýnda bilgiler private olduðu için onlarý baþka kullanmamýz gerektiðinen return olarak döndürdük
     */
    public int getOgrNo() {

        return ogrNo;
    }


    public String getName() {
        return name;
    }


    public int getYas() {

        return yas;
    }


    public int getTcNo() {

        return tcNo;
    }


}