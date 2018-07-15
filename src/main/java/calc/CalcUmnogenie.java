package calc;


import DAO.ICalculator;

public class CalcUmnogenie implements ICalculator {


    @Override
        public int poschitaj(int a){

            int u = a*a;

            return u;
        }

    @Override
    public double poschitaj(double a) {
        return 0;
    }

    @Override
    public int poschitaj(int a, int b){
            int u = a*b;
            return u;
         }

    @Override
    public double poschitaj(int a, double b) {
        return 0;
    }

    @Override
    public int poschitaj(int a,int b,int c){
        int u = a*b*c;
        return u;
    }

    @Override
    public double poschitaj(double a, int b) {
        return 0;
    }
}
