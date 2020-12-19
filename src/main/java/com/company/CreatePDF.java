package com.company;

import com.itextpdf.html2pdf.ConverterProperties;
import com.itextpdf.html2pdf.HtmlConverter;

import java.io.*;

public class CreatePDF {
    public static void PdfOlustur()
    {
        File htmlSource = new File("C:\\Users\\Dilaver\\Desktop\\eDilekce-master\\src\\htmlDilekce\\1.html");
        File pdfDest = new File("C:\\Users\\Dilaver\\Desktop\\eDilekce-master\\src\\htmlDilekce\\output.pdf");

        ConverterProperties converterProperties = new ConverterProperties();
        try {
            HtmlConverter.convertToPdf(new FileInputStream(htmlSource),
                    new FileOutputStream(pdfDest), converterProperties);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
