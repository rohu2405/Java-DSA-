package com.oops;

public class java_oops {
    public static void main(String[] args) {
        Car suv = new Car(4 , "Innova" , 98523);
//        suv.brand = "Fortunor";
//        suv.price = 4900;
//        suv.wheels = 4;
        System.out.println(suv.price);
        suv.run();
        suv.run("Maruti");
        Car.hasRoof = true;
        System.out.println(Car.hasRoof);
        Maruti s1 = new Maruti();
        s1.color = "black";
        System.out.println(s1.color);
        s1.run();
    }
}

class Car{
    int wheels;
    String brand;
    int price;
    static boolean hasRoof;

    void run(){
        System.out.println("Car runs at 70kmph");
    }
    void run(String name) {
        System.out.println(name + "runs at 500kmph");
    }
    Car() {
        System.out.println("I am a constructor of car");
    }
    Car(int wheels , String brand , int price){
        this.wheels = wheels;
        this.price = price;
        this.brand = brand;
    }
}
class Maruti extends Car{
    String color;

}
