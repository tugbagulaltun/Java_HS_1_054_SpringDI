package com.tugba.Step3;

public class Runner {
    public static void main(String[] args) {
    Provider provider;
    Printer printer;

    provider= new MessageProviderEN();
    printer=new ErrorPrinter();

    printer.setProvider(provider);
    printer.print();




    }
}
