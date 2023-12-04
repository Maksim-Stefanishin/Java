package ru.gb.lesson6.hw;

class XMLReportService implements ReportService {
    @Override
    public void generateReport(Document document) {
        String xmlContent = "XML Report for document: " + document.getContent();
        System.out.println(xmlContent);
    }
}
