package kata2;

public class Main {

    public static void main(String[] args) {
        Histogram histogram = new Histogram(3,4,5,9,9,8,8,1,1,1,-1);
        for (int value : histogram) {
            System.out.println(value + " " + histogram.getCount(value));
        }
    }
    
}
