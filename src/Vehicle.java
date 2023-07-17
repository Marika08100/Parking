public class Vehicle {
    private String color;
    private final int passenger;

    public Vehicle(String color, int passenger){
        this.color = color;
        this.passenger = passenger;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPassenger() {
        return passenger;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "color='" + color + '\'' +
                ", passenger=" + passenger +
                '}';
    }
}
