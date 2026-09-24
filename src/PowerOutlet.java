/**
 * TARGET interface (Adapter pattern).
 *
 * Represents a standard power outlet. Every device, whatever its own
 * interface looks like, is plugged in through this one common method.
 */
public interface PowerOutlet {

    /** Plugs a device into the outlet so that it starts receiving power. */
    void plugIn();
}
