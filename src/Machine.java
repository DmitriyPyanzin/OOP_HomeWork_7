public class RoundPegHoleMachine {

    public RoundHole create(RoundPeg peg) {
        return new DefaultRoundHole(peg.radius());

    }

}
