import animals.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
    private static final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        System.out.println("Welcome\n");
        System.out.println("1 - Cold blooded");
        System.out.println("2 - Feathered");
        System.out.println("3 - Ungulate");
        System.out.println("4 - Waterfowl");
        Animal animal;
        try {
            int chooseAnimal = Integer.parseInt(reader.readLine());
            if (chooseAnimal <= 0) {
                throw new RuntimeException("Wrong entering. Your number <= 0");
            }


            System.out.println("Would you like to use default animal?");
            int isDefaultAnimal = Integer.parseInt(reader.readLine());
            switch (isDefaultAnimal) {
                case 1:
                    switch (chooseAnimal) {
                        case 1:
                            animal = new ColdBlooded();
                            animal.move();
                            break;
                        case 2:
                            animal = new Feathered();
                            animal.move();
                            break;
                        case 3:
                            animal = new Ungulate();
                            animal.move();
                            break;
                        case 4:
                            animal = new Waterfowl();
                            animal.move();
                            break;
                    }
                    break;
                case 0:
                    System.out.println("Enter weight");
                    int weight = Integer.parseInt(reader.readLine());
                    System.out.println("Enter age");
                    int age = Integer.parseInt(reader.readLine());
                    if (weight <= 0 || age <= 0) {
                        throw new RuntimeException("Wrong entering. One of numbers <= 0");
                    }
                    switch (chooseAnimal) {
                        case 1:
                            animal = new ColdBlooded(age, weight);
                            animal.move();
                            break;
                        case 2:
                            animal = new Feathered(age, weight);
                            animal.move();
                            break;
                        case 3:
                            animal = new Ungulate(age, weight);
                            animal.move();
                            break;
                        case 4:
                            animal = new Waterfowl(age, weight);
                            animal.move();
                            break;
                    }
                    break;
            }

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }
}
