package com.example.demoBot.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class DialogueTest {


    @Test
    void registerTest(){
        Dialogue dialogue = new Dialogue();
        String res = dialogue.startDialogue("/register", 123l);
        Assertions.assertEquals( "Невверный формат ввода! Правильно: /register [Имя] [Фамилия] [Номер телефона]", res);

    }

    

}
