import java.util.Objects;

/**
 * ADAPTER (Adapter pattern).
 *
 * Adapts a Laptop to the PowerOutlet interface by translating
 * plugIn() into Laptop.charge().
 */
public class LaptopAdapter implements PowerOutlet {

    private final Laptop laptop;

    public LaptopAdapter(Laptop laptop) {
        this.laptop = Objects.requireNonNull(laptop, "laptop must not be null");
    }

    @Override
    public void plugIn() {
        laptop.charge();
    }
}
