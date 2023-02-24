public class DefaultRoundPeg implements RoundPeg{

    private final double radius;

    public DefaultRoundPeg(double radius) throws ParametrException {
        if (radius < 0)
            throw new ParametrException("Введен неккоректный параметр!");
        this.radius = radius;

    }

    @Override
    public double radius() {
        return radius;

    }

}
