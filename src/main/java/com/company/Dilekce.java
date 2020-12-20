package com.company;

import java.util.ArrayList;
import java.util.List;

public class Dilekce {
    private String baslik;
    private String tarih;
    private String ad,soyAd;
    private Icerik icerik;


    public String getBaslik() {
        return baslik;
    }

    public void setBaslik(String baslik) {
        this.baslik = baslik;
    }

    public Icerik getIcerik() {
        return icerik;
    }

    public void setIcerik(Icerik icerik) {
        this.icerik = icerik;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getTarih() {
        return tarih;
    }

    public void setTarih(String tarih) {
        this.tarih = tarih;
    }

    public String getSoyAd() {
        return soyAd;
    }

    public void setSoyAd(String soyAd) {
        this.soyAd = soyAd;
    }


}

class Icerik
{
    List<Enumlar.IcerikTuru> icerikTuruList = new ArrayList<>();
    String icerikMetni;

    public String getIcerikMetni() {
        return icerikMetni;
    }

    public void setIcerikMetni(String icerikMetni) {
        this.icerikMetni = icerikMetni;
    }

    public List<Enumlar.IcerikTuru> getIcerikTuruList() {
        return icerikTuruList;
    }

    public void setIcerikTuruList(Enumlar.IcerikTuru  icerikP) {
        icerikTuruList.add(icerikP);
    }
}

