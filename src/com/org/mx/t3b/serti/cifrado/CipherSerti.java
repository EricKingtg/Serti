package com.org.mx.t3b.serti.cifrado;

import com.org.mx.t3b.serti.Test;
import com.org.mx.t3b.serti.constants.Constantes;
import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.Security;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.codec.binary.Hex;
import org.apache.log4j.Logger;
import org.bouncycastle.jce.provider.BouncyCastleProvider;

public class CipherSerti {

    private final static Logger log = Logger.getLogger(Test.class);

    public static void main(String[] args) {
        String json = "{\"idProveedor\":1}";
        CipherSerti cipher = new CipherSerti();
        //System.out.println(cipher.encrypt(cipher.createHash(json)));

    }

    public CipherSerti() {
        Security.addProvider(new BouncyCastleProvider());
    }

    public String createHash(String json) {
        log.info("**********    CipherSerti.createHash --> Inicio  ***************");
        byte[] arrayOfByte = null;
        try {

            MessageDigest messageDigest = MessageDigest.getInstance(Constantes.SHA);
            messageDigest.reset();
            arrayOfByte = messageDigest.digest(json.getBytes());

        } catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            log.info("Algoritmo no encontrado: " + Constantes.SHA + noSuchAlgorithmException);
        }
        log.info("**********    CipherSerti.createHash --> Final  ***************");
        return encode(arrayOfByte);
    }

    public String encrypt(String data, String KEY_FIRMA, String VECTOR_INI_FIRMA) {
        log.info("**********    CipherSerti.encrypt --> Inicio  ***************");
        byte[] output = null;
        try {
            byte[] keyBytes = decode(KEY_FIRMA);
            byte[] input = data.getBytes(Constantes.ENCODING);
            AlgorithmParameterSpec ivSpec = new IvParameterSpec(Hex.decodeHex(VECTOR_INI_FIRMA.toCharArray()));
            SecretKeySpec keySpec = new SecretKeySpec(keyBytes, Constantes.ALGORITMO);
            Cipher cipher = Cipher.getInstance(Constantes.MODE);
            cipher.init(Cipher.ENCRYPT_MODE, keySpec, ivSpec);
            output = cipher.doFinal(input);
        } catch (UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException | DecoderException e) {
            log.info("Error" + e);
        }
        log.info("**********    CipherSerti.encrypt --> Final  ***************");
        return encode(output);
    }

    public String encryptCard(String data, String KEY_DATA, String VECTOR_INI_DATA) {
        log.info("**********    CipherSerti.encrypt --> Inicio  ***************");
        byte[] output = null;
        try {
            byte[] keyBytes = decode(KEY_DATA);
            byte[] input = data.getBytes(Constantes.ENCODING);
            AlgorithmParameterSpec ivSpec = new IvParameterSpec(Hex.decodeHex(VECTOR_INI_DATA.toCharArray()));
            SecretKeySpec keySpec = new SecretKeySpec(keyBytes, Constantes.ALGORITMO);
            Cipher cipher = Cipher.getInstance(Constantes.MODE);
            cipher.init(Cipher.ENCRYPT_MODE, keySpec, ivSpec);
            output = cipher.doFinal(input);
        } catch (UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException | DecoderException e) {
            log.info("Error" + e);
        }
        log.info("**********    CipherSerti.encrypt --> Finao  ***************");
        return encode(output);
    }

    /* INFORMATION ENCODE */
    private String encode(byte[] output) {
        if (Constantes.MODE.equalsIgnoreCase("BASE64")) {
            return Base64.encodeBase64String(output);
        } else {
            return new String(Hex.encodeHex(output));
        }
    }

    private byte[] decode(String data) throws DecoderException {

        return Hex.decodeHex(data.toCharArray());

    }

}
