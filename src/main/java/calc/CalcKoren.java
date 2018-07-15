package calc;

import DAO.ICalculator;
import static java.lang.Math.sqrt;

public class CalcKoren implements ICalculator{

    @Override
    public double poschitaj(double a){
        double u = sqrt(a);
        return u;
    }

    @Override
    public int poschitaj(int a, int b) {
        return 0;
    }

    @Override
    public double poschitaj(int a, double b) {
        return 0;
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
