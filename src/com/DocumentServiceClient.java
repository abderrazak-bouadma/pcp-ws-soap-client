
package com;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import javax.xml.namespace.QName;
import java.net.URL;

/**
 * This class was generated by Apache CXF 2.7.5
 * 2013-07-30T14:19:03.589+02:00
 * Generated source version: 2.7.5
 */
public final class DocumentServiceClient {

    private static final QName SERVICE_NAME = new QName("documentTarget", "CXFDocumentServiceService");

    private DocumentServiceClient() {
    }

    public static void main(String args[]) throws java.lang.Exception {

        URL wsdlURL = CXFDocumentServiceService.WSDL_LOCATION;

        CXFDocumentServiceService ss = new CXFDocumentServiceService(wsdlURL, SERVICE_NAME);
        DocumentService port = ss.getDocumentPort();

        System.out.println("Invoking download...");
        java.lang.String _download_documentId = "9b0fba9b-1111-46a5-892c-1deb9f91e61b";
        com.DocumentContentVO download = port.download(_download_documentId);
        System.out.println("download.result=" + download);

        /*
        System.out.println("Invoking sign...");
        java.lang.String _sign_documentId = "";
        java.lang.String _sign_pin = "";
        boolean _sign__return = port.sign(_sign_documentId, _sign_pin);
        System.out.println("sign.result=" + _sign__return);
        */


        System.exit(0);
    }

}