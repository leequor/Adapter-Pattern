import java.util.LinkedHashMap;
import java.util.Map;

/**
 * CLIENT (Adapter pattern).
 *
 * Only knows about the PowerOutlet interface. Every device is plugged in with
 * the same plugIn() call, without caring which concrete device (or which
 * device-specific method) sits behind the adapter.
 */
public class Main {

    public static void main(String[] args) {
        Map<String, PowerOutlet> devices = new LinkedHashMap<>();
        devices.put("Laptop", new LaptopAdapter(new Laptop()));
        devices.put("Refrigerator", new RefrigeratorAdapter(new Refrigerator()));
        devices.put("Smartphone Charger", new SmartphoneAdapter(new SmartphoneCharger()));

        System.out.println("=== Plugging devices into power outlets ===");
        System.out.println();

        for (Map.Entry<String, PowerOutlet> device : devices.entrySet()) {
            System.out.println("Plugging in: " + device.getKey());
            device.getValue().plugIn(); // same call for every device
            System.out.println();
        }
    }
}
