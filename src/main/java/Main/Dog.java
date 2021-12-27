package Main;

public class Dog extends Animal {

    final int maxRunDist;
    final int maxSwimDist;
    public static int dogCount = 0;

    public Dog(String name) {
        super(name);
        maxRunDist = 500;
        maxSwimDist = 10;
        dogCount++;
    }

    void run(int dist) {

        if (dist <= maxRunDist) System.out.printf("Пёс %s пробежал %d метров\n", name, dist);
        else System.out.printf("Пёс %s не смог пробежать %d метров\n", name, dist);

    }

    void swim(int dist) {

        if (dist <= maxSwimDist) System.out.printf("Пёс %s проплыл %d метров\n", name, dist);
        else System.out.printf("Пёс %s не смог проплыть %d метров\n", name, dist);


    }

}
