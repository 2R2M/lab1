package com.example.lab1.model;

public class Procent {
    private double sum;


    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }


    public Procent() {

    }

    public Procent(double sum) {
        this.sum = sum;
    }

   public double countPr(int pr)
    {
     return pr/100.0*sum;
    }

    public double countSum(int pr)
    {
        return sum+countPr(pr);
    }
    public int countSumTrunc(int pr)
    {
        return (int)countSum(pr);
    }


}
