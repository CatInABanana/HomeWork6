package Main;

public abstract class Animal {

    String name;
    public static int animalCount = 0;

    public Animal(String name){
        this.name = name;
        animalCount++;
    }

    abstract void run(int dist);

    abstract void swim(int dist);

}
