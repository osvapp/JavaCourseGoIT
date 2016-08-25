package modul2.homework1;

public class sum {
    public static void main(String[] args) {
        int[] min1 = {2, 6, 7, 765, 567, 87, 87, -555, 6, -33, 4};
        int sum = 0;
        for (int i : min1) {
            sum += i;
        }
        System.out.println(sum);
    }
}


