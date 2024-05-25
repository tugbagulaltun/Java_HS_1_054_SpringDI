package com.tugba.Step2;

public class Print {

    public void printMessage(MessageType type){
        switch (type){
            case STANDART ->System.out.println("Merhaba Dünya!");
            case ERROR -> System.err.println("Merhaba Dünya!");
        }
    }
}
