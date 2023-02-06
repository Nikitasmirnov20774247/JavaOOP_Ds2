package JavaOOP_Ds2.animals;

public abstract class HomeAnimal extends Animal implements Pet
{
    private String name;
    private String species;
    private String vaccinated;
    private String color;
    private String dateBirthday;

    protected HomeAnimal(String name, String species, String vaccinated, String color, String dateBirthday, int height, int weight, String colorEye)
    {
        super(height, weight, colorEye);
        this.name = name;
        this.species = species;
        this.vaccinated = vaccinated;
        this.color = color;
        this.dateBirthday = dateBirthday;
    }

    @Override
    public abstract void animalShow();

    @Override
    public abstract void animalSay();

    @Override
    public abstract void petting();

    @Override
    public String toString()
    {
        return String.format("Имя: %s - Порода: %s - Наличие прививок: %s - Цвет шерсти: %s - Дата рождения: %s - %s -", this.name, this.species, this.vaccinated, this.color, this.dateBirthday, super.toString());
    }
}