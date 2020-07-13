package com.org.mx.t3b.serti;

import com.org.mx.t3b.serti.connection.ConexionURL;
import com.org.mx.t3b.serti.dto.DtoPayments;
import com.org.mx.t3b.serti.dto.KeysApi;
import com.org.mx.t3b.serti.dto.SertiPaymentResponse;
import com.org.mx.t3b.serti.util.Config;
import org.apache.log4j.Logger;

public class Service {

    private final static Logger log = Logger.getLogger(Service.class);

    public static SertiPaymentResponse sertiPaymentTae(DtoPayments dto) {
        log.info("**********    Service.sertiPaymentTae --> Inicio  ***************");
        ConexionURL cnn = new ConexionURL();
        KeysApi keys = getKeys();
        log.info(keys.toString());
        dto.setVta(true);
        SertiPaymentResponse response = cnn.ventaPayment(dto, keys);
        log.info("**********    Service.sertiPaymentTae --> Final  ***************");
        return response;
    }

    public static SertiPaymentResponse sertiPaymentPDS(DtoPayments dto) {
        log.info("**********    Service.sertiPaymentTae --> Inicio  ***************");
        ConexionURL cnn = new ConexionURL();
        KeysApi keys = getKeys();
        SertiPaymentResponse response = cnn.ventaPayment(dto, keys);
        log.info("**********    Service.sertiPaymentTae --> Final  ***************");
        return response;
    }

    public static KeysApi getKeys() {

        if (!Config.llavesCargadas) {
            Config.cargaLLaves();
        }

        KeysApi keys = new KeysApi(Config.URL_BASE, Config.KEY_FIRMA, Config.VECTOR_INI_FIRMA,
                Config.KEY_DATA, Config.VECTOR_INI_DATA, Config.MERCHANT, Config.USUARIO,
                Config.AFILIATION);

        return keys;
    }
}
