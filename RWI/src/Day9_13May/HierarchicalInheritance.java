package Day9_13May;

class Vehicle {

    double basePrice = 100000;

    public void showPrice() {
        System.out.println("The price of Vehicle is: Rs." + basePrice);
    }
}

//
class TwoWheeler extends Vehicle {

    double increasePriceBy = 0.20; // 0.2 times

    void finalPrice() {
        basePrice = basePrice + (basePrice * increasePriceBy);
        System.out.println(
                "After modification, The price of bike is: Rs." + basePrice
        );
    }
}

// child class
class FourWheeler extends Vehicle {

    double increasePriceBy = 1; // 1 times

    void finalPrice() {
        basePrice = basePrice + (basePrice * increasePriceBy);
        System.out.println(
                "After modification, The price of car is: Rs." + basePrice
        );
    }
}

public class HierarchicalInheritance {

    public static void main(String[] args) {
        // creating an Object of TwoWheeler class
        TwoWheeler bike = new TwoWheeler();
        // creating an Object of FourWheeler class
        FourWheeler car = new FourWheeler();

        // getting the base price of the vehicle
        bike.showPrice();
        // modifying the base price of the bike
        // by referring to the base price of the vehicle.
        bike.finalPrice();

        // getting the base price of vehicle
        car.showPrice();
        // modifying the car's base price by referring to the vehicle's base price.
        car.finalPrice();
    }
}
