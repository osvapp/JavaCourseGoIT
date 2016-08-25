package modul2.homework1;

public class Array {

    static int sun(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    static double sun(double[] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }


    public static int min(int[] array) {
        int min = 0;
        for (int i = 0; i > array.length; i++) {
            min = array[i];
        }
        return 0;
    }

    public static void main(String[] args) {
           int[] nm = {1, 4, 125, -75, 35, 235, -55, 8985, -8255, -850};
           double[] nm1 = {1.2, 43.4, 654.8, -24.235, 43.674, 4.78, -41.3, 86.23, 95.2886, 10.445};



          System.out.println(sun(nm));
          System.out.println(min(nm));
        //  System.out.println(sun(nm1));
    }
}