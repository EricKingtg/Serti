package com.org.mx.t3b.serti.dto;

public class Producto {

    private int id;
    private String descripcion;
    private float monto;
    private boolean telefono;
    private boolean referencia;

    @Override
    public String toString() {
        return "Producto{" + "id=" + id + ", descripcion=" + descripcion + ", monto=" + monto + ", telefono=" + telefono + ", referencia=" + referencia + '}';
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @return the monto
     */
    public float getMonto() {
        return monto;
    }

    /**
     * @param monto the monto to set
     */
    public void setMonto(float monto) {
        this.monto = monto;
    }

    /**
     * @return the telefono
     */
    public boolean isTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(boolean telefono) {
        this.telefono = telefono;
    }

    /**
     * @return the referencia
     */
    public boolean isReferencia() {
        return referencia;
    }

    /**
     * @param referencia the referencia to set
     */
    public void setReferencia(boolean referencia) {
        this.referencia = referencia;
    }

}
