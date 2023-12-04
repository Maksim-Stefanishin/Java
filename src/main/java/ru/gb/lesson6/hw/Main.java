package ru.gb.lesson6.hw;

public class Main {
    public static void main(String[] args) {
        Document document = new Document("Какой-то текст ");
        Document document2 = new Document("Какой-то другой текст");



        PDFReportService pdfReportService = new PDFReportService();
        pdfReportService.generateReport(document);



        XMLReportService xmlReportService = new XMLReportService();
        xmlReportService.generateReport(document);

        JSONReportService jsonReportService = new JSONReportService();
        jsonReportService.generateReport(document2);

        RandomNewTypeReportService randomNewTypeReportService = new RandomNewTypeReportService();
        randomNewTypeReportService.generateReport(document);




    }
}