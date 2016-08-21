package modul2.meeting1;

public class ArrayLogicalClass {
    public static void main(String[] args) {
        int[] balances = {2, 22, 445, 5423, 2345, 756, 678, 768965, 987789, 96789674, 2345, 234, 456, 45677, 87654, 1, 543, 4543};
        for (int balance : balances) {
            if (balance > 500 && balance < 5000 || balance > 20000){
               // -condition-  -logical operator- -condition-   выполнение
                System.out.println("balance between 500 to 5000 " +balance);
            }
        }

    }
}
