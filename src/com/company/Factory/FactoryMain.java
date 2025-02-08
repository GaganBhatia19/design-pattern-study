package com.company.Factory;

public class FactoryMain {
    public static void run() {
        HashingAlgorithm hashingAlgorithm;
        try {
            hashingAlgorithm = new HashingAlgorithmFactory().getAlgorithm("SHA2");
            hashingAlgorithm.computeHash();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
