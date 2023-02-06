package JavaOOP_Ds2.animals;

public class Stork extends Bird implements Fly
{
    protected Stork(int height, int weight, String colorEye, int hightFly)
    {
        super(height, weight, colorEye, hightFly);
    }

    @Override
    public void animalShow()
    {
        System.out.println("- Аист -");
    }

    @Override
    public void animalSay()
    {
        System.out.println("- Аист - говорит: клок-клок-клок-тук-тук-тук");
    }

    @Override
    public void flybird()
    {
        System.out.printf("Я лечу на высоте %d метров\n", super.getHightFly());
    }

    @Override
    public String toString()
    {
        return String.format("- Аист - %s - Высота полёта: %s", super.toString(), hightFly);
    }
}