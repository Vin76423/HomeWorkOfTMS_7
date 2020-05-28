public class Transport {

    private String model;
    private int horsepower;
    private int sped;
    private int mass;

    public Transport(String model, int horsepower, int sped, int mass) {
        this.model = model;
        this.horsepower = horsepower;
        this.sped = sped;
        this.mass = mass;
    }

    public Transport() { }


    public String getModel() { return model; }

    public void setModel(String model) {
        this.model = model;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(int horsepower) { this.horsepower = horsepower; }

    public int getSped() {
        return sped;
    }

    public void setSped(int sped) { this.sped = sped; }

    public int getMass() {
        return mass;
    }

    public void setMass(int mass) {
        this.mass = mass;
    }


    public void description() {
        System.out.println("Модель - " + model);
        System.out.println("Мощность - " + horsepower + " л.с ( " + converterPower() + " кВ )");
        System.out.println("Максимальная скорость - " + sped + " км/ч");
        System.out.println("Масса - " + mass + " кг");
    }

    private double converterPower() {
        return horsepower * 0.74;
    }
}
