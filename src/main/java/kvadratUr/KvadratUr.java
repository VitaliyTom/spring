package kvadratUr;

import calc.*;

public class KvadratUr {

    private int a;
    private int b;
    private int c;
    private CalcPlus plus;
    private CalcMinus minus;
    private CalcUmnogenie umnogenie;
    private CalcDelenie delenie;
    private CalcKoren koren;


    public KvadratUr() {
    }


    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public CalcPlus getPlus() {
        return plus;
    }

    public void setPlus(CalcPlus plus) {
        this.plus = plus;
    }

    public CalcMinus getMinus() {
        return minus;
    }

    public void setMinus(CalcMinus minus) {
        this.minus = minus;
    }

    public CalcUmnogenie getUmnogenie() {
        return umnogenie;
    }

    public void setUmnogenie(CalcUmnogenie umnogenie) {
        this.umnogenie = umnogenie;
    }

    public CalcDelenie getDelenie() {
        return delenie;
    }

    public void setDelenie(CalcDelenie delenie) {
        this.delenie = delenie;
    }

    public CalcKoren getKoren() {
        return koren;
    }

    public void setKoren(CalcKoren koren) {
        this.koren = koren;
    }


    public void ur() {

        double d = minus.poschitaj(umnogenie.poschitaj(b), umnogenie.poschitaj(4, a, c));


        if (d > 0) {                          //   D =    (-2 3 2) >0;   (1 -8 16) = 0;   (13 -4  1)<0;

            double x1 = delenie.poschitaj((plus.poschitaj(-b, koren.poschitaj(d))), umnogenie.poschitaj(2, a));
            double x2 = delenie.poschitaj((minus.poschitaj(-b, koren.poschitaj(d))), umnogenie.poschitaj(2, a));

            System.out.println("D = " + d);
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);


        } else {
            if (d == 0) {

                double x1 = delenie.poschitaj((plus.poschitaj(-b, koren.poschitaj(d))), umnogenie.poschitaj(2, a));
                System.out.println("D = " + d);
                System.out.println("x1,2 = " + x1);
            } else {
                System.out.println("D = " + d);
                System.out.println("действительных корней нет. ");
            }

        }

    }

}
