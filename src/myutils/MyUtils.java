package myutils;

public class MyUtils {

    public static float ucgenCevre(float a, float b, float c) {
        float cevre = a + b + c;
        return cevre;
    }

    public static float ucgenAlan(float a, float b) {
        float alan = a * b / 2;
        return alan;
    }

    public static float cokgenCevre(float kenar) {
        float alan = kenar * kenar;
        return alan;
    }

    public static double cokgenAlan(float a, float b) {
        double cokgenAlanı = (a * (b * b)) / (4.0 * Math.tan(Math.PI / a));
        return cokgenAlanı;
    }

    public static double[] sayac(int[] d) {

        double[] dizi = new double[d.length];
        double[] dizi1 = new double[d.length];
        for (int i = 0; i < d.length; i++) {
            dizi[i] = ((3 * Math.pow(d[i], 2)) - (2 * Math.exp(d[i]))) + Math.sqrt(d[i]);
            dizi1[i] = (1 / (1 + Math.exp(dizi[i])));
        }
        return dizi1;
    }
}
