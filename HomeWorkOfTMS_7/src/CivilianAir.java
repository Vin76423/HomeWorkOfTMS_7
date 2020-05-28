public class CivilianAir extends AirTransport {

    private int quantityPassengers;
    private boolean haveBusinessClass;
    private int passengersNow = 0;

    public CivilianAir(String model, int horsepower, int sped, int mass, int wingspan, int runwayLength, int quantityPassengers, boolean haveBusinessClass) {
        super(model, horsepower, sped, mass, wingspan, runwayLength);
        this.quantityPassengers = quantityPassengers;
        this.haveBusinessClass = haveBusinessClass;
    }

    public CivilianAir() { }


    public int getQuantityPassengers() { return quantityPassengers; }

    public void setQuantityPassengers(int quantityPassengers) { this.quantityPassengers = quantityPassengers; }

    public boolean isHaveBusinessClass() { return haveBusinessClass; }

    public void setHaveBusinessClass(boolean haveBusinessClass) { this.haveBusinessClass = haveBusinessClass; }


    @Override
    public void description() {
        super.description();
        System.out.println("Количество пасажиров на борту - " + quantityPassengers + " чел.");
        System.out.println("Наличие бизнес-класса - " + (haveBusinessClass ? "Да" : "Нет"));
    }

    public void passengersOn ( int people ) {
        if ( passengersNow == quantityPassengers ) {
            System.out.println("Самолет заполнен по максимуму");
            return;
        }

        if ( passengersNow + people > quantityPassengers ) {
            System.out.println("Вам нужен самолет побольше");
        } else {
            System.out.println("На борт самолета успешно зашло " + people + " пасажиров");
            passengersNow += people;
        }
    }

    public void passengersOff ( int people ) {
        if ( passengersNow == 0 ) {
            System.out.println("Самолет пуст");
            return;
        }

        if ( people > passengersNow ) {
            System.out.println("Самолете не содержит так много пасажиров");
        } else {
            System.out.println("Самолет успешно покинули " + people + " пасажиров");
            passengersNow -= people;
        }
    }

    public void passengersOff () {
        if ( passengersNow == 0 ) {
            System.out.println("Самолет пуст");
        } else {
            System.out.println("Самолет успешно покинули все пасажиры, а именно " + passengersNow + " человек");
            passengersNow = 0;
        }
    }
}

