/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.org.mx.t3b.serti.dto;

/**
 *
 * @author Tiendas3B
 */
public class DtoPayments {

    private String cadholderName; // Cifrar Dato
    private String affiliation;
    private float amount;
    private float tip;
    private long transactionDate;
    private String userId;
    private boolean vta;
    private String phone;
    private int idProducto;
    private int idProveedor;
    private String referencia;

    public DtoPayments(float amount, String phone, int idProducto) {
        this.amount = amount;
        this.phone = phone;
        this.idProducto = idProducto;
    }
    
    public DtoPayments(float amount, int idProducto, String referencia, boolean vta)    {
        this.amount = amount;
        this.referencia = referencia;
        this.idProducto = idProducto;
        this.vta = vta;
    }

    /**
     * @return the affiliation
     */
    public String getAffiliation() {
        return affiliation;
    }

    /**
     * @param affiliation the affiliation to set
     */
    public void setAffiliation(String affiliation) {
        this.affiliation = affiliation;
    }

    /**
     * @return the amount
     */
    public float getAmount() {
        return amount;
    }

    /**
     * @param amount the amount to set
     */
    public void setAmount(float amount) {
        this.amount = amount;
    }

    /**
     * @return the tip
     */
    public float getTip() {
        return tip;
    }

    /**
     * @param tip the tip to set
     */
    public void setTip(float tip) {
        this.tip = tip;
    }

    /**
     * @return the transactionDate
     */
    public long getTransactionDate() {
        return transactionDate;
    }

    /**
     * @param transactionDate the transactionDate to set
     */
    public void setTransactionDate(long transactionDate) {
        this.transactionDate = transactionDate;
    }

    /**
     * @return the userId
     */
    public String getUserId() {
        return userId;
    }

    /**
     * @param userId the userId to set
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * @return the vta
     */
    public boolean isVta() {
        return vta;
    }

    /**
     * @param vta the vta to set
     */
    public void setVta(boolean vta) {
        this.vta = vta;
    }

    /**
     * @return the phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * @param phone the phone to set
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * @return the idProducto
     */
    public int getIdProducto() {
        return idProducto;
    }

    /**
     * @param idProducto the idProducto to set
     */
    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    /**
     * @return the idProveedor
     */
    public int getIdProveedor() {
        return idProveedor;
    }

    /**
     * @param idProveedor the idProveedor to set
     */
    public void setIdProveedor(int idProveedor) {
        this.idProveedor = idProveedor;
    }

    /**
     * @return the referencia
     */
    public String getReferencia() {
        return referencia;
    }

    /**
     * @param referencia the referencia to set
     */
    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    /**
     * @return the cadholderName
     */
    public String getCadholderName() {
        return cadholderName;
    }

    /**
     * @param cadholderName the cadholderName to set
     */
    public void setCadholderName(String cadholderName) {
        this.cadholderName = cadholderName;
    }

}
