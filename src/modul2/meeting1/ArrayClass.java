package modul2.meeting1;

    public class ArrayClass {
        public static void main(String[]args){
        //Arrays - это масик который обозначаеться []  |  Он только !статистический! "точное число !длинна массива!"
        //Вася архитектура начинаеться с  0
        int[] myArray0 = new int[21];

            for(int i = 0; i < myArray0.length; i++){
                System.out.println(myArray0[i]);
            }
                //length - узнать длинну массива

                // обявление массива в другой способ
            int[] myArray1 = {1, 2, 3, 4, 22, 55, 23, 123, 43, 564, 45543, 422, 2345, 1111111};
            System.out.println(myArray1[5]);
            System.out.println(myArray1.length); // длинна масика

                //foreach  - используеться для струткр данных
            int[] balances = {1, 2, 4, 123, 332, 111, 44, 55, 66557, 87778, 898976, 234, 44, 554, 5432, 556, 66, 7653, 3456, 548};
            for (int balence: balances) {
                if (balence > 1000){
                    //send e-mail promotion
                    System.out.println(" email was send ......" + balence);
                }

            }



    }
}
