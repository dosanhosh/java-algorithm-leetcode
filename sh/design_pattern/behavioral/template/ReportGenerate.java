package src.sh.design_pattern.behavioral.template;

public abstract class ReportGenerate {

    public final void handle(){
        fetchData();
        formatReport();
        sendReport();
    }

    // Bước cố định
    protected void fetchData() {
        System.out.println("Lấy dữ liệu từ database...");
    }

    // Bước thay đổi tùy loại report
    protected abstract void formatReport();

    // Bước cố định
    protected void sendReport() {
        System.out.println("Gửi báo cáo qua email...");
    }
}
