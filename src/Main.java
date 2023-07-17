public class Main {
    public static void main(String[] args) {
        Parking parking = new Parking(3);
        Car car = new Car("blue", 4);
        Truck truck = new Truck("green", 4);
        Car car2 = new Car("yellow", 4);
        Car car3 = new Car("black", 4);

        parking.isFull(3);
        parking.addVehicle(truck);
        parking.addVehicle(car2);
        parking.addVehicle(car3);
        parking.addVehicle(car);

        parking.removeVehicle(car2);

    }
}