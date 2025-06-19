package src.sh.design_pattern.behavioral.observer;

public class Main {
    public static void main(String[] args) {
        StockMarket stockMarket = new StockMarket();
        PhoneDisplay phoneDisplay = new PhoneDisplay();
        Logger logger = new Logger();

        stockMarket.register(phoneDisplay);
        stockMarket.register(logger);

        stockMarket.notify("AAPL", 189.25);
        System.out.println("---------------------------------");
        stockMarket.unregister(logger);
        stockMarket.notify("GOOG", 3045.80);

    }
}
