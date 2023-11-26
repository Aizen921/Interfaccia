public class Rettangolo implements Forma{
    private double base;
    private double altezza;

    Rettangolo(double base, double altezza){
        this.base = base;
        this.altezza = altezza;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltezza() {
        return altezza;
    }

    public void setAltezza(double altezza) {
        this.altezza = altezza;
    }

    @Override
    public void calcolaArea() {
        System.out.println("L'area del rettanolo è = " + getBase() * getAltezza());
    }

    @Override
    public String toString() {
        return "Rettangolo{" +
                "base=" + base +
                ", altezza=" + altezza +
                '}';
    }
}
