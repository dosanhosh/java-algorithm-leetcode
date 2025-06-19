package src.sh.test;


public abstract class BaseCore implements IBaseCore {

    private int a;

    public BaseCore() {
    }

    public BaseCore(int a) {
        this.a = a;
    }


    abstract void plus();

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int plus2() {
        return a;
    }
}
