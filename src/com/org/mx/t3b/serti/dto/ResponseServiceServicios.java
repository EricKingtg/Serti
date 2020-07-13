/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.org.mx.t3b.serti.dto;

import java.util.List;

/**
 *
 * @author Tiendas3B
 */
public class ResponseServiceServicios {
 
    private String responseCode;
    private String description;
    private List<Servicios> servicios;

    @Override
    public String toString() {
        return "ResponseServiceServicios{" + "responseCode=" + responseCode + ", description=" + description + ", servicios=" + servicios + '}';
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
     * @return the servicios
     */
    public List<Servicios> getServicios() {
        return servicios;
    }

    /**
     * @param servicios the servicios to set
     */
    public void setServicios(List<Servicios> servicios) {
        this.servicios = servicios;
    }
    
}
