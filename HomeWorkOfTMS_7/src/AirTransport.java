public class AirTransport extends Transport {

    private int wingspan;
    private int runwayLength;

    public AirTransport(String model, int horsepower, int sped, int mass, int wingspan, int runwayLength) {
        super(model, horsepower, sped, mass);
        this.wingspan = wingspan;
        this.runwayLength = runwayLength;
    }

    public AirTransport() { }


    public int getWingspan() { return wingspan; }

    public void setWingspan(int wingspan) { this.wingspan = wingspan; }

    public int getRunwayLength() { return runwayLength; }

    public void setRunwayLength(int runwayLength) { this.runwayLength = runwayLength; }


    @Override
    public void description() {
        super.description();
        System.out.println("Размах крыльев - " + wingspan + " м");
        System.out.println("Минимальная необходимая длинна взлетно-посадочной полосы - " + runwayLength + " м");
    }
}
