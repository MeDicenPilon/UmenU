package com.rejuntadosdeinge.umenu.modelo;


import java.util.HashMap;
import java.util.Map;

/*
    RequestPackage, tiene trés campos
        uri: dirección donde se encuentran los datos
        method : default con "GET" para la consulta
        params: Map<String, String>, almacena los parámetros de la consulta POST
*/
public class RequestPackage {

    private String uri;
    private String method = "GET";
    private Map<String, String> params = new HashMap<String, String>();

    public String getUri() {
        return uri;
    }
    public void setUri(String uri) {
        this.uri = uri;
    }
    public String getMethod() {
        return method;
    }
    public void setMethod(String method) {
        this.method = method;
    }
    public Map<String, String> getParams() {
        return params;
    }
    public void setParams(Map<String, String> params) {
        this.params = params;
    }

    public void setParam(String key, String value) {
        params.put(key, value);
    }

    // me permite recuperar los parametros en un string codificado
    public String getEncodedParams() {
        StringBuilder sb = new StringBuilder();
        for (String key : params.keySet()) {
            String value = null;

            if (sb.length() > 0) {
                sb.append("&");
            }
            sb.append(key + "=" + value);
        }
        return sb.toString();
    }
}