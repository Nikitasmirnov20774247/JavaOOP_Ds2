package JavaOOP_Ds2.animals;

import java.util.ArrayList;
import java.util.Scanner;

public class Zoo
{
    private String name;
    private String species;
    private String vaccinated;
    private String color;
    private String dateBirthday;
    private int height;
    private int weight;
    private String colorEye;
    private String wool;
    private String training;
    private String place;
    private String date;
    private String leader;
    private int hightFly;

    public static ArrayList<Animal> allAnimal = new ArrayList<>();
    {
        allAnimal.add(new Cat("Leonardo", "MaineCoon", "Yes", "brown", "3.02.2022", 41, 8, "yellow", "yes"));
        allAnimal.add(new Tiger(160, 150, "brown", "Amur", "11.05.2019"));
        allAnimal.add(new Dog("Borya", "Alabai", "Yes", "white", "23.08.2020", 70, 50, "blue", "No"));
        allAnimal.add(new Wolf(59, 40, "yellow", "Russia", "22.06.2017", "Yes"));
        allAnimal.add(new Chicken(38, 3, "yellow", 1));
        allAnimal.add(new Stork(100, 5, "red", 43));
    }

    public void addCat(Scanner input)
    {
        System.out.print("Имя: ");
        name = input.next();
        System.out.print("Порода: ");
        species = input.next();
        System.out.print("Вакцинирован?: ");
        vaccinated = input.next();
        System.out.print("Введите цвет: ");
        color = input.next();
        System.out.print("Дата рождения: ");
        dateBirthday = input.next();
        System.out.print("Рост: ");
        height = input.nextInt();
        System.out.print("Вес: ");
        weight = input.nextInt();
        System.out.print("Цвет глаз: ");
        colorEye = input.next();
        System.out.print("Наличие шерсти: ");
        wool = input.next();

        Zoo.allAnimal.add(new Cat(name, species, vaccinated, color, dateBirthday, height, weight, colorEye, wool));
    }

    public void addDog(Scanner input)
    {
        System.out.print("Имя: ");
        name = input.next();
        System.out.print("Порода: ");
        species = input.next();
        System.out.print("Вакцинирован?: ");
        vaccinated = input.next();
        System.out.print("Введите цвет: ");
        color = input.next();
        System.out.print("Дата рождения: ");
        dateBirthday = input.next();
        System.out.print("Рост: ");
        height = input.nextInt();
        System.out.print("Вес: ");
        weight = input.nextInt();
        System.out.print("Цвет глаз: ");
        colorEye = input.next();
        System.out.print("Наличие дресировки: ");
        training = input.next();

        allAnimal.add(new Dog(name, species, vaccinated, color, dateBirthday, height, weight, colorEye, training));
    }

    public void addTiger(Scanner input)
    {
        System.out.print("Рост: ");
        height = input.nextInt();
        System.out.print("Вес: ");
        weight = input.nextInt();
        System.out.print("Цвет глаз: ");
        colorEye = input.next();
        System.out.print("Место обитания: ");
        place = input.next();
        System.out.print("Дата обнаружения: ");
        date = input.next();

        allAnimal.add(new Tiger(height, weight, colorEye, place, date));
    }

    public void addWolf(Scanner input)
    {
        System.out.print("Рост: ");
        height = input.nextInt();
        System.out.print("Вес: ");
        weight = input.nextInt();
        System.out.print("Цвет глаз: ");
        colorEye = input.next();
        System.out.print("Место обитания: ");
        place = input.next();
        System.out.print("Дата обнаружения: ");
        date = input.next();
        System.out.print("Вожак стаи?: ");
        leader = input.next();

        allAnimal.add(new Wolf(height, weight, colorEye, place, date, leader));
    }

    public void addChicken(Scanner input)
    {
        System.out.print("Рост: ");
        height = input.nextInt();
        System.out.print("Вес: ");
        weight = input.nextInt();
        System.out.print("Цвет глаз: ");
        colorEye = input.next();
        System.out.print("Высота полета: ");
        hightFly = input.nextInt();

        allAnimal.add(new Chicken(height, weight, colorEye, hightFly));
    }

    public void addStork(Scanner input)
    {
        System.out.print("Рост: ");
        height = input.nextInt();
        System.out.print("Вес: ");
        weight = input.nextInt();
        System.out.print("Цвет глаз: ");
        colorEye = input.next();
        System.out.print("Высота полета: ");
        hightFly = input.nextInt();

        allAnimal.add(new Stork(height, weight, colorEye, hightFly));
    }

    public void showAll()
    {
        System.out.println("\n### Животные зоопарка ###");
        int i = 0;
        for (Animal animal : allAnimal)
        {
            System.out.printf("%d. %s\n", i, animal);
            i++;
        }
    }

    public void showAnimal(int num)
    {
       System.out.println(allAnimal.get(num));
       if (allAnimal.get(num) instanceof Pet)
       {
        ((Pet)allAnimal.get(num)).petting();
       }
       if (allAnimal.get(num) instanceof Training)
       {
        ((Training)allAnimal.get(num)).doTraining();
       }
       if (allAnimal.get(num) instanceof Fly)
       {
        ((Fly)allAnimal.get(num)).flybird();
       }
    }

    public void sayAllAnimals()
    {
        for (Animal animal : allAnimal)
        {
            animal.animalSay();
        }
    }

    public void animalSay(int num)
    {
        allAnimal.get(num).animalSay();
    }

    public void animalShow(int num)
    {
        allAnimal.get(num).animalShow();
    }

    public void removeAnimal(int num)
    {
        allAnimal.remove(num);
    }
}