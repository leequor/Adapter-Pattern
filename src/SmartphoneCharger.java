/**
 * ADAPTEE (Adapter pattern).
 *
 * A smartphone charger that needs to be plugged in for charging. Its own
 * interface is chargePhone(), which is NOT compatible with
 * PowerOutlet.plugIn().
 */
public class SmartphoneCharger {

    public void chargePhone() {
        System.out.println("Smartphone is charging.");
    }
}
