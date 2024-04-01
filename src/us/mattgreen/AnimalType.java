package us.mattgreen;

import java.util.ArrayList;
import java.util.Scanner;

public class AnimalType {
    private ArrayList<Talkable> zoo;

    public AnimalType(ArrayList<Talkable> zoo) {
        this.zoo = zoo;
    }
    public void addAnimal() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What type of animal do you want to create? (Dog/Cat/Teacher)");
        String animalType = scanner.nextLine();

        switch (animalType.toLowerCase()) {
            case "dog":
                createDog(scanner);
                break;
            case "cat":
                createCat(scanner);
                break;
            case "teacher":
                createTeacher(scanner);
                break;
            default:
                System.out.println("Invalid animal type.");
        }
    }

    private void createDog(Scanner scanner) {
        System.out.println("Enter dog's name:");
        String name = scanner.nextLine();
        System.out.println("Is the dog friendly? (true/false):");
        boolean friendly = scanner.nextBoolean();
        scanner.nextLine();

        zoo.add(new Dog(friendly, name));
    }

    private void createCat(Scanner scanner) {
        System.out.println("Enter cat's name:");
        String name = scanner.nextLine();
        System.out.println("How many mice has the cat killed?");
        int micekilled = scanner.nextInt();
        scanner.nextLine();

        zoo.add(new Cat(micekilled, name));
    }

    private void createTeacher(Scanner scanner) {

    }
}

