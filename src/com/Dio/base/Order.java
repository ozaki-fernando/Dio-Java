package com.Dio.base;

public class Order{
    private final String code;
    private final int totalValue;
    double total;

    public Order(String code, int totalValue){
        this.code = code;
        this.totalValue = totalValue;
    }
    
    public double calculateFee(){
        switch (this.totalValue){
            case 100:
                return totalValue * 0.99;
            case 200:
                return totalValue * 1.99;
            default:
                return totalValue;
        }
    }
    @Override
    public String toString(){
        return "Order= code:'" + code + "'. Valor = " + this.totalValue + ".";
    }
};