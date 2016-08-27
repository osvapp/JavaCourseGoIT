package module3.meeting1.car;

 class Car {
    public String nameOfTheOwner;
    int year;
    String models;
    int km;
    int doors;
    double proce;

    // this - это ссылка на текущий обект в котором работаем ( ОБЕКТ КЛАССА car !!ВНУТРИ!!

    Car(int year, String models, String drivers) {
        this.year = year;
        this.models = models;
        this.nameOfTheOwner = drivers;
    }

    Car(int year, String models, String drivers, int km, int doors, double proce) {
        this.year = year;
        this.models = models;
        this.nameOfTheOwner = drivers;
        this.km = km;
        this.doors = doors;
        this.proce = proce;
        // перегрузка метода
    }

    void printOwnerName() {
        System.out.println(nameOfTheOwner);
    }

    void printYear() {
        System.out.println(year);
    }


}
