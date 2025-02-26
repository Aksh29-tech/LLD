// Keyboard Interface -> two concrete classes (WiredKeyboard and BluetoothKeyboard)
// Mouse Interface -> two concrete classes (WiredMouse and BluetoothMouse)
// class MacBook {
//    private final WiredKeyboard keyboard;
//    private final WiredMouse mouse;
//
//    public MacBook() {
//        keyboard = new WiredKeyboard();
//        mouse = new WiredMouse();
//    }
// }

//In above we can directly create the objects of Concrete classes so we can not enhance them in future so it is not
//following the principle.

interface Keyboard {
    //implement for wired and bluetooth keyboard.
}
interface Mouse {
    //implement for wired and bluetooth mouse.
}
class MacBook {
    private final Keyboard keyboard;
    private final Mouse mouse;

    public MacBook(Keyboard keyboard, Mouse mouse) {
        this.keyboard = keyboard;
        this.mouse = mouse;
    }
}
//so now we are taking interface objects, and now we can create objects of both wired and bluetooth, so we are now
//dependent on interfaces rather than concrete classes.
public class DependencyInversionPrinciple {
    public static void main(String[] args) {

    }
}
