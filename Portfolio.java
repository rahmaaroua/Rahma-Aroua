package com.wellsfargo.counselor.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Portfolio {

    @Id
    @GeneratedValue()
    private long portfolioId;

    @Column(nullable = false)
    private long clientId;



    @Column(nullable = false)
    private Date creationDate;

    protected Portfolio() {

    }

    public Portfolio(long clientId, Date creationDate) {
        this.clientId =clientId ;
        this.creationDate =creationDate ;
    }

    public long getClientId() {
        return clientId;
    }

    public void setClientId(long clientId) {
        this.clientId = clientId;
    }

    public long getPortfolioId() {
        return portfolioId;
    }

    public Date getCreationDate() {
        return creationDate;
    }
}