package com.org.mx.t3b.serti;

import com.org.mx.t3b.serti.connection.ConexionURL;
import com.org.mx.t3b.serti.dto.DtoPayments;
import com.org.mx.t3b.serti.dto.Producto;
import com.org.mx.t3b.serti.dto.ProductosxCategoria;
import com.org.mx.t3b.serti.dto.ResponseServiceServicios;
import com.org.mx.t3b.serti.dto.SertiPaymentResponse;
import com.org.mx.t3b.serti.dto.Servicios;

public class Test {

    public static void main(String[] args) {
        Test t = new Test();
        t.recarga();
    }

    public void recarga() {
        DtoPayments dtoIn = new DtoPayments(Float.valueOf(20), "5524483270", 220);
        SertiPaymentResponse response = Service.sertiPaymentTae(dtoIn);
        System.out.println(response.toString());
    }
    
    public void pds(){
        DtoPayments dtoIn = new DtoPayments(20F, 48, "1515441544", false);
        SertiPaymentResponse response = Service.sertiPaymentPDS(dtoIn);
        System.out.println(response.toString());
    }

    public void testPDS() {

        ConexionURL cnn = new ConexionURL();

        ResponseServiceServicios r = cnn.getServicios("{\"idProveedor\":1,\"idCategoria\":8}", Service.getKeys());

        for (Servicios pro : r.getServicios()) {
            String json = "{\"idProveedor\":1,\"idServicio\":" + pro.getId() + "}";
            ProductosxCategoria per = cnn.getProductos(json, Service.getKeys());

            if (per.getProductos() != null) {
                for (Producto p : per.getProductos()) {
                    System.out.println(pro.getNombre() + " " + p.getDescripcion().replace("$", "") + "," + p.getId() + "," + p.getMonto());
                }
            }

        }

    }

}
