package animals;

public class ColdBlooded extends Animal{
    public ColdBlooded() {
        weight = 60;
        age = 5;
    }

    public ColdBlooded(int age, int weight){
        this.age = age;
        this.weight = weight;
    }

    @Override
    public void move() {
        System.out.println("This is cold blooded with age = " + age + " and weight = " + weight + ". To infrared radiation voliary");
    }
}
