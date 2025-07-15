package src.sh.future;

public class Utils {

    public static boolean filter(int o) {
        if ((int) o % 2 == 0) return true;
        else return false;
    }

    public static void process(int u) {
        System.out.println("📧 Gửi mail cho: " + u);
        // có thể thêm logic gửi mail, log, cập nhật trạng thái,...
    }

    public static int Plus(int s) {
        return s + 1;
    }
}
