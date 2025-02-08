package com.company.Factory;

public class HashingAlgorithmFactory {
    // this will store the business logic and will be responsible for initializing the objects according to requirement
    public HashingAlgorithm getAlgorithm(String algorithmName) throws AlgorithmNotFoundException {
        return switch (algorithmName) {
            case "MD-5" -> new MD_5();
            case "SHA" -> new SHA();
            default -> throw new AlgorithmNotFoundException();
        };
    }
}
