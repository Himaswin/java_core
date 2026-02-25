package Jan17;

public abstract class RemoteControl {

    abstract void start();

    protected void loadBattery(){
        System.out.println("battery is loaded");
    }

    protected void switchOn(){
        System.out.println("switch is on");
    }



}

class RemoteControlMain{
    public static void main(String[] args) {
        RemoteControl rc = new RemotecontrolCar();
        rc.start();
    }
}
