package JavaOOP_Ds2.animals;

public class Cat extends HomeAnimal 
{
    private final String wool;
    
    protected Cat(String name, String species, String vaccinated, String color, String dateBirthday, int height,int weight, String colorEye, String wool) 
    {
        super(name, species, vaccinated, color, dateBirthday, height, weight, colorEye);
        this.wool = wool;
    }

    @Override
    public void animalShow()
    {
        System.out.println("- Кот -");
    }

    @Override
    public void animalSay()
    {
        System.out.println("- Кот - говорит: мяяяуу");
    }

    @Override
    public void petting() 
    {
        System.out.println("* Идёт процесс поглаживания Кота *");
    }

    @Override
    public String toString() 
    {
        return String.format("- Кот - %s Наличие шерсти: %s", super.toString(), this.wool);
    }
}