/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.org.mx.t3b.serti.connection;

import com.google.gson.Gson;
import com.org.mx.t3b.serti.cifrado.CipherSerti;
import com.org.mx.t3b.serti.constants.Constantes;
import com.org.mx.t3b.serti.constants.HeaderEnum;
import com.org.mx.t3b.serti.dto.DtoPayments;
import com.org.mx.t3b.serti.dto.KeysApi;
import com.org.mx.t3b.serti.dto.ProductosxCategoria;
import com.org.mx.t3b.serti.dto.ResponseServiceServicios;
import com.org.mx.t3b.serti.dto.SertiPaymentResponse;
import com.org.mx.t3b.serti.util.Utilities;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;
import org.apache.log4j.Logger;

public class ConexionURL {

    private final static Logger log = Logger.getLogger(ConexionURL.class);

    public ProductosxCategoria getProductos(String json, KeysApi key) {

        String tkn = key.getMERCHANT() + "_";
        CipherSerti cipher = new CipherSerti();
        tkn = tkn + cipher.encrypt(cipher.createHash(json), key.getKEY_FIRMA(), key.getVECTOR_INI_FIRMA());
        Gson gson = new Gson();
        ProductosxCategoria response = null;

        try {
            URL url = new URL(key.getURL_BASE() + Constantes.URL_PRODUCTOS);
            HttpURLConnection http = (HttpURLConnection) url.openConnection();
            http.setRequestMethod(Constantes.HTTP_METHOD);
            http.setRequestProperty(HeaderEnum.ACCEPT.getName(), HeaderEnum.ACCEPT.getValue());
            http.setRequestProperty(HeaderEnum.CONTENT.getName(), HeaderEnum.CONTENT.getValue());
            http.setRequestProperty(HeaderEnum.TOKEN.getName(), tkn);
            http.setDoOutput(true);
            DataOutputStream wr = new DataOutputStream(http.getOutputStream());
            wr.writeBytes(json);
            wr.flush();
            wr.close();

            if (http.getResponseCode() >= 200 && http.getResponseCode() < 300) {

                BufferedReader reader = new BufferedReader(new InputStreamReader(http.getInputStream()));
                response = (ProductosxCategoria) gson.fromJson(reader, ProductosxCategoria.class);

            } else {
                BufferedReader in = new BufferedReader(new InputStreamReader(http.getInputStream()));
                String inputLine;
                while ((inputLine = in.readLine()) != null) {
                    log.info(inputLine);
                }
                in.close();
            }

        } catch (MalformedURLException ex) {
            log.info("Ocurrio un error con la URL: " + ex.getMessage());
        } catch (IOException ex) {
            log.info("Ocurrio un error con la URL: " + ex.getMessage());
        }
        return response;
    }

    public ResponseServiceServicios getServicios(String json, KeysApi key) {
        String tkn = key.getMERCHANT() + "_";
        CipherSerti cipher = new CipherSerti();
        tkn = tkn + cipher.encrypt(cipher.createHash(json), key.getKEY_FIRMA(), key.getVECTOR_INI_FIRMA());
        Gson gson = new Gson();
        ResponseServiceServicios response = null;

        try {
            URL url = new URL(key.getURL_BASE() + Constantes.URL_SERVICIOS);
            HttpsURLConnection http = (HttpsURLConnection) url.openConnection();
            http.setRequestMethod(Constantes.HTTP_METHOD);
            http.setRequestProperty(HeaderEnum.ACCEPT.getName(), HeaderEnum.ACCEPT.getValue());
            http.setRequestProperty(HeaderEnum.CONTENT.getName(), HeaderEnum.CONTENT.getValue());
            http.setRequestProperty(HeaderEnum.TOKEN.getName(), tkn);
            http.setDoOutput(true);
            DataOutputStream wr = new DataOutputStream(http.getOutputStream());
            wr.writeBytes(json);
            wr.flush();
            wr.close();

            if (http.getResponseCode() >= 200 && http.getResponseCode() < 300) {

                BufferedReader reader = new BufferedReader(new InputStreamReader(http.getInputStream()));
                response = (ResponseServiceServicios) gson.fromJson(reader, ResponseServiceServicios.class);

            } else {
                BufferedReader in = new BufferedReader(new InputStreamReader(http.getInputStream()));
                String inputLine;
                while ((inputLine = in.readLine()) != null) {
                    log.info(inputLine);
                }
                in.close();
            }

        } catch (MalformedURLException ex) {
            log.info("Ocurrio un error con la URL: " + ex.getMessage());
        } catch (IOException ex) {
            log.info("Ocurrio un error con la URL: " + ex.getMessage());
        }
        return response;
    }

    public SertiPaymentResponse ventaPayment(DtoPayments dto, KeysApi key) {
        log.info("**********    ConexionURL.getProducts --> Inicio  ***************");

        CipherSerti cipher = new CipherSerti();
        SertiPaymentResponse response = new SertiPaymentResponse();

        dto.setAffiliation(key.getAFILIATION());
        dto.setTransactionDate(Utilities.getFechaEpoch());
        dto.setUserId(key.getUSUARIO());
        dto.setIdProveedor(Constantes.IDPROVEE);
        dto.setTip(Constantes.PROPINA);

        Gson gson = new Gson();
        String json = gson.toJson(dto);
        String tkn = key.getMERCHANT() + "_";
        tkn = tkn + cipher.encrypt(cipher.createHash(json), key.getKEY_FIRMA(), key.getVECTOR_INI_FIRMA());

        try {
            URL url = new URL(key.getURL_BASE() + Constantes.URL_CASH);
            log.info(key.getURL_BASE() + Constantes.URL_CASH);
            HttpURLConnection http = (HttpURLConnection) url.openConnection();
            http.setRequestMethod(Constantes.HTTP_METHOD);
            http.setRequestProperty(HeaderEnum.ACCEPT.getName(), HeaderEnum.ACCEPT.getValue());
            http.setRequestProperty(HeaderEnum.CONTENT.getName(), HeaderEnum.CONTENT.getValue());
            http.setRequestProperty(HeaderEnum.TOKEN.getName(), tkn);

            log.info(tkn);
            http.setDoOutput(true);
            DataOutputStream wr = new DataOutputStream(http.getOutputStream());
            log.info("La peticion se crea con la siguiente informacion: " + json);
            wr.writeBytes(json);
            wr.flush();
            wr.close();

            log.info("Obteniendo Repuesta");
            if (http.getResponseCode() == 200) {

                BufferedReader reader = new BufferedReader(new InputStreamReader(http.getInputStream()));
                response = (SertiPaymentResponse) gson.fromJson(reader, SertiPaymentResponse.class);
            }
            if (http.getResponseCode() != 200) {
                BufferedReader in = new BufferedReader(new InputStreamReader(http.getErrorStream()));
                String inputLine;
                while ((inputLine = in.readLine()) != null) {
                    log.info(inputLine);
                }
                in.close();
            }

        } catch (MalformedURLException ex) {
            log.info("Ocurrio un error con la URL: " + ex.getMessage());
        } catch (IOException ex) {
            log.info("Ocurrio un error con la URL: " + ex.getMessage());
        }
        log.info("**********    ConexionURL.getProducts --> Final  ***************");
        return response;
    }

}
