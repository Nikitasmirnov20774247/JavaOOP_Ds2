package JavaOOP_Ds2;

import JavaOOP_Ds2.animals.*;
import java.util.Scanner;

public class Program
{
    private static void showMenu(Zoo animals, Scanner iScanner)
    {
        try
        {
            System.out.print("\n-== Главное меню зоопарка ==-\n1. Показать информацию о всех животных в зоопарке\n2. Показать информацию о конкретном животном\n3. Издать звук всем животным\n4. Издать звук конкретному животному\n5. Добавить животное в зоопарк\n6. Удалить животное из зоопарка\n7. Выйти из меню\nВыберите пункт меню: ");
            iScanner = new Scanner(System.in);
            int choice = iScanner.nextInt();

            if (choice > 0 && choice < 8)
            {
                if (choice == 1)
                {
                    animals.showAll();
                    showMenu(animals, iScanner);
                }
                if (choice == 2)
                {
                    infoAnimal(animals, iScanner);
                    showMenu(animals, iScanner);
                }
                if (choice == 3)
                {
                    System.out.println();
                    animals.sayAllAnimals();
                    showMenu(animals, iScanner);
                }
                if (choice == 4)
                {
                    sayAnimal(animals, iScanner);
                    showMenu(animals, iScanner);
                }
                if (choice == 5)
                {
                    addAnimal(animals, iScanner);
                    showMenu(animals, iScanner);
                }
                if (choice == 6)
                {
                    System.out.println("\nКакое животное хотите удалить?");
                    removeAnimal(animals, iScanner);
                    showMenu(animals, iScanner);
                }
                if (choice == 7)
                {
                    return;
                }
            }
            else
            {
                System.out.print("\n!! Введеного пункта меню нет !!\n");
                showMenu(animals, iScanner);
            }
        }
        catch (Exception e)
        {
            System.out.print("\n!! Введено не целое значение пункта меню !!\n");
            showMenu(animals, iScanner);
        }
    }

    private static void addAnimal(Zoo animals, Scanner iScanner)
    {
        try
        {
            System.out.print("\n- Меню животных -\n1. Добавить кота\n2. Добавить тигра\n3. Добавить собаку\n4. Добавить волка\n5. Добавить курицу\n6. Добавить аиста\n7. Назад в главное меню\nВыберите пункт меню: ");
            iScanner = new Scanner(System.in);
            int choice = iScanner.nextInt();

            if (choice > 0 && choice < 8)
            {
                if (choice == 1)
                {
                    animals.addCat(iScanner);
                    showMenu(animals, iScanner);
                }
                if (choice == 2)
                {
                    animals.addTiger(iScanner);
                    showMenu(animals, iScanner);
                }
                if (choice == 3)
                {
                    animals.addDog(iScanner);
                    showMenu(animals, iScanner);
                }
                if (choice == 4)
                {
                    animals.addWolf(iScanner);
                    showMenu(animals, iScanner);
                }
                if (choice == 5)
                {
                    animals.addChicken(iScanner);
                    showMenu(animals, iScanner);
                }
                if (choice == 6)
                {
                    animals.addStork(iScanner);
                    showMenu(animals, iScanner);
                }
                if (choice == 7)
                {
                    return;
                }
            }
            else
            {
                System.out.print("\n!! Введеного пункта меню нет !!\n");
                addAnimal(animals, iScanner);
            }
        }
        catch (Exception e)
        {
            System.out.print("\n!! Введено не целое значение пункта меню !!\n");
            addAnimal(animals, iScanner);
        }
    }

    private static void infoAnimal(Zoo animal, Scanner iScanner)
    {
        animal.showAll();
        int size = Zoo.allAnimal.size();
        System.out.print(size + ". Назад в главное меню\nВведите номер животного: ");
        int choice = iScanner.nextInt();
        System.out.println();
        if (choice < size)
        {
            animal.showAnimal(choice);
            infoAnimal(animal, iScanner);
        }
        if (choice == size)
        {
            showMenu(animal, iScanner);
        }
        else
        {
            System.out.print("\n!! Введеного пункта меню нет !!\n");
            infoAnimal(animal, iScanner);
        }
    }

    private static void sayAnimal(Zoo animal, Scanner iScanner)
    {
        animal.showAll();
        int size = Zoo.allAnimal.size();
        System.out.print(size + ". Назад в главное меню\nВведите номер животного, которое будет издавать звук: ");
        int choice = iScanner.nextInt();
        System.out.println();
        if (choice < size)
        {
            animal.animalSay(choice);
            sayAnimal(animal, iScanner);
        }
        if (choice == size)
        {
            showMenu(animal, iScanner);
        }
        else
        {
            System.out.print("\n!! Введеного пункта меню нет !!\n");
            sayAnimal(animal, iScanner);
        }
    }

    private static void removeAnimal(Zoo animal, Scanner iScanner)
    {
        animal.showAll();
        int size = Zoo.allAnimal.size();
        System.out.print(size + ". Назад в главное меню\nВведите номер животного, которое хотите удалить: ");
        int choice = iScanner.nextInt();
        System.out.println();
        if (choice < size)
        {
            System.out.print("Животное ");
            animal.animalShow(choice);
            animal.removeAnimal(choice);
            System.out.println("* Удалено *");
            removeAnimal(animal, iScanner);
        }
        if (choice == size)
        {
            showMenu(animal, iScanner);
        }
        else
        {
            System.out.print("\n!! Введеного пункта меню нет !!\n");
            removeAnimal(animal, iScanner);
        }
    }

    public static void main(String[] args)
    {
        Zoo animals = new Zoo();
        Scanner iScanner = new Scanner(System.in);
        showMenu(animals, iScanner);
        iScanner.close();
    }
}