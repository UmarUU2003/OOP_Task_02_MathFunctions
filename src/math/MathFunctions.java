package math;

public class MathFunctions {
    public static final double PI;
    public static final double E;

    static {
        PI = 3.14159265359;
        E = 2.71828182846;
    }

    private MathFunctions(){}
    public static double circleArea(double radius){
        return PI * radius * radius;
    }
    public static double exp(double degree){
        return Math.exp(degree);
    }
    public static double triangleArea(double firstSide, double secondSide, double thirdSide){
        double s = firstSide + secondSide + thirdSide;
        double s2 = s / 2;
        return Math.sqrt(s2 * (s2 - firstSide) * (s2 - secondSide) * (s2 - thirdSide));
    }
}
