package modul2.homework1;

public class Max {
    public static void main(String[] args) {

        int[] array = {31, 32, 4, 5, 66, 77, 555, 44, 33, 212};
        int max = array[0];
        for (int m = 0; m < array.length; m++) {
            if (array[m] > max) max = array[m];
        }
        System.out.println(max);

    }
}


