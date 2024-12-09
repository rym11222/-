package com.example.demoBot.service;

public class Bakery {
    static String help(){
        return "Это бот пекарни.\nОн может предоставить меню командой /menu\nВы можете зарегистрироваться с помощью команды /register для того, чтобы получать уведомления";
    }

    static String menu(){
        return "Завтраки:\r\n" + //
                        "Круассан с ветчиной и сыром\r\n" + //
                        "Французский тост с кленовым сиропом\r\n" + //
                        "Овсянка на молоке с фруктами\r\n" + //
                        "Пирожные и десерты:\r\n" + //
                        "Шоколадный брауни\r\n" + //
                        "Классический чизкейк\r\n" + //
                        "Тирамису\r\n" + //
                        "Пироги и выпечка:\r\n" + //
                        "Мясной пирог с грибами\r\n" + //
                        "Яблочный пирог с корицей\r\n" + //
                        "Булочки с маком\r\n" + //
                        "Напитки:\r\n" + //
                        "Эспрессо\r\n" + //
                        "Капучино\r\n" + //
                        "Зеленый чай с имбирем\r\n" + //
                        "Сэндвичи и бутерброды:\r\n" + //
                        "Лосось с авокадо на тосте\r\n" + //
                        "Курица с овощами на хлебе с отрубями\r\n" + //
                        "Тунцовый сэндвич с огурцом и майонезом";
    }
}
