package com.company;


import org.apache.commons.lang3.StringUtils;


public class CreateDilekce {

    public void DilekceOlustur(String ad,String soyAd,String baslik,Icerik icerik)
    {
        dilekce yeniDilekce = new dilekce();

        yeniDilekce.setAd(ad);
        yeniDilekce.setSoyAd(soyAd);
        yeniDilekce.setBaslik(baslik);

        yeniDilekce.setIcerikMetni("Lorem ipsum dolor sit amet, *patoto0*  adipiscing elit. Donec feugiat *patoto1* tincidunt ultrices. Proin sed lectus nulla.");



        //içinde kelime arayalım ve o kelime yerine kullanıcının girecegi metni veya tarihi yazdıralim
        //Kelimemiz *patoto*

        System.out.println(IcerikOlusturucu(yeniDilekce.getIcerikMetni(), "MERHABA BEN ICERIK", icerik.getIcerikTuruList().size()));


    }

    private String IcerikOlusturucu(String gelenIcerik,String gelenYanit,int degisimSayisi)
    {
        String yeniMetin = gelenIcerik; //eşitledik

        if (gelenIcerik.contains("*patoto0*")) //içinde patoto varmi baktik
        {
            for (int i  = 0; i < degisimSayisi; i++)
            {
                String kelime = "*patoto"+i+"*";
                yeniMetin = StringUtils.replace(yeniMetin,kelime,"DENEME"); //Tüm patotlar degisti
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
