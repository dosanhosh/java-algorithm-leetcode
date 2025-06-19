package src.sh.design_pattern.behavioral.template;

public class XmlReportGenerate extends ReportGenerate{
    @Override
    protected void formatReport() {
        System.out.println("format XML Report.......");
    }
}