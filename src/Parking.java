import java.util.ArrayList;
import java.util.List;

public class Parking {
    private final List<Vehicle> vehicles;
    private int capacity;

    public Parking(int capacity) {
        this.capacity = capacity;
        this.vehicles = new ArrayList<>();

    }

    public boolean isFull(int capacity) {
        return vehicles.size() >= capacity;
    }

    public void addVehicle(Vehicle vehicle) throws IsFullException {
            if (isFull(capacity)) {
                throw new IsFullException("The parking lot is full!");
            }
            vehicles.add(vehicle);
            System.out.println("The vehicle with color " + vehicle.getColor() + " is in the parking lot!");
        }




    public void removeVehicle(Vehicle vehicle) {
        if (vehicles.contains(vehicle)) {
            vehicles.remove(vehicle);
            System.out.println("The vehicle with color " + vehicle.getColor() + " is out of the parking lot!");
        } else {
            System.out.println("The vehicle is not in the parking house!");
        }

    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public List<Vehicle> getVehicles() {
        return vehicles;
    }

    @Override
    public String toString() {
        return "Parking{" +
                "vehicles=" + vehicles +
                ", capacity=" + capacity +
                '}';
    }
}
