package com.tugba.Step3;

public class ErrorPrinter implements Printer{//Kırmızı renkli kalemi tutan öğrenci
    private Provider provider;
    @Override
    public void print() {
        System.err.println(provider.getMessage());
    }

    @Override
    public void setProvider(Provider provider) {
    this.provider=provider;
    }
}
