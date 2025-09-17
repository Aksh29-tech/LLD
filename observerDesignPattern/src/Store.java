import observable.IphoneObservableImpl;
import observable.StockObservable;
import observer.EmailAlertObserverImpl;
import observer.MobileAlertObserverImpl;
import observer.NotificationAlertObserver;

public class Store {
    public static void main(String[] args) {
        StockObservable iphoneStockObervable = new IphoneObservableImpl();

        NotificationAlertObserver observer1 = new EmailAlertObserverImpl("abc@email.com", iphoneStockObervable);
        NotificationAlertObserver observer2 = new EmailAlertObserverImpl("mno@email.com", iphoneStockObervable);
        NotificationAlertObserver observer3 = new MobileAlertObserverImpl(iphoneStockObervable, "xyz_username");

        iphoneStockObervable.add(observer1);
        iphoneStockObervable.add(observer2);
        iphoneStockObervable.add(observer3);

        iphoneStockObervable.setStockCount(10);
    }
}