public class FighterJet extends Aircraft { // AvionDeChasse -> FighterJet
    public FighterJet(String name) {
        super(name);
    }

    @Override
    public String takeOff() {
        return "The fighter jet " + name + " uses the launch ramp to take off";
    }
}
