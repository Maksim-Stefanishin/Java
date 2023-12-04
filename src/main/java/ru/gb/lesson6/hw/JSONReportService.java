package ru.gb.lesson6.hw;

class JSONReportService implements ReportService{
    @Override
    public void generateReport(Document document) {
        String jsonContent = "JSON Report for document: " + document.getContent();
        System.out.println(jsonContent);
    }
}
