package animals;

public class Waterfowl extends Animal{
    public Waterfowl(int age, int weight){
        this.age = age;
        this.weight = weight;
    }

    public Waterfowl() {
        age = 5;
        weight = 15;
    }

    @Override
    public void move() {
        System.out.println("This is waterfowl with age = " + age + " and weight = " + weight + ". To aquarium");
    }
}
