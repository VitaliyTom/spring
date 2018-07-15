package calc;

import DAO.ICalculator;

public class CalcPlus implements ICalculator {

    @Override
    public double poschitaj(double a) {
        return 0;
    }

    @Override
    public int poschitaj(int a, int b) {
        int u = a + b;
        return u;
    }

    @Override
    public double poschitaj(int a, double b) {

        double u = a + b;
        return u;
    }

    @Override
    public int poschitaj(int a) {
        return 0;
    }

    @Override
    public int poschitaj(int a, int b, int c) {
        return 0;
    }

    @Override
    public double poschitaj(double a, int b) {
        return 0;
    }
}
