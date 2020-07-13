package com.org.mx.t3b.serti.dto;

public class SertiPaymentResponse {

    private String idTransaccion;
    private String authnumSale;
    private String orderId;
    private String idTxProveedor;
    private String authnumProveedor;
    private String responseCodeAtena;
    private String responseCodeProveedor;
    private String descriptionCodeProveedor;
    private String receiptId;
    private String saldoCliente;

    @Override
    public String toString() {
        return "SertiPaymentResponse{" + "idTransaccion=" + idTransaccion + ", authnumSale=" + authnumSale + ", orderId=" + orderId + ", idTxProveedor=" + idTxProveedor + ", authnumProveedor=" + authnumProveedor + ", responseCodeAtena=" + responseCodeAtena + ", responseCodeProveedor=" + responseCodeProveedor + ", descriptionCodeProveedor=" + descriptionCodeProveedor + ", receiptId=" + receiptId + ", saldoCliente=" + saldoCliente + '}';
    }

    /**
     * @return the idTransaccion
     */
    public String getIdTransaccion() {
        return idTransaccion;
    }

    /**
     * @param idTransaccion the idTransaccion to set
     */
    public void setIdTransaccion(String idTransaccion) {
        this.idTransaccion = idTransaccion;
    }

    /**
     * @return the authnumSale
     */
    public String getAuthnumSale() {
        return authnumSale;
    }

    /**
     * @param authnumSale the authnumSale to set
     */
    public void setAuthnumSale(String authnumSale) {
        this.authnumSale = authnumSale;
    }

    /**
     * @return the orderId
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * @param orderId the orderId to set
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    /**
     * @return the idTxProveedor
     */
    public String getIdTxProveedor() {
        return idTxProveedor;
    }

    /**
     * @param idTxProveedor the idTxProveedor to set
     */
    public void setIdTxProveedor(String idTxProveedor) {
        this.idTxProveedor = idTxProveedor;
    }

    /**
     * @return the authnumProveedor
     */
    public String getAuthnumProveedor() {
        return authnumProveedor;
    }

    /**
     * @param authnumProveedor the authnumProveedor to set
     */
    public void setAuthnumProveedor(String authnumProveedor) {
        this.authnumProveedor = authnumProveedor;
    }

    /**
     * @return the responseCodeAtena
     */
    public String getResponseCodeAtena() {
        return responseCodeAtena;
    }

    /**
     * @param responseCodeAtena the responseCodeAtena to set
     */
    public void setResponseCodeAtena(String responseCodeAtena) {
        this.responseCodeAtena = responseCodeAtena;
    }

    /**
     * @return the responseCodeProveedor
     */
    public String getResponseCodeProveedor() {
        return responseCodeProveedor;
    }

    /**
     * @param responseCodeProveedor the responseCodeProveedor to set
     */
    public void setResponseCodeProveedor(String responseCodeProveedor) {
        this.responseCodeProveedor = responseCodeProveedor;
    }

    /**
     * @return the descriptionCodeProveedor
     */
    public String getDescriptionCodeProveedor() {
        return descriptionCodeProveedor;
    }

    /**
     * @param descriptionCodeProveedor the descriptionCodeProveedor to set
     */
    public void setDescriptionCodeProveedor(String descriptionCodeProveedor) {
        this.descriptionCodeProveedor = descriptionCodeProveedor;
    }

    /**
     * @return the receiptId
     */
    public String getReceiptId() {
        return receiptId;
    }

    /**
     * @param receiptId the receiptId to set
     */
    public void setReceiptId(String receiptId) {
        this.receiptId = receiptId;
    }

    /**
     * @return the saldoCliente
     */
    public String getSaldoCliente() {
        return saldoCliente;
    }

    /**
     * @param saldoCliente the saldoCliente to set
     */
    public void setSaldoCliente(String saldoCliente) {
        this.saldoCliente = saldoCliente;
    }

}
