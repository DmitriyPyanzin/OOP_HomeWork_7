public class Machine {

    public RoundHole create(RoundPeg peg) {
        return new DefaultRoundHole(peg.radius());

    }

}
