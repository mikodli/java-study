package day9;

public abstract class Animal {

	String name;

    Animal(String name) {
        this.name = name;
    }

    void eat() {
        System.out.println(name + " 먹는다");
    }

    abstract void sound();
	
}
