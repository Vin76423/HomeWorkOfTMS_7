public class Main {
    public static void main(String[] args) {

        Car car = new Car("Audi", 360,290,2500,4,10,"Sedan",5);
        car.description();
        car.counter(6);



        Freight freight = new Freight("Scania",520,220,5600,6,15,8);
        freight.description();
        freight.loadOn(4);
        freight.loadOn(5);
        freight.loadOn(2);
        freight.loadOn(2);
        freight.loadOn(3);

        freight.loadOff(4);
        freight.loadOff(5);
        freight.loadOff(4);
        freight.loadOff(2);



        CivilianAir plain = new CivilianAir("Boing",1500,650,15500,25,350,250,false);
        plain.description();

        plain.passengersOn(150);
        plain.passengersOn(250);
        plain.passengersOn(50);

        plain.passengersOff();
        plain.passengersOff();



        MilitaryAir armyPlain = new MilitaryAir("F-16", 1650,750,12000,15,250,6,true);
        armyPlain.description();

        armyPlain.shot();
        armyPlain.shot(10);
        armyPlain.shot(4);
        armyPlain.shot();
        armyPlain.shot();

        armyPlain.ejectionOn();
        armyPlain.ejectionOn();
    }
}
