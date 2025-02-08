package com.company.Factory;

public class AlgorithmNotFoundException extends Exception{
    AlgorithmNotFoundException(){
        super("ALGORITHM NOT SPECIFIED");
    }
    AlgorithmNotFoundException(String message) {
        super(message);
    }
}
