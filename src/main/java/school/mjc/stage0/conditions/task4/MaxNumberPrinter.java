package school.mjc.stage0.conditions.task4;

public class MaxNumberPrinter {
    public void printGreatest(int first, int second, int third) {
        int max=first;
        if(max<second){
            max=second;
        }
        if(max<third){
            max=third;
        }
        System.out.println(max);
    }
}
