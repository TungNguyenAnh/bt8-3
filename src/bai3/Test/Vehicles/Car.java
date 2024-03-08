package bai3.Test.Vehicles;

public class Car extends Vehicle {

    private int numberOfSeats;

    public Car(String brand, String color, int numberOfSeats) {
        super(brand, color);
        this.numberOfSeats = numberOfSeats;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    @Override
    public void start() {
        System.out.println("Xe ô tô " + getBrand() + " khởi động!");
    }

    @Override
    public void accelerate() {
        System.out.println("Xe ô tô " + getBrand() + " đang tăng tốc!");
    }

    @Override
    public void stop() {
        System.out.println("Xe ô tô " + getBrand() + " đã dừng lại!");
    }

}
