package Jan17;

public class Car {

    void fuel(){
        System.out.println("fuel injected");
    }

    void igniteFuel(){
        System.out.println("fuel ignited");
    }

    void engineStart(){
        System.out.println("engine starts");
    }

    void startCar(){
        fuel();
        igniteFuel();
        engineStart();
        System.out.println("car is started");

    }
}

class CarMain{
    public static void main(String[] args) {
        Car car = new Car();
        car.igniteFuel();// user wont do this //hidden
        car.fuel();// user wont do this //hidden
        car.startCar();// shown to us
    }
}


