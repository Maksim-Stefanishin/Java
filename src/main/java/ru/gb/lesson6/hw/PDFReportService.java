package ru.gb.lesson6.hw;

 class PDFReportService implements ReportService {
    @Override
    public void generateReport(Document document) {
        String pdfContent = "PDF Report for document: " + document.getContent();
        System.out.println(pdfContent);
    }
}
