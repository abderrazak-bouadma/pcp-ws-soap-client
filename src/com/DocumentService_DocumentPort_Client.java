
package com;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import javax.xml.namespace.QName;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * This class was generated by Apache CXF 2.7.5
 * 2013-07-30T14:19:03.589+02:00
 * Generated source version: 2.7.5
 * 
 */
public final class DocumentService_DocumentPort_Client {

    private static final QName SERVICE_NAME = new QName("documentTarget", "CXFDocumentServiceService");

    private DocumentService_DocumentPort_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = CXFDocumentServiceService.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) { 
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
      
        CXFDocumentServiceService ss = new CXFDocumentServiceService(wsdlURL, SERVICE_NAME);
        DocumentService port = ss.getDocumentPort();  
        
        {
        System.out.println("Invoking download...");
        java.lang.String _download_documentId = "9b0fba9b-1111-46a5-892c-1deb9f91e61b";
        com.DocumentContentVO _download__return = port.download(_download_documentId);
        System.out.println("download.result=" + _download__return);


        }
        {
        System.out.println("Invoking uploadMeta...");
        java.lang.String _uploadMeta_documentId = "";
        byte[] _uploadMeta_arg1 = new byte[0];
        java.lang.String _uploadMeta__return = port.uploadMeta(_uploadMeta_documentId, _uploadMeta_arg1);
        System.out.println("uploadMeta.result=" + _uploadMeta__return);


        }
        {
        System.out.println("Invoking upload...");
        java.lang.String _upload_label = "";
        java.lang.String _upload_comment = "";
        java.lang.String _upload_subscriberId = "";
        java.lang.String _upload_circuitId = "";
        com.DataFileVO _upload_dataFileVO = null;
        java.lang.String _upload__return = port.upload(_upload_label, _upload_comment, _upload_subscriberId, _upload_circuitId, _upload_dataFileVO);
        System.out.println("upload.result=" + _upload__return);


        }
        {
        System.out.println("Invoking delete...");
        java.lang.String _delete_documentId = "";
        port.delete(_delete_documentId);


        }
        {
        System.out.println("Invoking sign...");
        java.lang.String _sign_documentId = "";
        java.lang.String _sign_pin = "";
        boolean _sign__return = port.sign(_sign_documentId, _sign_pin);
        System.out.println("sign.result=" + _sign__return);


        }

        System.exit(0);
    }

}
