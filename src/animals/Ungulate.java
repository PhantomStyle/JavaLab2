package animals;

public class Ungulate extends Animal{
    public Ungulate(int age, int weight){
        this.age = age;
        this.weight = weight;
    }

    public Ungulate() {
        age = 10;
        weight = 200;
    }

    @Override
    public void move() {
        System.out.println("This is ungulate with age = " + age + " and weight = " + weight + ". To open voliary");
    }
}
