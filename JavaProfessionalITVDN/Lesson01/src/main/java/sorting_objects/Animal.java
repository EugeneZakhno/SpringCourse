package sorting_objects;

public class Animal {
    String breed;
    int weight;
    int speed;
    int price;

    Animal (String breed, int weight, int speed, int price){
        this.breed = breed;
        this.weight = weight;
        this.speed = speed;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "breed='" + breed + '\'' +
                ", weight=" + weight +
                ", speed=" + speed +
                ", price=" + price +
                '}';
    }
}
