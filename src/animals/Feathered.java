package animals;

public class Feathered extends Animal{
    public Feathered() {
        age = 5;
        weight = 10;
    }

    public Feathered(int age, int weight){
        this.age = age;
        this.weight = weight;
    }

    @Override
    public void move() {
        System.out.println("This is feathered with age = " + age + " and weight = " + weight + ". To grid voliary");
    }
}
