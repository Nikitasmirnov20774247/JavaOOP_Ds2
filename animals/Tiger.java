package JavaOOP_Ds2.animals;

public class Tiger extends WildAmimal
{
    protected Tiger(int height, int weight, String colorEye, String place, String date)
    {
        super(height, weight, colorEye, place, date);
    }

    @Override
    public void animalSay()
    {
        System.out.println("- Тигр - говорит: Р-р-р-р-р");   
    }

    @Override
    public void animalShow()
    {
        System.out.println("- Тигр -");
    }

    @Override
    public String toString()
    {
        return String.format("- Тигр - %s", super.toString());
    }
}