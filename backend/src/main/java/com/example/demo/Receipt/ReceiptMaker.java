package com.example.demo.Receipt;

import com.itextpdf.kernel.font.PdfFontFactory;
import com.itextpdf.kernel.geom.PageSize;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.borders.Border;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.FileNotFoundException;
import java.io.IOException;

@RequestMapping("/api/v1/")
public class ReceiptMaker {


    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/test")
    public void generateReceipt(String ticketNo) throws IOException {
        // Directory and name of file
        String currentDir = System.getProperty("user.dir");
        String path = currentDir + "/src/Receipt/" + ticketNo + ".pdf";

        PdfWriter pdfWriter = new PdfWriter(path);
        PdfDocument pdfDocu = new PdfDocument(pdfWriter);
        pdfDocu.addNewPage();

        Document doc = new Document(pdfDocu);
        doc.close();

        System.out.println(path);


    }

}
