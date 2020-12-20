package com.company;

public class Main {
    static CreateDilekce DilekceOlustur = new CreateDilekce();

    public static void main(String[] args) {
        Icerik deneme = new Icerik();
        deneme.setIcerikTuruList(Enumlar.IcerikTuru.yazi);
        deneme.setIcerikTuruList(Enumlar.IcerikTuru.sayi);
        //deneme.setIcerikTuruList(Enumlar.IcerikTuru.tarih);

        DilekceOlustur.DilekceOlustur("dilo","deneme","oylesine",deneme);
    }
}
