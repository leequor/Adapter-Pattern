/**
 * ADAPTEE (Adapter pattern).
 *
 * A refrigerator that requires a power source. Its own interface is
 * startCooling(), which is NOT compatible with PowerOutlet.plugIn().
 */
public class Refrigerator {

    public void startCooling() {
        System.out.println("Refrigerator has started cooling.");
    }
}
