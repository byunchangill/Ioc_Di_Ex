package com.compary.ioc;


public class Encoder {
    private IEncoder iEncoder;

    public Encoder(IEncoder iEncoder) {
        this.iEncoder = iEncoder;
    }

    public String encode(String massage) {
        return iEncoder.encode(massage);
    }
}
