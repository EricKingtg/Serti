package com.org.mx.t3b.serti.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.apache.log4j.Logger;

public class Config {

    private final static Logger log = Logger.getLogger(Config.class);

    //public static String rutaConf = "/home/pos3b/programas/tpvserti/config/";
    public static String rutaConf = "C:/Users/Tiendas3B/Documents/NetBeansProjects/SertiPS-TAE/config/";
    public static String archivoprops = "SertiConfig.properties";

    //URLS
    public static String URL_BASE = "";
    //Llaves y vector para HASH
    public static String KEY_FIRMA = "";
    public static String VECTOR_INI_FIRMA = "";
    //Llaves y vector AES
    public static String KEY_DATA = "";
    public static String VECTOR_INI_DATA = "";
    //Todo sobre Usuarios
    public static String MERCHANT = "";
    public static String USUARIO = "";
    public static String AFILIATION = "";
    public static boolean llavesCargadas = false;

    public static void cargaLLaves() {
        llavesCargadas = false;
        try {

            log.info("Ruta Base: " + rutaConf + archivoprops);
            File arch = new File(rutaConf + archivoprops);
            if (arch.exists()) {
                Properties props = new Properties();
                props.load(new FileInputStream(rutaConf + archivoprops));

                URL_BASE = props.getProperty("URL_BASE");
                KEY_FIRMA = props.getProperty("KEY_FIRMA");
                VECTOR_INI_FIRMA = props.getProperty("VECTOR_INI_FIRMA");

                KEY_DATA = props.getProperty("KEY_DATA");
                VECTOR_INI_DATA = props.getProperty("VECTOR_INI_DATA");

                MERCHANT = props.getProperty("MERCHANT");
                USUARIO = props.getProperty("USUARIO");
                AFILIATION = props.getProperty("AFILIATION");

                llavesCargadas = true;
            }
        } catch (IOException ex) {
            log.info("Excepcion al cargar las llaves: " + ex.toString());
            llavesCargadas = false;
        }
    }

}
