package src.sh.design_pattern.behavioral.template;

public class PdfReportGenerator extends ReportGenerate{
    @Override
    protected void formatReport() {
        System.out.println("format PDF Report.......");
    }
}
