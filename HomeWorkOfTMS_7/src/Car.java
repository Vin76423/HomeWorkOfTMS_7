public class Car extends GroundTransport {

    private String bodyType;
    private int quantityPassengers;

    public Car(String model, int horsepower, int sped, int mass, int quantityTires, int fuelConsumption, String bodyType, int quantityPassengers) {
        super(model, horsepower, sped, mass, quantityTires, fuelConsumption);
        this.bodyType = bodyType;
        this.quantityPassengers = quantityPassengers;
    }

    public Car() { }


    public String getBodyType() { return bodyType; }

    public void setBodyType(String bodyType) { this.bodyType = bodyType; }

    public int getQuantityPassengers() { return quantityPassengers; }

    public void setQuantityPassengers(int quantityPassengers) { this.quantityPassengers = quantityPassengers; }


    @Override
    public void description() {
        super.description();
        System.out.println("Тип кузова - " + bodyType);
        System.out.println("Количество пасажиров - " + quantityPassengers + " чел.");
    }

    public void counter ( int time ) {
        int way = time * getSped();
        System.out.println("За время " + time + " ч, автомобиль " + getModel() + " двигаясь с максимальной скоростью " +
                getSped() + " км/ч проедет " + way + "км и израсходует " + counterConsumption(way) + " литров топлива");
    }

    private double counterConsumption ( int way ) {
        return way * getFuelConsumption() * 0.01;
    }


}
