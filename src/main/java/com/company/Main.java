package com.company;

public class Main {
    private static Depo cagir = new Depo();

    public static void main(String[] args) {

        System.out.print("KATEGORİ SEÇİNİZ");

        for (Enumlar.GenelKategori a : Enumlar.GenelKategori.values()) {

            System.out.println("\n"+ a.toString().replace('_',' ')
            );
        }

        //Depo.Dilekces(Enumlar.DilekceKategori.Bosanma_Dilekcesi);
            CreatePDF.PdfOlustur();
    }

}
