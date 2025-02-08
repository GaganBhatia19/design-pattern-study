package com.company.Factory;

public class SHA implements HashingAlgorithm{
    @Override
    public void computeHash() {
        System.out.println("SHA Algorithm used");
    }
}
