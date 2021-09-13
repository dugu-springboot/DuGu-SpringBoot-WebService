package me.xueyao.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 * @author Simon.Xue
 * @date 2021/9/13 10:35 上午
 **/
@WebService(name = "ServerServiceDemo", targetNamespace = "http://service.webservice.example.com")
public interface ServerServiceDemo {

    @WebMethod
    String emrService(@WebParam String data);
}
