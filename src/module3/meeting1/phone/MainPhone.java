package module3.meeting1.phone;

public class MainPhone {

    public static void main(String[] args) {

        IPhone Iphone6 = new IPhone();
        Iphone6.pubTest();


        IPhone IphoneNew6 = new IPhone();
        //IphoneNew6.pubTest1();     > нет доступа с другого лкасса < так работать не будет

        IPhone IphonePro6 = new IPhone();
        IphonePro6.proTest();



                                            // GET and SET
        IPhone GetSet = new IPhone ("Iphone", "6S", 2016, 499.99, "IOS 9", "Gold");
        // пошла логика и в конце я например хочу взять страну
        System.out.println(GetSet.setColor());

        System.out.println(GetSet.getCost());

    }

}
