package com.compary.ioc;


import java.util.Base64;

public class Base64Encoder implements IEncoder{

    public String encode(String massage) {
        return Base64.getEncoder().encodeToString(massage.getBytes());
    }
}
