import java.util.Objects;

/**
 * ADAPTER (Adapter pattern).
 *
 * Adapts a SmartphoneCharger to the PowerOutlet interface by translating
 * plugIn() into SmartphoneCharger.chargePhone().
 */
public class SmartphoneAdapter implements PowerOutlet {

    private final SmartphoneCharger smartphoneCharger;

    public SmartphoneAdapter(SmartphoneCharger smartphoneCharger) {
        this.smartphoneCharger = Objects.requireNonNull(smartphoneCharger, "smartphoneCharger must not be null");
    }

    @Override
    public void plugIn() {
        smartphoneCharger.chargePhone();
    }
}
