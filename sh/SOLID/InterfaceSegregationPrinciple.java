package src.sh.SOLID;

public class InterfaceSegregationPrinciple {
    // Vi phạm ISP
    interface Worker {
        void work();

        void eat();
    }

    class Robot implements Worker {
        public void work() {
        }

        public void eat() {
        } // ??? Robot không cần ăn
    }
}
