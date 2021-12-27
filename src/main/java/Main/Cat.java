package Main;

public class Cat extends Animal{

    final int maxRunDist;
    public static int catCount = 0;

    public Cat(String name) {
        super(name);
        maxRunDist = 200;
        catCount++;
    }

    void run(int dist) {

        if (dist <= maxRunDist) System.out.printf("Кот %s пробежал %d метров\n", name, dist);
        else System.out.printf("Кот %s не смог пробежать %d метров\n", name, dist);

    }

    void swim(int dist) {

        System.out.println("Коты не умеют плавать!");

    }

}
