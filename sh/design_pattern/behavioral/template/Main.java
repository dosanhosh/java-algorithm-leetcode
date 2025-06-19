package src.sh.design_pattern.behavioral.template;

public class Main {
    public static void main(String[] args) {
        ReportGenerate pdfReport= new PdfReportGenerator();
        pdfReport.handle();

        ReportGenerate xmlReport = new XmlReportGenerate();
        xmlReport.handle();
    }
}
