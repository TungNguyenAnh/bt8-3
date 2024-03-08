package bai3.Test.Vehicles;

public class Motorcycle extends Vehicle {

    private int engineDisplacement;

    public Motorcycle(String brand, String color, int engineDisplacement) {
        super(brand, color);
        this.engineDisplacement = engineDisplacement;
    }

    public int getEngineDisplacement() {
        return engineDisplacement;
    }

    public void setEngineDisplacement(int engineDisplacement) {
        this.engineDisplacement = engineDisplacement;
    }

    @Override
    public void start() {
        System.out.println("Xe máy " + getBrand() + " khởi động!");
    }

    @Override
    public void accelerate() {
        System.out.println("Xe máy " + getBrand() + " đang tăng tốc!");
    }

    @Override
    public void stop() {
        System.out.println("Xe máy " + getBrand() + " đã dừng lại!");
    }

}
