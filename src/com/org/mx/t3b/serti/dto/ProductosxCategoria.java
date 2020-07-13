package com.org.mx.t3b.serti.dto;

import java.util.List;

public class ProductosxCategoria {

    private String responseCode;
    private String description;
    private List<Producto> productos;

    @Override
    public String toString() {
        return "ProductosxCategoria{" + "responseCode=" + responseCode + ", description=" + description + ", productos=" + productos + '}';
    }

    /**
     * @return the responseCode
     */
    public String getResponseCode() {
        return responseCode;
    }

    /**
     * @param responseCode the responseCode to set
     */
    public void setResponseCode(String responseCode) {
        this.responseCode = responseCode;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the productos
     */
    public List<Producto> getProductos() {
        return productos;
    }

    /**
     * @param productos the productos to set
     */
    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

}
