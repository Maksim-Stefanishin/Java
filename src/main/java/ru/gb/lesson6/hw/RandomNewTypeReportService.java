package ru.gb.lesson6.hw;

public class RandomNewTypeReportService implements ReportService {
    @Override
    public void generateReport(Document document) {
        String newType = "newType Report for document: " + document.getContent();
        System.out.println(newType);
    }
}
