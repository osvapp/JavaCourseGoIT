package modul2.meeting1;

public class LogicalResultClass {
    /* Logical оператор работает только с boolean  переменными
       && - Logical AND  "И"
       || - Logical OR   "ИЛИ"
        ! - Logical NOT  "НЕТ"

                    &&
             true - true    = true
             true - false   = false
             false - true   = false
             false - false  = false

                    ||
             true - true    = true
             true - false   = true
             false - true   = true
             false - false  = false

                    !
             true - true    = false
             true - false   = false
             false - true   = true
             false - false  = true
        */

    public static void main(String[] args) {

        boolean NO = false;
        boolean YES = true;

        if (YES && NO){
            System.out.println("in the month of 32 days ?");
        }
        else { // Использование else -> у всех других случаях !
            System.out.println("today is 20 of august ?");
        }

        YES = true;
        NO = false;
        if (YES || NO){
            System.out.println("I understood everything");
        }
        else {
            System.out.println("I do not understand anything");
        }

        YES = false;
        NO = true;
        if (YES || NO){
            System.out.println("I like course goIT");
        }
        else {
            System.out.println("I do not like course goIT");
        }

    }

}
