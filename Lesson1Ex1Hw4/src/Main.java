public class Main {
    public static void main(String[] args) {
        /*
         * Опишите класс Phone (одним из свойств должен быть его номер). Также опишите
         * класс Network (сеть мобильного оператора). Телефон должен иметь метод
         * регистрации в сети мобильного оператора. Также у телефона должен быть метод call
         * (номер другого телефона), который переберет все телефоны, зарегистрированные в
         * сети. Если такой номер будет найден, то осуществить вызов, если нет - вывести
         * сообщение об ошибочности набранного номера.
         */

        Network vodafon = new Network();
        Phone ph1 = new Phone("Iphone", 38050543, vodafon);
        ph1.registerPhone(vodafon);

        System.out.println(vodafon.toString());
    }
}
