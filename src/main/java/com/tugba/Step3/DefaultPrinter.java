package com.tugba.Step3;

public class DefaultPrinter implements Printer{ //Beyaz renkli kalemi tutan öğrenci
    private Provider provider; // Önce ne yazacağımızı öğreniyoruz.
    @Override
    public void print() {
        System.out.println(provider.getMessage());
    }

    @Override
    public void setProvider(Provider provider) {
    this.provider=provider;
    }
}
