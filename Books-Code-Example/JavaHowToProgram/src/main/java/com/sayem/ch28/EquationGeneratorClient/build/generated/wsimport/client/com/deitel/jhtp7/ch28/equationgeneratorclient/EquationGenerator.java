
package com.sayem.ch28.EquationGeneratorClient.build.generated.wsimport.client.com.deitel.jhtp7.ch28.equationgeneratorclient;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAXWS SI.
 * JAX-WS RI 2.0_01-b59-fcs
 * Generated source version: 2.0
 * 
 */
@WebService(name = "EquationGenerator", targetNamespace = "http://equationgenerator.ch28.jhtp7.deitel.com/")
public interface EquationGenerator {


    /**
     * 
     * @param operation
     * @param difficulty
     * @return
     *     returns com.deitel.jhtp7.ch28.equationgeneratorclient.Equation
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "generateEquation", targetNamespace = "http://equationgenerator.ch28.jhtp7.deitel.com/", className = "com.deitel.jhtp7.ch28.equationgeneratorclient.GenerateEquation")
    @ResponseWrapper(localName = "generateEquationResponse", targetNamespace = "http://equationgenerator.ch28.jhtp7.deitel.com/", className = "com.deitel.jhtp7.ch28.equationgeneratorclient.GenerateEquationResponse")
    public Equation generateEquation(
        @WebParam(name = "operation", targetNamespace = "")
        String operation,
        @WebParam(name = "difficulty", targetNamespace = "")
        int difficulty);

}
