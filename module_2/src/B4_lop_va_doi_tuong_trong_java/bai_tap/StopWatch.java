package B4_lop_va_doi_tuong_trong_java.bai_tap;

import java.util.Arrays;

public class StopWatch {
    private long startTime;
    private long endTime;

    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }

    public StopWatch() {
        startTime = System.currentTimeMillis();
    }
    public long start() {
        return startTime = System.currentTimeMillis();
    }
    public long stop() {
        return endTime = System.currentTimeMillis();
    }

    public long getElapsedTime() {
        long time = endTime - startTime ;
       return time;
    }

    public static void main(String[] args) {
        double[] arr = new double[100000000];
        for (int i = 0; i < 100000000; i++) {
            arr[i]= Math.random()*10000;
        }
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        Arrays.sort(arr);
        stopWatch.stop();
        System.out.println("Thời gian thực hiện sort arr");
        long millisecond = stopWatch.getElapsedTime();
        System.out.println(millisecond);

    }

}
