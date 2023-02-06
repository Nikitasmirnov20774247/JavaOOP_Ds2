package JavaOOP_Ds2.animals;

public class Chicken extends Bird implements Fly
{
    protected Chicken(int height, int weight, String colorEye, int hightFly)
    {
        super(height, weight, colorEye, hightFly);
    }

    @Override
    public void animalShow()
    {
        System.out.println("- Курица -");
    }

    @Override
    public void animalSay()
    {
        System.out.println("- Курица - говорит: ко-ко-ко-ко-ко");
    }

    @Override
    public void flybird()
    {
        System.out.printf("Я лечу на %d метрах\n", super.getHightFly());
    }

    @Override
    public String toString()
    {
        return String.format("- Курица - %s - Высота полёта: %s", super.toString(), hightFly);
    }
}