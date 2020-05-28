public class Freight extends GroundTransport {

    private int carryingCapacity;
    private int carryNow = 0;

    public Freight(String model, int horsepower, int sped, int mass, int quantityTires, int fuelConsumption, int carryingCapacity) {
        super(model, horsepower, sped, mass, quantityTires, fuelConsumption);
        this.carryingCapacity = carryingCapacity;
    }

    public Freight() { }

    public int getCarryingCapacity() {
        return carryingCapacity;
    }

    public void setCarryingCapacity(int carryingCapacity) {
        this.carryingCapacity = carryingCapacity;
    }


    @Override
    public void description() {
        super.description();
        System.out.println("Грузоподьёность - " + carryingCapacity + " т");
    }

    public void loadOn ( int ton ) {
        if ( carryNow == carryingCapacity ) {
            System.out.println("Грузавик загружен по максимуму");
            return;
        }

        if ( carryNow + ton > carryingCapacity ) {
            System.out.println("Вам нужен грузовик побольше");
        } else {
            System.out.println("В грузовик успешно загружено " + ton + " тонн груза");
            carryNow += ton;
        }
    }

    public void loadOff ( int ton ) {
        if ( carryNow == 0 ) {
            System.out.println("Грузавик пуст");
            return;
        }

        if ( ton > carryNow ) {
            System.out.println("Грузовик не содержит так много груза");
        } else {
            System.out.println("Из грузовик успешно выгружено " + ton + " тонн груза");
            carryNow -= ton;
        }
    }

    public void loadOff () {
        if ( carryNow == 0 ) {
            System.out.println("Грузовик пуст");
        } else {
            System.out.println("Из грузовика успешно выгружен весь имеющийся груз, а именно " + carryNow + " тонн");
            carryNow = 0;
        }
    }
}
