package com.org.mx.t3b.serti.dto;

public class KeysApi {

    private String URL_BASE;

    public KeysApi(String URL_BASE, String KEY_FIRMA, String VECTOR_INI_FIRMA, String KEY_DATA, String VECTOR_INI_DATA, String MERCHANT, String USUARIO, String AFILIATION) {
        this.URL_BASE = URL_BASE;
        this.KEY_FIRMA = KEY_FIRMA;
        this.VECTOR_INI_FIRMA = VECTOR_INI_FIRMA;
        this.KEY_DATA = KEY_DATA;
        this.VECTOR_INI_DATA = VECTOR_INI_DATA;
        this.MERCHANT = MERCHANT;
        this.USUARIO = USUARIO;
        this.AFILIATION = AFILIATION;
    }

    @Override
    public String toString() {
        return "KeysApi{" + "URL_BASE=" + URL_BASE + ", KEY_FIRMA=" + KEY_FIRMA + ", VECTOR_INI_FIRMA=" + VECTOR_INI_FIRMA + ", KEY_DATA=" + KEY_DATA + ", VECTOR_INI_DATA=" + VECTOR_INI_DATA + ", MERCHANT=" + MERCHANT + ", USUARIO=" + USUARIO + ", AFILIATION=" + AFILIATION + '}';
    }
    
    
    
    //Llaves y vector para HASH
    private String KEY_FIRMA;
    private String VECTOR_INI_FIRMA;

    //Llaves y vector AES
    private String KEY_DATA;
    private String VECTOR_INI_DATA;
    
    //Todo sobre Usuarios
    private String MERCHANT;
    private String USUARIO;
    private String AFILIATION;

    /**
     * @return the URL_BASE
     */
    public String getURL_BASE() {
        return URL_BASE;
    }

    /**
     * @param URL_BASE the URL_BASE to set
     */
    public void setURL_BASE(String URL_BASE) {
        this.URL_BASE = URL_BASE;
    }

    /**
     * @return the KEY_FIRMA
     */
    public String getKEY_FIRMA() {
        return KEY_FIRMA;
    }

    /**
     * @param KEY_FIRMA the KEY_FIRMA to set
     */
    public void setKEY_FIRMA(String KEY_FIRMA) {
        this.KEY_FIRMA = KEY_FIRMA;
    }

    /**
     * @return the VECTOR_INI_FIRMA
     */
    public String getVECTOR_INI_FIRMA() {
        return VECTOR_INI_FIRMA;
    }

    /**
     * @param VECTOR_INI_FIRMA the VECTOR_INI_FIRMA to set
     */
    public void setVECTOR_INI_FIRMA(String VECTOR_INI_FIRMA) {
        this.VECTOR_INI_FIRMA = VECTOR_INI_FIRMA;
    }

    /**
     * @return the KEY_DATA
     */
    public String getKEY_DATA() {
        return KEY_DATA;
    }

    /**
     * @param KEY_DATA the KEY_DATA to set
     */
    public void setKEY_DATA(String KEY_DATA) {
        this.KEY_DATA = KEY_DATA;
    }

    /**
     * @return the VECTOR_INI_DATA
     */
    public String getVECTOR_INI_DATA() {
        return VECTOR_INI_DATA;
    }

    /**
     * @param VECTOR_INI_DATA the VECTOR_INI_DATA to set
     */
    public void setVECTOR_INI_DATA(String VECTOR_INI_DATA) {
        this.VECTOR_INI_DATA = VECTOR_INI_DATA;
    }

    /**
     * @return the MERCHANT
     */
    public String getMERCHANT() {
        return MERCHANT;
    }

    /**
     * @param MERCHANT the MERCHANT to set
     */
    public void setMERCHANT(String MERCHANT) {
        this.MERCHANT = MERCHANT;
    }

    /**
     * @return the USUARIO
     */
    public String getUSUARIO() {
        return USUARIO;
    }

    /**
     * @param USUARIO the USUARIO to set
     */
    public void setUSUARIO(String USUARIO) {
        this.USUARIO = USUARIO;
    }

    /**
     * @return the AFILIATION
     */
    public String getAFILIATION() {
        return AFILIATION;
    }

    /**
     * @param AFILIATION the AFILIATION to set
     */
    public void setAFILIATION(String AFILIATION) {
        this.AFILIATION = AFILIATION;
    }

}
