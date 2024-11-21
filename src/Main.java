public class Main {
    //Установите облегченную версию приложения для Android по ссылке
     //Установите версию приложения для Android по ссылке
     //Установите облегченную версию приложения для iOS по ссылке
     //Установите версию приложения для iOS по ссылке
    public static void main(String[] args) {
        //Задача№1
        int clientOs = 1;
        if (clientOs == 1){
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOs == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }else {
            System.out.println("Купите телефон");
        }
        //Задача№2
        // android = 1
        // ios = 0
        int clientDeviceYear = 2014;
        if (clientOs == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOs == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOs != 1 && clientDeviceYear < 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }else {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }

        //Задача№3
        int year = 2021;
        if (year % 4 == 0 ){
            System.out.println(year + " год является високосным");
        }else if (year % 4 != 0) {
            System.out.println(year + " год не является високосным");
        }
        //Задача№4
        int deliveryDistance = 95;
        if (deliveryDistance <=20){
                System.out.println("Потребуется дней:1");
        } else if(deliveryDistance >= 20 && deliveryDistance <= 60){
                System.out.println("Потребуется дней:2");
        } else if (deliveryDistance >= 60 && deliveryDistance <= 100){
            System.out.println("Потребуется дней:3");
        } else {
            System.out.println("Доставки нет");
        }
        //Задача№5
        int monthNumber = 12;
        switch (monthNumber){
            case 1:
                System.out.println("Январь принадлежит к сезону зима");
                break;
            case 2:
                System.out.println("Февраль принадлежит к сезону зима");
                break;
            case 3:
                System.out.println("Март принадлежит к сезону весна");
                break;
            case 4:
                System.out.println("Апрель принадлежит к сезону весна");
                break;
            case 5:
                System.out.println("Май принадлежит к сезону весна");
                break;
            case 6:
                System.out.println("Июнь принадлежит к сезону лето");
                break;
            case 7:
                System.out.println("Июль принадлежит к сезону лето");
                break;
            case 8:
                System.out.println("Август принадлежит к сезону лето");
                break;
            case 9:
                System.out.println("Сентябрь принадлежит к сезону осень");
                break;
            case 10:
                System.out.println("Октябрь принадлежит к сезону осень");
                break;
            case 11:
                System.out.println("Ноябрь принадлежит к сезону осень");
                break;
            case 12:
                System.out.println("Декабрь принадлежит к сезону зима");
                break;
            default:
                System.out.println("Ошибка!!! В году 12 месяцев");

        }


    }

}

















