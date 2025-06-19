package src.sh.design_pattern.behavioral.observer;

public interface StockObserver {
    void updateStock(String stockSymbol, double price);
}
