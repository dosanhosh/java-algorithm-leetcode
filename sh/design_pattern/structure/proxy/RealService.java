package src.sh.design_pattern.structure.proxy;

public class RealService implements Service{
    @Override
    public void doTask() {
        System.out.println("I am working here......");
    }
}
