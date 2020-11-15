package bsu.rfe.java.group10.lab2.Masyuk.А12;

public class Formula {
    private Double sum;

    public Formula(){
        sum = 0.0;
    }

    public Double calculate1(Double x, Double y, Double z){
        return((Math.sin(y)+Math.pow(y,2) + Math.exp(Math.cos(y))*
                Math.pow(Math.log(z)+Math.sin(3.14*Math.pow(x,2)),1./4)));
    }

    public Double calculate2 (Double x, Double y, Double z){
        return (Math.tan(Math.pow(x,2))+Math.sqrt(y))/(z*Math.log10(x+y));
    }

    public Double getSum(){
        return sum;
    }

    public void setSum(Double x) {
        sum = x;
    }

    public void plusSum(Double result){
        sum+=result;
    }
}

