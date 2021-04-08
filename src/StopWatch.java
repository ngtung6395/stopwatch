import java.util.Arrays;
import java.util.Date;

public class StopWatch extends Date {
    private double startTime;
    private double endTime;

    public StopWatch(){
    }
    public void startTime(){
        this.startTime = System.currentTimeMillis();
    }
    public void endTime(){
        this.endTime = System.currentTimeMillis();
    }
    double getElapedTime(){
        return (endTime-startTime)/1000;
    }

    public static void main(String[] args) {
        StopWatch demo = new StopWatch();
        demo.startTime();
        double[] array = new double[100000];
        int i = 0;
        while(i< array.length){
            array[i]=(int)(Math.random()*1000);
            i++;
        }
        Arrays.sort(array);
        for (double a:array
             ) {
            System.out.println(a);
        }
        demo.endTime();
        System.out.println(demo.getElapedTime());
    }

}
