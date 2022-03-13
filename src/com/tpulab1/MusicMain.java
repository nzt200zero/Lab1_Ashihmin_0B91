package com.tpulab1;


public class MusicMain {

    public static void main(String[] args) {

        System.out.println("наименования товаров:".toUpperCase());

        WashingM stirka = new WashingM(200, 50, 35440.0, "LG", "Ручками", true, "25.03.2001", "Турбачистка", false);

        System.out.println("Полное Название:" + stirka.getManufacture() +" "+ stirka.getName());
        System.out.println("Мощность:" + stirka.getPower());
        System.out.println("Вес:" + stirka.getWeight());
        System.out.println("Цена:" + stirka.getPrice());
        System.out.println("Произваодитель:" + stirka.getManufacture());
        System.out.println("На чем транспортировать:" + stirka.getTransportation());
        System.out.println("Встраивается в интерьер:" + stirka.getIntegrated());
        System.out.println("Дата проверки:" + stirka.getDate());
        System.out.println("Имеется ли защита от влаги:" + stirka.getProtection());

        System.out.println("-------------");

        WashingM powershell = new WashingM(240, 70, 120_000.0, "Samsung", "Доставка бесплатно", true, "20.07.2019", "Все блястит ", true);

        System.out.println("Полное Название:" + powershell.getManufacture() +" "+ stirka.getName());
        System.out.println("Мощность:" + powershell.getPower());
        System.out.println("Вес:" + powershell.getWeight());
        System.out.println("Цена:" + powershell.getPrice());
        System.out.println("Произваодитель:" + powershell.getManufacture());
        System.out.println("На чем транспортировать:" + powershell.getTransportation());
        System.out.println("Встраивается в интерьер:" + powershell.getIntegrated());
        System.out.println("Дата проверки:" + powershell.getDate());
        System.out.println("Имеется ли защита от влаги:" + powershell.getProtection());

        System.out.println("-------------");

        WashingM hhpp = new WashingM(220, 65, 44720.0, "Dexp", "Доставка бесплатно", true, "25.01.2016", "Ультрачистота", false);

        System.out.println("Полное Название:" + hhpp.getManufacture() +" "+ stirka.getName());
        System.out.println("Мощность:" + hhpp.getPower());
        System.out.println("Вес:" + hhpp.getWeight());
        System.out.println("Цена:" + hhpp.getPrice());
        System.out.println("Произваодитель:" + hhpp.getManufacture());
        System.out.println("На чем транспортировать:" + hhpp.getTransportation());
        System.out.println("Встраивается в интерьер:" + hhpp.getIntegrated());
        System.out.println("Дата проверки:" + hhpp.getDate());
        System.out.println("Имеется ли защита от влаги:" + hhpp.getProtection());

    }
}
        // Album Panzerfaust = new Album("Рамштайн","Автоцвет","25.03.2201", "1:51");

       /* System.out.println(Panzerfaust.getGroup());
        System.out.println(Panzerfaust.getGenre());
        System.out.println("Год выпуска: " + Panzerfaust.getDate());
        System.out.println("Продолжительность альбома: " + Panzerfaust.getTime());//убрать

        System.out.println("-------------");

        Kitchenappliances Torture = new Kitchenappliances("Cannibal Corpse", "Death Metal","13.03.2012","43:58" );

        System.out.println(Torture.getGroup());
        System.out.println(Torture.getGenre());
        System.out.println("Год выпуска: " + Torture.getDate());
        System.out.println("Продолжительность альбома: " + Torture.getTime());

        System.out.println("-------------");

        WashingM washingM1 = new WashingM("En vind av sorg", "6:21");

        System.out.println(washingM1.getName());
        System.out.println("Продолжительность песни: " + washingM1.getProtection());

        System.out.println("-------------");

        WashingM washingM2 = new WashingM("Beholding the Throne of Might","6:06" );

        System.out.println(washingM2.getName());
        System.out.println("Продолжительность песни: " + washingM2.getProtection());

        System.out.println("-------------");

        WashingM washingM3 = new WashingM("Scourge of Iron","4:39" );

        System.out.println(washingM3.getName());
        System.out.println("Продолжительность песни: " + washingM3.getProtection());
    }*/
