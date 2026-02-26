public class TransportPlane extends Aircraft { // AvionDeTransport -> TransportPlane
    public TransportPlane(String name) {
        super(name);
    }

    @Override
    public String takeOff() {
        return "The transport plane " + name + " uses its big thrusters to take off";
    }
}