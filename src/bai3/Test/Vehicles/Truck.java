package bai3.Test.Vehicles;

public class Truck extends Vehicle {

    private int cargoCapacity;

    public Truck(String brand, String color, int cargoCapacity) {
        super(brand, color);
        this.cargoCapacity = cargoCapacity;
    }

    public int getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(int cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    @Override
    public void start() {
        System.out.println("Xe tải " + getBrand() + " khởi động!");
    }

    @Override
    public void accelerate() {
        System.out.println("Xe tải " + getBrand() + " đang tăng tốc!");
    }

    @Override
    public void stop() {
        System.out.println("Xe tải " + getBrand() + " đã dừng lại!");
    }

}

