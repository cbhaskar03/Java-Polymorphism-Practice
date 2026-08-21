class Area {

    void area(int side) {
        int totalarea = side * side;
        System.out.println("The total area of Square is " + totalarea);
    }

    void area(int side1, int side2) {
        int totalarea = side1 * side2;
        System.out.println("The total area of Rectangle is " + totalarea);
    }

    void area(double radius) {
        double totalarea = 3.14 * radius * radius; // Or Math.PI * radius * radius
        System.out.println("The total area of Circle is " + totalarea);
    }
}

class Main {

    public static void main(String[] args) {
        Area a = new Area();

        a.area(10);
        a.area(10, 20);
        a.area(10.23);
    }
}
