package odev;

import java.util.Scanner;

/**
 * @author Faruk Yilmaz and NasuhEren Demirci.
 * @since 21.11.2020
 */

public class DersProgrami {
    /**
     * @param gun burda switch-case girilicek olan sayilar icin tanimlandi.
     * @param donem donemi seçmek için tanýmladýk.
     */
    int gun, donem;


    public double Program() {
        /**
         * Program  adinda metod actik. Burda hangi gun hangi dersi varsa onu ogrenmesi icin program yazdik ve istedigi gunu konsoldan giricek sekilde kodladik.
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen hangi dönemin programina bakmak istiyorsaniz o dönemin yanindaki sayi degerini giriniz:");
        System.out.println("1- 1.Donem\n 2- 2.Donem\n 3- 3.Donem\n 4- 4.Donem\n 5- 5.Donem\n 6- 6.Donem\n 7- 7.Donem\n 8- 8.Donem");
        System.out.println(" Seciminiz: ");
        donem = input.nextInt();
        // her döneme ait ders programýný görmek için buradan seçim yaptýrýyoruz.
        switch (donem) {
            case 1:
                System.out.println("Lutfen hangi gunun programina bakmak istiyorsaniz o gunun yanindaki sayi degerini giriniz:");
                System.out.println("1- Pazartesi:\n 2- Sali:\n 3- Carsamba:\n 4- Persembe:\n 5- Cuma:\n 6-Cumartesi:\n 7-Pazar:");
                System.out.println(" Seciminiz: ");
                gun = input.nextInt();
                switch (gun) {
                    // Burda gunlerin karsiligi gelen sayilardan birini girerek o gunun porgraminda dersi varmi varsada hangi dersi var onu ogreniyor.
                    case 1:
                        System.out.println("Pazartesi gunu Nesne BÝLGÝSAYAR PROGRAMLAMA I dersiniz var.");
                        break;
                    case 2:
                        System.out.println("Sali gunu FÝZÝK I dersiniz var.");
                        break;
                    case 3:
                        System.out.println("Carsamba gunu MATEMATÝK I dersiniz var. ");
                        break;
                    case 4:
                        System.out.println("Persembe gunu BÝLGÝSAYAR MÜHENDÝSLÝÐÝNE GÝRÝÞ dersiniz var.");
                        break;
                    case 5:
                        System.out.println("Cuma gunu TÜRK DÝLÝ I ve YABANCI DÝL I (ÝNG.) var.");
                        break;
                    case 6:
                        System.out.println("Cumartesi gunu dersiniz bulunmamaktadir");
                        break;
                    case 7:
                        System.out.println("Pazar gunu dersiniz bulunmamaktadir.");
                        break;
                    default:
                        System.out.println("Gecersiz bir islem.Lutfen tekrar giriniz.");
                }
                break;
            case 2:
                System.out.println("Lutfen hangi gunun programina bakmak istiyorsaniz o gunun yanindaki sayi degerini giriniz:");
                System.out.println("1- Pazartesi:\n 2- Sali:\n 3- Carsamba:\n 4- Persembe:\n 5- Cuma:\n 6-Cumartesi:\n 7-Pazar:");
                System.out.println(" Seciminiz: ");
                gun = input.nextInt(); /** @param 'int' gun'unun icine konsoldan deger aliyoruz.*/
                switch (gun) {
                    // Burda gunlerin karsiligi gelen sayilardan birini girerek o gunun porgraminda dersi varmi varsada hangi dersi var onu ogreniyor.
                    case 1:
                        System.out.println("Pazartesi gunu TÜRK DÝLÝ II dersiniz var.");
                        break;
                    case 2:
                        System.out.println("Sali gunu YABANCI DÝL II (ÝNG.) ve BÝLGÝSAYAR PROGRAMLAMA II dersiniz var.");
                        break;
                    case 3:
                        System.out.println("Carsamba gunu MATEMATÝK II dersiniz var. ");
                        break;
                    case 4:
                        System.out.println("Persembe gunu FÝZÝK II dersiniz var.");
                        break;
                    case 5:
                        System.out.println("Cuma gunu LÝNEER CEBÝR dersiniz var.");
                        break;
                    case 6:
                        System.out.println("Cumartesi gunu dersiniz bulunmamaktadir");
                        break;
                    case 7:
                        System.out.println("Pazar gunu dersiniz bulunmamaktadir.");
                        break;
                    default:
                        System.out.println("Gecersiz bir islem.Lutfen tekrar giriniz.");
                }
                break;
            case 3:
                System.out.println("Lutfen hangi gunun programina bakmak istiyorsaniz o gunun yanindaki sayi degerini giriniz:");
                System.out.println("1- Pazartesi:\n 2- Sali:\n 3- Carsamba:\n 4- Persembe:\n 5- Cuma:\n 6-Cumartesi:\n 7-Pazar:");
                System.out.println(" Seciminiz: ");
                gun = input.nextInt(); /** @param 'int' gun'unun icine konsoldan deger aliyoruz.*/
                switch (gun) {
                    // Burda gunlerin karsiligi gelen sayilardan birini girerek o gunun porgraminda dersi varmi varsada hangi dersi var onu ogreniyor.
                    case 1:
                        System.out.println("Pazartesi gunu Nesne Yonelimli Programlama dersiniz var.");
                        break;
                    case 2:
                        System.out.println("Sali gunu dersiniz bulunmamaktadir.");
                        break;
                    case 3:
                        System.out.println("Carsamba gunu Diferansiyel Denklemler dersiniz var. ");
                        break;
                    case 4:
                        System.out.println("Persembe gunu Elektrik Muhendisliginin Temelleri dersiniz var.");
                        break;
                    case 5:
                        System.out.println("Cuma gunu Olasilik ve istatistik dersiniz var.");
                        break;
                    case 6:
                        System.out.println("Cumartesi gunu dersiniz bulunmamaktadir");
                        break;
                    case 7:
                        System.out.println("Pazar gunu dersiniz bulunmamaktadir.");
                        break;
                    default:
                        System.out.println("Gecersiz bir islem.Lutfen tekrar giriniz.");
                }
                break;
            case 4:
                System.out.println("Lutfen hangi gunun programina bakmak istiyorsaniz o gunun yanindaki sayi degerini giriniz:");
                System.out.println("1- Pazartesi:\n 2- Sali:\n 3- Carsamba:\n 4- Persembe:\n 5- Cuma:\n 6-Cumartesi:\n 7-Pazar:");
                System.out.println(" Seciminiz: ");
                gun = input.nextInt(); /** @param 'int' gun'unun icine konsoldan deger aliyoruz.*/
                switch (gun) {
                    // Burda gunlerin karsiligi gelen sayilardan birini girerek o gunun porgraminda dersi varmi varsada hangi dersi var onu ogreniyor.
                    case 1:
                        System.out.println("Pazartesi gunu ATATÜRK ÝLK. VE ÝNK. TARÝHÝ II dersiniz var.");
                        break;
                    case 2:
                        System.out.println("Sali gunu AYRIK MATEMATÝK dersiniz var.");
                        break;
                    case 3:
                        System.out.println("Carsamba gunu ELEKTRONÝK DEVRELER dersiniz var. ");
                        break;
                    case 4:
                        System.out.println("Persembe gunu BÝLGÝSAYAR MÝMARÝSÝ ve GÖRSEL PROGRAMLAMA dersiniz var.");
                        break;
                    case 5:
                        System.out.println("Cuma gunu VERÝ YAPILARI VE ALGORÝTMALAR dersiniz var.");
                        break;
                    case 6:
                        System.out.println("Cumartesi gunu dersiniz bulunmamaktadir");
                        break;
                    case 7:
                        System.out.println("Pazar gunu dersiniz bulunmamaktadir.");
                        break;
                    default:
                        System.out.println("Gecersiz bir islem.Lutfen tekrar giriniz.");
                }
                break;
            case 5:
                System.out.println("Lutfen hangi gunun programina bakmak istiyorsaniz o gunun yanindaki sayi degerini giriniz:");
                System.out.println("1- Pazartesi:\n 2- Sali:\n 3- Carsamba:\n 4- Persembe:\n 5- Cuma:\n 6-Cumartesi:\n 7-Pazar:");
                System.out.println(" Seciminiz: ");
                gun = input.nextInt(); /** @param 'int' gun'unun icine konsoldan deger aliyoruz.*/
                switch (gun) {
                    // Burda gunlerin karsiligi gelen sayilardan birini girerek o gunun porgraminda dersi varmi varsada hangi dersi var onu ogreniyor.
                    case 1:
                        System.out.println("Pazartesi gunu ÝÞLETÝM SÝSTEMLERÝ dersiniz var.");
                        break;
                    case 2:
                        System.out.println("Sali gunu VERÝTABANI YÖNETÝMÝ dersiniz var.");
                        break;
                    case 3:
                        System.out.println("Carsamba gunu MANTIKSAL DEVRE TASARIMI dersiniz var. ");
                        break;
                    case 4:
                        System.out.println("Persembe gunu SAYISAL ANALÝZ dersiniz var.");
                        break;
                    case 5:
                        System.out.println("Cuma gunu BÝLÝÞÝM ETÝÐÝ VE HUKUKU ve BÖLÜM SEÇMELÝ I dersiniz var.");
                        break;
                    case 6:
                        System.out.println("Cumartesi gunu dersiniz bulunmamaktadir");
                        break;
                    case 7:
                        System.out.println("Pazar gunu dersiniz bulunmamaktadir.");
                        break;
                    default:
                        System.out.println("Gecersiz bir islem.Lutfen tekrar giriniz.");
                }
                break;
            case 6:
                System.out.println("Lutfen hangi gunun programina bakmak istiyorsaniz o gunun yanindaki sayi degerini giriniz:");
                System.out.println("1- Pazartesi:\n 2- Sali:\n 3- Carsamba:\n 4- Persembe:\n 5- Cuma:\n 6-Cumartesi:\n 7-Pazar:");
                System.out.println(" Seciminiz: ");
                gun = input.nextInt(); /** @param 'int' gun'unun icine konsoldan deger aliyoruz.*/
                switch (gun) {
                    // Burda gunlerin karsiligi gelen sayilardan birini girerek o gunun porgraminda dersi varmi varsada hangi dersi var onu ogreniyor.
                    case 1:
                        System.out.println("Pazartesi gunu BÖLÜM DIÞI SEÇMELÝ I dersiniz var.");
                        break;
                    case 2:
                        System.out.println("Sali gunu BÖLÜM SEÇMELÝ II dersiniz var.");
                        break;
                    case 3:
                        System.out.println("Carsamba gunu YAZILIM MÜHENDÝSLÝÐÝ dersiniz var. ");
                        break;
                    case 4:
                        System.out.println("Persembe gunu MÝKROÝÞLEMCÝLER dersiniz var.");
                        break;
                    case 5:
                        System.out.println("Cuma gunu ÝSTATÝSTÝKSEL ANALÝZ ve AÐ TEKNOLOJÝLERÝ dersiniz var.");
                        break;
                    case 6:
                        System.out.println("Cumartesi gunu dersiniz bulunmamaktadir");
                        break;
                    case 7:
                        System.out.println("Pazar gunu dersiniz bulunmamaktadir.");
                        break;
                    default:
                        System.out.println("Gecersiz bir islem.Lutfen tekrar giriniz.");
                }
                break;
            case 7:
                System.out.println("Lutfen hangi gunun programina bakmak istiyorsaniz o gunun yanindaki sayi degerini giriniz:");
                System.out.println("1- Pazartesi:\n 2- Sali:\n 3- Carsamba:\n 4- Persembe:\n 5- Cuma:\n 6-Cumartesi:\n 7-Pazar:");
                System.out.println(" Seciminiz: ");
                gun = input.nextInt(); /** @param 'int' gun'unun icine konsoldan deger aliyoruz.*/
                switch (gun) {
                    // Burda gunlerin karsiligi gelen sayilardan birini girerek o gunun porgraminda dersi varmi varsada hangi dersi var onu ogreniyor.
                    case 1:
                        System.out.println("Pazartesi gunu BÝLGÝSAYAR PROJESÝ dersiniz var.");
                        break;
                    case 2:
                        System.out.println("Sali gunu SOSYAL SEÇMELÝ II dersiniz var.");
                        break;
                    case 3:
                        System.out.println("Carsamba gunu ÝÞ SAÐLIÐI VE GÜVENLÝÐÝ I ve BÖLÜM SEÇMELÝ V dersiniz var. ");
                        break;
                    case 4:
                        System.out.println("Persembe gunu BÖLÜM SEÇMELÝ III dersiniz var.");
                        break;
                    case 5:
                        System.out.println("Cuma gunu BÖLÜM SEÇMELÝ IV dersiniz var.");
                        break;
                    case 6:
                        System.out.println("Cumartesi gunu dersiniz bulunmamaktadir");
                        break;
                    case 7:
                        System.out.println("Pazar gunu dersiniz bulunmamaktadir.");
                        break;
                    default:
                        System.out.println("Gecersiz bir islem.Lutfen tekrar giriniz.");
                }
                break;
            case 8:
                System.out.println("Lutfen hangi gunun programina bakmak istiyorsaniz o gunun yanindaki sayi degerini giriniz:");
                System.out.println("1- Pazartesi:\n 2- Sali:\n 3- Carsamba:\n 4- Persembe:\n 5- Cuma:\n 6-Cumartesi:\n 7-Pazar:");
                System.out.println(" Seciminiz: ");
                gun = input.nextInt(); /** @param 'int' gun'unun icine konsoldan deger aliyoruz.*/
                switch (gun) {
                    // Burda gunlerin karsiligi gelen sayilardan birini girerek o gunun porgraminda dersi varmi varsada hangi dersi var onu ogreniyor.
                    case 1:
                        System.out.println("Pazartesi gunu BÖLÜM SEÇMELÝ VI dersiniz var.");
                        break;
                    case 2:
                        System.out.println("Sali gunu BÖLÜM SEÇMELÝ VII dersiniz var.");
                        break;
                    case 3:
                        System.out.println("Carsamba gunu BÖLÜM DIÞI SEÇMELÝ II dersiniz var. ");
                        break;
                    case 4:
                        System.out.println("Persembe gunu GÝRÝÞÝMCÝLÝK dersiniz var.");
                        break;
                    case 5:
                        System.out.println("Cuma gunu ÝÞ SAÐLIÐI VE GÜVENLÝÐÝ II dersiniz var.");
                        break;
                    case 6:
                        System.out.println("Cumartesi gunu dersiniz bulunmamaktadir");
                        break;
                    case 7:
                        System.out.println("Pazar gunu dersiniz bulunmamaktadir.");
                        break;
                    default:
                        System.out.println("Gecersiz bir islem.Lutfen tekrar giriniz.");
                }
                break;
        }


        return gun; /** @return 'gun'  burda hangi gun girildiyse o degeri dondurucek*/

    }
}