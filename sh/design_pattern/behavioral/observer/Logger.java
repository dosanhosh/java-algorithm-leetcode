package src.sh.design_pattern.behavioral.observer;

public class Logger implements StockObserver {
    @Override
    public void updateStock(String stockSymbol, double price) {
        System.out.println(this.getClass() + "stockSymbol:" + stockSymbol + ",price:" + price);
    }
}
