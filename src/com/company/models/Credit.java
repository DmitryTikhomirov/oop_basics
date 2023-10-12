package com.company.models;

import java.math.BigDecimal;
import java.util.Objects;

public class Credit {
    private String creditType;
    private String month;
    private BigDecimal bid;

    public Credit(String creditType, String month, BigDecimal bid) {
        this.creditType = creditType;
        this.month = month;
        this.bid = bid;
    }

    @Override
    public String toString() {
        return "Credit{" + "creditType='" + creditType + '\'' +
                ", month='" + month + '\'' +
                ", bid=" + bid +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Credit credit = (Credit) o;
        return Objects.equals(creditType, credit.creditType) && Objects.equals(month, credit.month) && Objects.equals(bid, credit.bid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(creditType, month, bid);
    }

    public String getCreditType() {
        return creditType;
    }

    public void setCreditType(String creditType) {
        this.creditType = creditType;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public BigDecimal getBid() {
        return bid;
    }

    public void setBid(BigDecimal bid) {
        this.bid = bid;
    }
}
