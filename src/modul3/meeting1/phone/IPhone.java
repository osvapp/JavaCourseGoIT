package modul3.meeting1.phone;

public class IPhone {
    //вызов переменных!( тут их еще называют "филды"
    // так же тут можно использовать private и public
                 /*!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
                          ОНИ ВСЕГДА ДОЛЖНЫ БЫТЬ !!PRIVATE!!!
                !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!! */
    private String name;
    private String model;
    private int year;
    private double cost;
    private String IOS;
    private String color;
    //private String country;


    // есть 4 области видоимости в java ето:
    // public
    // private
    // protected
    // default - packege private


    public IPhone() {
    }

    public void pubTest() {
        System.out.println("public Test");
    }

    // если поставить метод private то тогда МОЖНО вызывать метот модно в том классе в котором он находиться
    //example
    private void pubTest1() {
        System.out.println("no way out from a class");
    }

    // protected - доступен только тем КЛАССАМ которые НАХОДЯТСЯ В НУЖНОМ package !
    protected void proTest() {
        System.out.println("protected");
    }

    public IPhone(String name, String model, int year, double cost, String IOS, String color) {
        this.name = name;
        this.model = model;
        this.year = year;
        this.cost = cost;
        this.IOS = IOS;
        this.color = color;
    }
    /*!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
                     Есди хотим все же редактировать private переменные НАМ НАДО ИСПОЛЬЗОВАТЬ
                                       Get'теры и   Set'еры
                            !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!! */
    // Гетеры и сетеры вызываються тоже через Alt + Ins


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }


    ////////////////////////////////////////////////////////////////////////////////////////////////////////////
                                                //SET'еры
    public void setYear(int year) {
        this.year = year;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getIOS() {
        return IOS;
    }

    public void setIOS(String IOS) {
        this.IOS = IOS;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    public String setColor() {
        return null;
    }
}