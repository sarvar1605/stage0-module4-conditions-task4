package school.mjc.stage0.conditions.task4;

public class TernaryMaxNumberPrinter {
    public void printGreatest(int first, int second, int third) {
        int max=first;
        max=(max<second)?max:second;
        max=(max<third)?max:third;
        System.out.println(max);
    }
}
