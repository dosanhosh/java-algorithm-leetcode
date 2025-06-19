package src.sh.design_pattern.behavioral.observer;

public class PhoneDisplay implements StockObserver {
    @Override
    public void updateStock(String stockSymbol, double price) {
        System.out.println(this.getClass() + "stockSymbol:" + stockSymbol + ",price:" + price);
    }
}
