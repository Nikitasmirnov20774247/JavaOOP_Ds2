package JavaOOP_Ds2.animals;

public abstract class Bird extends Animal
{
    protected int hightFly;

    protected Bird(int height, int weight, String colorEye, int hightFly)
    {
        super(height, weight, colorEye);
        this.hightFly = hightFly;
    }

    public int getHightFly()
    {
        return this.hightFly;
    }

    public abstract void flybird();
}