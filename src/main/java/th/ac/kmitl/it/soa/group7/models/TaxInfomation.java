package th.ac.kmitl.it.soa.group7.models;

public class TaxInfomation {
    private String taxCode;
    private int calculatedRate;
    private String basisAmount;

    public String getTaxCode() {
        return taxCode;
    }

    public void setTaxCode(String taxCode) {
        this.taxCode = taxCode;
    }

    public int getCalculatedRate() {
        return calculatedRate;
    }

    public void setCalculatedRate(int calculatedRate) {
        this.calculatedRate = calculatedRate;
    }

    public String getBasisAmount() {
        return basisAmount;
    }

    public void setBasisAmount(String basisAmount) {
        this.basisAmount = basisAmount;
    }
    
    
}
