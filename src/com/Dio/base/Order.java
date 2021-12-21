package com.Dio.base;
/*
*@author Fernando Ozaki
*@version 1.0.0
*@see BigDecimal
*@since Release 1.0.0
*/
public class Order{
    // representa o código do pedido
    private final String code;
    private final int totalValue;
    double total;
    /*
    *Construtor da classe
    *
    *@param code        Código do pedido
    *@param totalValue  Valor total do pedido
    */
    public Order(String code, int totalValue){
        this.code = code;
        this.totalValue = totalValue;
    }
    /*
    *Calcula as taxas de acordo com o valor do pedido, se o valor for maior que R$100, sera cobrada uma taxa
    *
    *@return    totalValue          Valor total do pedido com o valor das taxas
    @twrows     RuntimeException    Se o valor do pedido for negativo
    */
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