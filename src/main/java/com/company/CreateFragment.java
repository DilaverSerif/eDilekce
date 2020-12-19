package com.company;

import java.util.*;

public class CreateFragment {

    static Scanner tarayici = new Scanner(System.in);

    public static List<String> Cevaplar(Icerik gelenIcerik)
    { //FRAGMENT YARATIP CEVAPLARI GERİ DÖNDÜRÜYOR
        String cevap;
        List<String> cevaplar = new ArrayList<>();

        /*
        LİSTE 0 - AD
        LİSTE 1 - SOYAD
        LİSTE 2 - TARİH
        LİSTE 3 - BASLIK
         */
        System.out.print("AD");
        cevaplar.add(0,tarayici.next());
        System.out.print("SOYAD");
        cevaplar.add(1,tarayici.next());
        System.out.print("TARİH");
        cevaplar.add(2,tarayici.next()); //tarih seçtirme ekleriz android studio
        System.out.print("KURUM");
        cevaplar.add(3,tarayici.next());

        for (int i = 0; i < gelenIcerik.getIcerikTuruList().size(); i++)
        {
            switch (gelenIcerik.getIcerikTuruList().get(i))
            {
                case yazi -> {
                    //BURAYA TEXT ALINACAK KOD GIRILICEK
                    cevap = tarayici.next();
                }
                case sayi -> {
                    cevap = String.valueOf(tarayici.nextInt());
                }
                case tarih -> {
                    Date tarih = Calendar.getInstance().getTime(); //şuan bu zamani alıyor sadece
                    cevap = tarih.toString();
                }

                default -> cevap = "HATA";
            }

            cevaplar.add(cevap);

        }

        return cevaplar;
    }

}
