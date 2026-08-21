class Vehicle {

    void start() {
        System.out.println("Vehicle starts");
    }
}

class Car extends Vehicle {

    void start() {
        System.out.println("Car starts with a key");
    }
}

class Bike extends Vehicle {

    void start() {
        System.out.println("Bike starts with a button");
    }
}

class Main {

    public static void main(String[] args) {

        Vehicle v;

        v = new Car();
        v.start();

        v = new Bike();
        v.start();
    }
}
