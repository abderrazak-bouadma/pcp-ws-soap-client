package com;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * This class was generated by Apache CXF 2.7.5
 * 2013-07-30T14:19:03.641+02:00
 * Generated source version: 2.7.5
 * 
 */
@WebServiceClient(name = "CXFDocumentServiceService", 
                  wsdlLocation = "file:/C:/job/Projects/pcp-ws-soap-client/src/com/Documents.wsdl",
                  targetNamespace = "documentTarget") 
public class CXFDocumentServiceService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("documentTarget", "CXFDocumentServiceService");
    public final static QName DocumentPort = new QName("documentTarget", "DocumentPort");
    static {
        URL url = null;
        try {
            url = new URL("file:/C:/job/Projects/pcp-ws-soap-client/src/com/Documents.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(CXFDocumentServiceService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/C:/job/Projects/pcp-ws-soap-client/src/com/Documents.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public CXFDocumentServiceService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public CXFDocumentServiceService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CXFDocumentServiceService() {
        super(WSDL_LOCATION, SERVICE);
    }
    

    /**
     *
     * @return
     *     returns DocumentService
     */
    @WebEndpoint(name = "DocumentPort")
    public DocumentService getDocumentPort() {
        return super.getPort(DocumentPort, DocumentService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns DocumentService
     */
    @WebEndpoint(name = "DocumentPort")
    public DocumentService getDocumentPort(WebServiceFeature... features) {
        return super.getPort(DocumentPort, DocumentService.class, features);
    }

}
