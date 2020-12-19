package com.company;


import static com.company.CreateDilekce.DilekceOlustur;

public class Depo {

    public static void Dilekces(Enumlar.DilekceKategori gelenKategori)
    {
        switch (gelenKategori)
        {

            case Bosanma_Dilekcesi -> {
                Icerik bosanma = new Icerik();
                bosanma.setIcerikTuruList(Enumlar.IcerikTuru.yazi);
                bosanma.setIcerikMetni("Lorem ipsum dolor sit amet, *patoto0* " +
                        " adipiscing elit" + "Donec feugiat patoto1 *patoto1* ultrices." +
                        " Proin sed lectus nulla.");
                DilekceOlustur(bosanma);
            }
            case Izin_Dilekcesi -> {
            }
        }
        //bosanma dilekcesi

    }

}
