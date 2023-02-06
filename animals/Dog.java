package JavaOOP_Ds2.animals;

public class Dog extends HomeAnimal implements Training
{
    private final String training;

    protected Dog(String name, String species, String vaccinated, String color, String dateBirthday, int height,int weight, String colorEye, String training) 
    {
        super(name, species, vaccinated, color, dateBirthday, height, weight, colorEye);
        this.training = training;
    }

    @Override
    public void animalShow()
    {
        System.out.println("- Собака -");
    }

    @Override
    public void animalSay()
    {
        System.out.println("- Собака - говорит: гав-гав");
    }

    @Override
    public void petting()
    {
        System.out.println("* Идёт процесс поглаживания Собаки *");
    }

    @Override
    public void doTraining()
    {
        System.out.println("* Идет дрессировка *");
    }

    @Override
    public String toString()
    {
        return String.format("- Собака - %s Дресировка: %s", super.toString(), this.training);
    }
}