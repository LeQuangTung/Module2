import java.time.LocalTime;

public class StopWatch {
    private LocalTime startTime;
    private LocalTime endTime;

    public StopWatch(){
        startTime = LocalTime.now();
    }
    public  StopWatch(LocalTime startTime, LocalTime endTime){
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public LocalTime getStartTime(){
        return startTime;
    }
    public LocalTime getEndTime(){
        return endTime;
    }

    public void start(){
        this.startTime = LocalTime.now();
    }
    public void stop(){
        this.endTime = LocalTime.now();
    }
    public int getElapsedTime(){
        int miliSecond = endTime.getSecond() - startTime.getSecond();
        return miliSecond;

    }

    public static int[] selectionSort(int...a){
        for (int i=0;i< a.length;i++){
            for (int j=i+1;j<a.length;j++){
                if (a[j]<a[i]){
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a;
    }

    public static void main(String[] args) {
        int []a = new int[100000];
        for (int i=0; i<100000; i++){
            a[i]=(int)(Math.random()*1000);
        }
        LocalTime start = LocalTime.now();
        a = selectionSort(a);
        LocalTime end = LocalTime.now();
        StopWatch sw = new StopWatch(start,end);
        System.out.println("Time: " + sw.getElapsedTime());
        for (int x : a){
            System.out.print(x + ", ");
        }
        System.out.println();
        System.out.println("Thời gian chạy: " + sw.getElapsedTime());
    }
}
