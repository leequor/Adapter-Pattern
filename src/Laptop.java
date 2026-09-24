/**
 * ADAPTEE (Adapter pattern).
 *
 * A laptop that needs a power source. Its own interface is charge(),
 * which is NOT compatible with PowerOutlet.plugIn().
 */
public class Laptop {

    public void charge() {
        System.out.println("Laptop is charging.");
    }
}
