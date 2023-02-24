public class DefaultSquarePeg implements SquarePeg{

    private final double side;

    public DefaultSquarePeg(double side) throws ParametrException {
        if (side < 0)
            throw new ParametrException("Введен неккоректный параметр!");
        this.side = side;

    }

    @Override
    public double side() {
        return side;

    }


}
