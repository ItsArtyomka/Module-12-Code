package Code.Webinar;

public class Transport {
    public static void main(String[] args) {
        DynamicArray transport = new DynamicArray();
        transport.add(new Car());
        transport.add(new Car());
        transport.add(new Car());
        transport.add(new Plane());

        for (int i = 0; i < 4; i++) {
            ((Car)transport.get(i)).drive(); // ClassCastException
        }
    }
}

class Car {
    void drive(){
        System.out.println("Driving a car.");
    }
}

class Plane {
    void fly(){
        System.out.println("Flying a plane.");
    }
}
