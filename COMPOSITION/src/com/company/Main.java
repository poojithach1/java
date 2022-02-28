package com.company;
//polymorphism
class Car {
    private boolean engine;
    private int cylinders;
    private  int wheels;
    private String name;

    public Car(String name, int cylinders) {
        this.wheels = 4;
        this.cylinders = cylinders;
        this.engine = true;
        this.name = name;
    }
    public String startEngine() {
         return "car ->startEngine()";
    }
    public String acceleration() {
         return  "car -> acceleration";
    }
    public String brake() {
        return "car -> brake()";
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }
}
class hatchback extends Car {
    public hatchback(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public String startEngine() {
        return "hatchback -> startEngine()";
    }

    @Override
    public String brake() {
        return "hatchback -> brake()";
    }

    @Override
    public String acceleration() {
        return "hatchback -> acceleration";
    }
}



public class Main {

    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20,20,5);
        Case theCase = new Case("220D","Acer","240",dimensions);
        Motherboard motherboard = new Motherboard("220G","Dell",4,4,"v2.33");
        Monitor monitor = new Monitor("mac",27,"BJ-200",new Resolution(220,300));
        Pc thePc = new Pc(monitor,theCase,motherboard);
        thePc.powerUp();


        Wall wall1 = new Wall("red",210);
        Wall wall2 = new Wall("blue",210);
        Wall wall3 = new Wall("pink",210);
        Wall wall4 = new Wall("red",210);
        Ceiling ceiling = new Ceiling(7,13,"pink");
        Lamp lamp = new Lamp("tableLamp",10,true);
        Bed bed = new Bed(4,5,"orange","round");
        BedRoom bedRoom = new BedRoom("master Bed Room",wall1,wall2,wall3,wall4,ceiling,bed,lamp);
        bedRoom.makeBed();
        bedRoom.getLamp().lightUp();

        Car car = new Car("sports car",5);
        System.out.println(car.acceleration());
        System.out.println(car.brake());
        System.out.println(car.startEngine());

        hatchback hatch = new hatchback("base car",6);
        System.out.println(hatch.acceleration());
        System.out.println(hatch.brake());
        System.out.println(hatch.startEngine());
// inline class => other way to create class
       Car crossover = new Car("base car",6){
            @Override
            public String startEngine() {
                return "crossover -> startEngine()";
            }

            @Override
            public String brake() {
                return "crossover -> break()";
            }

            @Override
            public String acceleration() {
                return "crossover -> acceleration";
            }
        };
       System.out.println(crossover.acceleration());
       System.out.println(crossover.brake());
       System.out.println(crossover.startEngine());
    }
}
