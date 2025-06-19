package src.sh.test;

public class Main {
    public static void main(String[] args) {
        BaseCore core = new BaseCore(1) {
            @Override
            void plus() {
                setA(getA() + 1);
                System.out.println(getA());
            }
        };

        core.plus();
    }
}
