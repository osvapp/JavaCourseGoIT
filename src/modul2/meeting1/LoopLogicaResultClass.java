package modul2.meeting1;

    public class LoopLogicaResultClass {
        public static void main(String[] args) {
/* Loop(кольцо) - цыкл
            Есть два цыкла в java
            "for" и "while"
            for состоит из  3х частей это
            (-variable(переменная)- -condition(условие)- -что делать после окончания цыкла-
                            |                      |                             |
        for             (int p = 43;            p < 100;                         p++) {
                                                                                 |
                                                                        System.out.println("people +" + p);     */
            boolean isActive = true;
            for (int p = 43; p < 100; p++) {
                System.out.println(+ p);
                // brack continue - нельзя совмещать вместе ! Не работають вместе !
                // brack;  - Принудительно выйти их цыкла
                if (isActive) {  // еслм в начале поставить  -> "!" <-   выражение автоматички переходить в c true в false или на оборот
                    //break;
                    continue;// продолжай выполнять
                }
                System.out.println("after continue"); //если условия выполняеться в continue то println непоявляеться.
            }

                int w = 100;
                while (w > 42) {  // while принемает только одно условие  в кавычках
                    System.out.println(w);
                    w--;

                 /*   int n = -10;      // Операция do в любом случаии выполняеться один  ра в любом true или false
                    do {
                        System.out.println("Count is:" + n);
                        n++;
                    }
                 */
                }
            }
        }





