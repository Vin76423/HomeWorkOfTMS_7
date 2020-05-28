public class GroundTransport extends Transport {

    private int quantityTires;
    private int fuelConsumption;

    public GroundTransport(String model, int horsepower, int sped, int mass, int quantityTires, int fuelConsumption) {
        super(model, horsepower, sped, mass);
        this.quantityTires = quantityTires;
        this.fuelConsumption = fuelConsumption;
    }

    public GroundTransport() { }


    public int getQuantityTires() { return quantityTires; }

    public void setQuantityTires(int quantityTires) { this.quantityTires = quantityTires; }

    public int getFuelConsumption() { return fuelConsumption; }

    public void setFuelConsumption(int fuelConsumption) { this.fuelConsumption = fuelConsumption; }


    @Override
    public void description() {
        super.description();
        System.out.println("количество калес - " + quantityTires + " шт.");
        System.out.println("Расход топлива - " + fuelConsumption + " л/100 км.");
    }
}
