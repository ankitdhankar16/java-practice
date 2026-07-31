package oops.abstraction;

interface Car{
    void startEngine();
    void shiftGear(int gear);
    void brake();
    void accelerate();
    void stopEngine();
}

class SportsCar implements Car{
    String brand;
    String model;
    boolean isEngineOn=false;
    int currentSpeed=0;
    int currentGear=0;
    public SportsCar(String brand,String model){
        this.brand=brand;
        this.model=model;
    }

    @Override
    public void startEngine(){
        isEngineOn=true;
        System.out.println(brand+" "+model+" "+" : Engine started with roar");
    }

    @Override
    public void shiftGear(int gear){
        if(!isEngineOn){
            System.out.println(brand+" "+model+" "+" : Engine is off cannot shift the gear");
            return;
        }
        this.currentGear=gear;
        System.out.println(brand+" "+model+" "+" : Shifted to gear "+ currentGear);
    }
    @Override
    public void accelerate(){
        if(!isEngineOn){
            System.out.println(brand+" "+model+" "+" : Engine is Off! Cannot accelerate");
            return;
        }
        currentSpeed+=20;
        System.out.println(brand+" "+model+" "+" : Accelerating to " + currentSpeed + " km/hr");
    }
    @Override
    public void brake(){
        currentSpeed-=20;
        if(currentSpeed<0){
            currentSpeed=0;
        }
        System.out.println(brand+" "+model+" "+" : Braking! Speed is now "+ currentSpeed+" km/hr");
    }
    @Override
    public void stopEngine(){
        isEngineOn=false;
        currentSpeed=0;
        currentGear=0;
        System.out.println(brand+" "+model+" "+" : Engine turned off");
    }
}

public class abstraction {
    public static void main(String [] args){
        Car myCar = new SportsCar("Ford","Mustang");
        myCar.startEngine();
        myCar.shiftGear(1);
        myCar.accelerate();
        myCar.shiftGear(2);
        myCar.accelerate();
        myCar.brake();
        myCar.stopEngine();


    }
}
