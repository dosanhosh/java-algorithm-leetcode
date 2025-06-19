package src.sh.design_pattern.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class StockMarket {
    List<StockObserver> observers = new ArrayList<>();

    public void register(StockObserver observer) {
        observers.add(observer);
    }

    public void unregister(StockObserver observer) {
        observers.remove(observer);
    }

    public void notify(String symbol, double price) {
        for (StockObserver observer : observers) {
            observer.updateStock(symbol, price);
        }
    }
}
