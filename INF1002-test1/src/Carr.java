public class Carr {

    String car;
    int speed=0;
    int fuel=0;


    void carName(String a){
        this.car=a;
    }

    void addFuel(int fuel){
        this.fuel=this.fuel+fuel;
    }

    void currentSpeed(){
        System.out.println(this.speed);
    }

    void currentFuel(){
        System.out.println(this.fuel);
    }

    void accelrate(int added){
        this.speed=this.speed+added;
    }

    public static void main(String[] args) {

        Carr myCar=new Carr();
        myCar.carName("Ferrari");
        myCar.currentFuel();
        myCar.currentSpeed();
        myCar.addFuel(10);
        myCar.accelrate(60);
        myCar.currentFuel();
        myCar.currentSpeed();

    }
        }
