package observer;

import observable.StockObservable;

public class MobileAlertObserverImpl implements NotificationAlertObserver {
    String username;
    StockObservable observable;

    public MobileAlertObserverImpl(StockObservable observable, String username) {
        this.observable = observable;
        this.username = username;
    }

    @Override
    public void update() {
        sendMessageOnMobile(username, "Product is in stock, hurry up!");
    }

    private void sendMessageOnMobile(String username, String msg) {
        System.out.println("Message sent to " + username + " with message: " + msg);
    }
}
