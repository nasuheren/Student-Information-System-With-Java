package odev;

import java.util.Scanner;

/**
 * @author Faruk Yilmaz and NasuhEren Demirci.
 * @since 21.11.2020
 */

public class Danisman {
    /**
     * @param kullaniciadi danýþmanýn girmesi gerekn kullanýcý adý
     * @param sifre danýþmanýn girmesi gereken þifre
     * @param i yanlýþ girilir ise tekrar sordurmak için döngüde kullanýldý
     * @return getSifre için kullanýldý private deðerleri baþka class da kullanmak için
     * @return getKullaniciadi için kullanýldý private deðerleri baþka class da kullanmak için
     */
    private String kullaniciadi;
    private int sifre;
    int i = 1;

    Danisman() {
        /**
         * Danisman constructor ý danýþmanlarýn sisteme girebilmesi için kullanýldý
         */
        while (i == 1) {
            System.out.println("Lütfen kullanýcý adýnýzý ve þifrenizi giriniz: ");

            Scanner scanner = new Scanner(System.in);
            setKullaniciadi(scanner.nextLine());
            setSifre(scanner.nextInt());

            if (getKullaniciadi().equalsIgnoreCase("ali") && getSifre() == 1) {
                System.out.println("Sayýn Dr.Ali");
                break;
            } else if (getKullaniciadi().equalsIgnoreCase("veli") && getSifre() == 2) {
                System.out.println("Sayýn Dr.Veli");
                break;
            } else if (getKullaniciadi().equalsIgnoreCase("ayse") && getSifre() == 3) {
                System.out.println("Sayýn Dr.Ayþe");
                break;
            } else if (getKullaniciadi().equalsIgnoreCase("muhammet") && getSifre() == 4) {
                System.out.println("Sayýn Dr.Muhammet");
                break;
            } else if (getKullaniciadi().equalsIgnoreCase("ilber") && getSifre() == 5) {
                System.out.println("Sayýn Prof.Dr.Ýlber");
                break;
            } else if (getKullaniciadi().equalsIgnoreCase("furkan") && getSifre() == 6) {
                System.out.println("Sayýn Dr.Furkan");
                break;
            } else if (getKullaniciadi().equalsIgnoreCase("faruk") && getSifre() == 7) {
                System.out.println("Sayýn Dr.Faruk");
                break;
            } else if (getKullaniciadi().equalsIgnoreCase("nasuh") && getSifre() == 8) {
                System.out.println("Sayýn Dr.Nasuh");
                break;
            } else if (getKullaniciadi().equalsIgnoreCase("ahmet") && getSifre() == 9) {
                System.out.println("Sayýn Dr.Ahmet");
                break;
            } else if (getKullaniciadi().equalsIgnoreCase("ridvan") && getSifre() == 10) {
                System.out.println("Sayýn Dr.Rýdvan");
                break;
            } else {
                System.out.println("Bilgileri yanlýþ girdiniz.");
            }
        }

    }

    /**
     * @return getKullaniciadi için kullanýldý private deðerleri baþka class da kullanmak için
     */

    public String getKullaniciadi() {
        return kullaniciadi;
    }

    public void setKullaniciadi(String kullaniciadi) {
        this.kullaniciadi = kullaniciadi;
    }

    public int getSifre() {
        return sifre;
    }

    public void setSifre(int sifre) {
        this.sifre = sifre;
    }
}