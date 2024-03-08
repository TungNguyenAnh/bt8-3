package bai3.Test;

import bai3.Test.Vehicles.Car;
import bai3.Test.Vehicles.Motorcycle;

public class Main {

        public static void main(String[] args) {
            Car car = new Car("Toyota", "Xám", 5);
            car.start();
            car.accelerate();
            car.stop();
            System.out.println(car);

            Motorcycle motorcycle = new Motorcycle("Honda", "Đỏ", 150);
            motorcycle.start();
            motorcycle.accelerate();
            motorcycle.stop();
            System.out.println(motorcycle);
        }
    }

