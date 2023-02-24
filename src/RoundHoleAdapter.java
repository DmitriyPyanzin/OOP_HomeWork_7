public class RoundHoleAdapter {

    private final SquarePeg squarePeg;

    public RoundHoleAdapter(SquarePeg squarePeg) {
        this.squarePeg = squarePeg;

    }

    public RoundPeg converter() throws ParametrException {
        return new DefaultRoundPeg(squarePeg.side() * Math.sqrt(2) / 2);

    }

    public double side() {
        return squarePeg.side();

    }

}
