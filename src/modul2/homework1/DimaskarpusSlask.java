package modul2.homework1;
public class DimaskarpusSlask {
    public static void main(String[] args) {
        double[] doubleArray = {12.12, 312.123, 123.35, 4223.35, 3234.345, 23.746, 77.0345, 234.363, 5786.345, 984.367}; //double array
        int[] intArray = {13, 312, 3, 423, 323, 23, 767, 234, 5786, 984};//int array
        //integer strings
        System.out.println("SUM of all elements in the array: " + "Integer: " + sum(intArray));
        System.out.println("MIN of all elements in the array: " + "Integer: " + min(intArray));
        System.out.println("MAX of all elements in the array: " + "Integer: " + max(intArray));
        System.out.println("MAX POSITIVE of all elements in the array: " + "Integer: " + maxPositive(intArray));
        System.out.println("MULTIPLICATION of all elements in the array: " + "Integer: " + multiplication(intArray));
        System.out.println("MODULUS of all elements in the array: " + "Integer: " + modulus(intArray));
        System.out.println("SECOND LARGEST of all elements in the array: " + "Integer: " + secondLargest(intArray));
        System.out.println("=========================================================================================");  //for section
        //double strings
        System.out.println("SUM of all elements in the array: " + "Double: " + sum(doubleArray));
        System.out.println("MIN of all elements in the array: " + "Double: " + min(doubleArray));
        System.out.println("MAX of all elements in the array: " + "Double: " + max(doubleArray));
        System.out.println("MAX POSITIVE of all elements in the array: " + "Double: " + maxPositive(doubleArray));
        System.out.println("MULTIPLICATION of all elements in the array: " + "Double: " + multiplication(doubleArray));
        System.out.println("MODULUS of all elements in the array: " + "Double: " + modulus(doubleArray));
        System.out.println("SECOND LARGEST of all elements in the array: " + "Double: " + secondLargest(doubleArray));
    }

    //integer
    static int sum(int[] array) {   //sum method
        int sum = 0;
        for (int item : array)
            sum += item;
        return sum;
    }

    static int min(int[] array) {    //min method
        int min = array[0];
        for (short l = 1; l < array.length; l++)
            if (min > array[l]) min = array[l];
        return min;
    }

    static int max(int[] array) {     //max method
        int max = array[0];
        for (short l = 1; l < array.length; l++)
            if (max < array[l]) max = array[l];
        return max;
    }

    static int maxPositive(int[] array) {  //maxPositive method
        int max = array[0];
        for (short l = 1; l < array.length; l++)
            if (max < array[l] && array[l] > 0) max = array[l];
        return max;
    }

    static long multiplication(int[] array) {    //multiplication method
        long multiplication = 1;
        for (long item : array) multiplication *= item;
        return multiplication;
    }

    static int modulus(int[] array) {           //modulus method
        int modulus = array[0] % array[array.length - 1];
        return modulus;
    }

    static int secondLargest(int[] array) {     //secondLarges
        int x = max(array);
        int secondLargest = array[0];
        for (short l = 1; l < array.length; l++)
            if (secondLargest < array[l] && array[l] < x) secondLargest = array[l];
        return secondLargest;
    }

    //Double
    static double sum(double[] array) {           //sum method
        double sum = 0;
        for (double item : array) sum += item;
        return sum;
    }

    static double min(double[] array) {           //min method
        double min = array[0];
        for (short l = 1; l < array.length; l++)
            if (min > array[l]) min = array[l];
        return min;
    }

    static double max(double[] array) {           //max method
        double max = array[0];
        for (short l = 1; l < array.length; l++)
            if (max < array[l]) max = array[l];
        return max;
    }

    static double maxPositive(double[] array) {   //maxPositive method
        double max = array[0];
        for (short l = 1; l < array.length; l++)
            if (max < array[l] && array[l] > 0) max = array[l];
        return max;
    }

    static double multiplication(double[] array) {    //multiplication method
        double multiplication = 1;
        for (double item : array) multiplication *= item;
        return multiplication;
    }

    static double modulus(double[] array) {           //modulus method
        double modulus = array[0] % array[array.length - 1];
        return modulus;
    }

    static double secondLargest(double[] array) {     //secondLargest method
        double x = max(array);
        double secondLargest = array[0];
        for (short l = 1; l < array.length; l++)
            if (secondLargest < array[l] && array[l] < x) secondLargest = array[l];
        return secondLargest;
    }

}

