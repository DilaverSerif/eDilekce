package com.company;


import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;


public class CreateDilekce {

    private static List<String> gelenCevaplar = new ArrayList<>();

    public static void DilekceOlustur(Icerik icerik)
    {
        gelenCevaplar = CreateFragment.Cevaplar(icerik);

        Dilekce yeniDilekce = new Dilekce();

        yeniDilekce.setIcerik(icerik);
        yeniDilekce.setAd(gelenCevaplar.get(0)); //ad
        yeniDilekce.setSoyAd(gelenCevaplar.get(1)); //soyad
        yeniDilekce.setTarih(gelenCevaplar.get(2)); //TARİH
        yeniDilekce.setBaslik(gelenCevaplar.get(3)); //BASLIK
        yeniDilekce.getIcerik().setIcerikMetni(IcerikOlusturucu(yeniDilekce.getIcerik().icerikMetni));

        System.out.print(yeniDilekce.getIcerik().getIcerikMetni());
    }

    private static String IcerikOlusturucu(String gelenIcerik)
    {
        String yeniMetin = gelenIcerik; //eşitledik

        //CREATEFRAGMENTDEN GELEN CEVAPLARI BURADA KULLANIYORUZ
        if (gelenIcerik.contains("*patoto0*")) //içinde patoto varmi baktik
        {
            for (int i  = 0; i < gelenCevaplar.size(); i++)
            {
                String kelime = "*patoto"+i+"*";
                yeniMetin = StringUtils.replace(yeniMetin,kelime,gelenCevaplar.get(i)); //Tüm patotlar degisti
            }

            /*
                int count = StringUtils.countMatches(gelenIcerik, "*patoto*"); //Apache kütüphanesi ile kaç adet baktık
            for (int i = 0; i < count; i++) {
                //int bolmeBolgesi = yeniMetin.indexOf("*patoto*"); //patoto istenilen deger ile degistirdik

                //yeniMetin = yeniMetin.substring(0,bolmeBolgesi) + gelenYanit + yeniMetin.substring(bolmeBolgesi+8);
            }*/ //KÜTÜPHANESİZ

            return yeniMetin;
        }
        else return "HATA! İÇİREK BOZUK";
    }

}
