package model;

public class Moneda {
    private String baseCode;
    private String targetCode;
    private String conversionRate;

    public Moneda() {
    }

    public Moneda(String baseCode, String targetCode, String conversionRate) {
        this.baseCode = baseCode;
        this.targetCode = targetCode;
        this.conversionRate = conversionRate;
    }

    public String getBaseCode() {
        return baseCode;
    }

    public String getTargetCode() {
        return targetCode;
    }

    public String getConversionRate() {
        return conversionRate;
    }

    @Override
    public String toString() {
        return "Moneda{" +
                "baseCode='" + baseCode + '\'' +
                ", targetCode='" + targetCode + '\'' +
                ", conversionRate='" + conversionRate + '\'' +
                '}';
    }
}

