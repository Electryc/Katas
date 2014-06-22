package com.andreic.katas.romannumerals;

/**
 * Created by andreicatinean on 22/06/2014.
 */
public class RomanSymbol {

    private final int value;
    private final String symbol;


    public RomanSymbol(int value, String symbol) {
        this.value = value;
        this.symbol = symbol;
    }

    public int getValue() {
        return value;
    }

    public String getSymbol() {
        return symbol;
    }

    @Override
    public String toString() {
        return "RomanSymbol{" +
                "value=" + value +
                ", symbol='" + symbol + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        RomanSymbol that = (RomanSymbol) obj;

        return value == that.value && !(symbol != null ? !symbol.equals(that.symbol) : that.symbol != null);

    }

    @Override
    public int hashCode() {
        int result = value;
        result = 31 * result + (symbol != null ? symbol.hashCode() : 0);
        return result;
    }
}
