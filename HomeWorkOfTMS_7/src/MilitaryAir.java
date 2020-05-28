public class MilitaryAir extends AirTransport{

    private int quantityRockets;
    private boolean haveEjection;

    public MilitaryAir(String model, int horsepower, int sped, int mass, int wingspan, int runwayLength, int quantityRockets, boolean haveEjection) {
        super(model, horsepower, sped, mass, wingspan, runwayLength);
        this.quantityRockets = quantityRockets;
        this.haveEjection = haveEjection;
    }

    public MilitaryAir() { }


    public int getQuantityRockets() { return quantityRockets; }

    public void setQuantityRockets(int quantityRockets) { this.quantityRockets = quantityRockets; }

    public boolean isHaveEjection() { return haveEjection; }

    public void setHaveEjection(boolean haveEjection) { this.haveEjection = haveEjection; }


    @Override
    public void description() {
        super.description();
        System.out.println("Количество ракет на борту - " + quantityRockets + " шт.");
        System.out.println("Наличие системы катапультирования - " + (haveEjection ? "Да" : "Нет"));
    }

    public void shot () {
        if (quantityRockets != 0) {
            System.out.println("Выстрел!!!");
            quantityRockets--;
        } else {
            System.out.println("Боеприпасы закончились");
        }
    }

    public void shot (int number) {
        if (quantityRockets == 0) {
            System.out.println("Боеприпасы закончились");
            return;
        }

        if (number > quantityRockets) {
            System.out.println("На борту нет такого количества ракет");
        } else {
            System.out.println("Выстрел!!!Было выпощено " + number + " ракет");
            quantityRockets -= number;
        }
    }

    public void ejectionOn () {
        if (haveEjection) {
            System.out.println("Катапультирование пилота прошло успешно");
            haveEjection = false;
        } else {
            System.out.println("Система катапультирования отсутствует/или уже была применена ранее");
        }

    }
}
