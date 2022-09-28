package com.company;

public class Main {

    public static void main(String[] args)
    {
       String mesaj = "bugun hava cok guzel ";
       String yenimesaj = sehirVer();  // substring deger donduruyor  mesaj.substring(0,2);
        System.out.println(yenimesaj);
        int sayi = topla(5,4);
        System.out.println(sayi);
        int toplam = topla2(2,3,4,5,6,7,8,9,10);
        System.out.println(toplam);
    }
    public static void ekle()
    {
        System.out.println("Eklendi");
    }
    public static void sil()
    {
        System.out.println("silindi");
    }

    public static void guncelle()
    {
        System.out.println("guncellendi");
    }

     public static int  topla (int sayi1 , int sayi2)
     {
         return sayi1 + sayi2;
     }
    public static int  topla2 (int... sayilar)
    {
        int toplam = 0 ;
        for (int sayi: sayilar)
        {
            toplam+= sayi;
        }
        return toplam;
    }



    public static String sehirVer()
    {
   return "Ankara";
    }



}
