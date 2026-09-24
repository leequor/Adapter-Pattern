import java.util.Objects;

/**
 * ADAPTER (Adapter pattern).
 *
 * Adapts a Refrigerator to the PowerOutlet interface by translating
 * plugIn() into Refrigerator.startCooling().
 */
public class RefrigeratorAdapter implements PowerOutlet {

    private final Refrigerator refrigerator;

    public RefrigeratorAdapter(Refrigerator refrigerator) {
        this.refrigerator = Objects.requireNonNull(refrigerator, "refrigerator must not be null");
    }

    @Override
    public void plugIn() {
        refrigerator.startCooling();
    }
}
