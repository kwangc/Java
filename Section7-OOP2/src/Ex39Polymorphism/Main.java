package Ex39Polymorphism;

class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.wheels = 4;
        this.engine = true;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    public String startEngine() {
        return "Car -> startEngine()";
    }

    public String accelerate() {
        return "Car -> accelerate()";
    }

    public String brake() {
        return "Car -> brake()";

    }
}

class Lamborghini extends Car {

    public Lamborghini(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Lamborghini -> startEngine()";
    }

    @Override
    public String accelerate() {
        return "Lamborghini -> accelerate()";
    }

    @Override
    public String brake() {
        return "Lamborghini -> brake()";
    }
}

class Porsche extends Car {

    public Porsche(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Porsche -> startEngine()";
    }

    @Override
    public String accelerate() {
        return "Porsche -> accelerate()";
    }

    @Override
    public String brake() {
        return "Porsche -> brake()";
    }
}

class Ford extends Car {

    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return getClass().getSimpleName() + " -> startEngine()";
    }

    @Override
    public String accelerate() {
        return getClass().getSimpleName() + " -> accelerate()";
    }

    @Override
    public String brake() {
        return getClass().getSimpleName() + " -> brake()";
    }
}

public class Main {

    public static void main(String[] args) {
        Car car = new Car(8, "Base car");
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        Lamborghini gallardo = new Lamborghini(6, "Gallardo");
        System.out.println(gallardo.getName());
        System.out.println(gallardo.startEngine());
        System.out.println(gallardo.brake());

        Ford modelT = new Ford(4, "Model T");
        System.out.println(modelT.startEngine());
        System.out.println(modelT.accelerate());
        System.out.println(modelT.brake());

        Porsche carrera = new Porsche(8, "Carrera");
        System.out.println(carrera.startEngine());
        System.out.println(carrera.accelerate());
        System.out.println(carrera.brake());

    }
}
