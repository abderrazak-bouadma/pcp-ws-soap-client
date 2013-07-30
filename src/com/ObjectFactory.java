
package com;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _UploadMetaResponse_QNAME = new QName("http://sei.ws.fast.cdc.com/", "uploadMetaResponse");
    private final static QName _Delete_QNAME = new QName("http://sei.ws.fast.cdc.com/", "delete");
    private final static QName _DownloadResponse_QNAME = new QName("http://sei.ws.fast.cdc.com/", "downloadResponse");
    private final static QName _UploadResponse_QNAME = new QName("http://sei.ws.fast.cdc.com/", "uploadResponse");
    private final static QName _Download_QNAME = new QName("http://sei.ws.fast.cdc.com/", "download");
    private final static QName _Upload_QNAME = new QName("http://sei.ws.fast.cdc.com/", "upload");
    private final static QName _UploadMeta_QNAME = new QName("http://sei.ws.fast.cdc.com/", "uploadMeta");
    private final static QName _DeleteResponse_QNAME = new QName("http://sei.ws.fast.cdc.com/", "deleteResponse");
    private final static QName _Sign_QNAME = new QName("http://sei.ws.fast.cdc.com/", "sign");
    private final static QName _DocumentContentVO_QNAME = new QName("http://sei.ws.fast.cdc.com/", "DocumentContentVO");
    private final static QName _SignResponse_QNAME = new QName("http://sei.ws.fast.cdc.com/", "signResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Sign }
     * 
     */
    public Sign createSign() {
        return new Sign();
    }

    /**
     * Create an instance of {@link DeleteResponse }
     * 
     */
    public DeleteResponse createDeleteResponse() {
        return new DeleteResponse();
    }

    /**
     * Create an instance of {@link UploadMeta }
     * 
     */
    public UploadMeta createUploadMeta() {
        return new UploadMeta();
    }

    /**
     * Create an instance of {@link SignResponse }
     * 
     */
    public SignResponse createSignResponse() {
        return new SignResponse();
    }

    /**
     * Create an instance of {@link DocumentContentVO }
     * 
     */
    public DocumentContentVO createDocumentContentVO() {
        return new DocumentContentVO();
    }

    /**
     * Create an instance of {@link Delete }
     * 
     */
    public Delete createDelete() {
        return new Delete();
    }

    /**
     * Create an instance of {@link UploadMetaResponse }
     * 
     */
    public UploadMetaResponse createUploadMetaResponse() {
        return new UploadMetaResponse();
    }

    /**
     * Create an instance of {@link Download }
     * 
     */
    public Download createDownload() {
        return new Download();
    }

    /**
     * Create an instance of {@link UploadResponse }
     * 
     */
    public UploadResponse createUploadResponse() {
        return new UploadResponse();
    }

    /**
     * Create an instance of {@link DownloadResponse }
     * 
     */
    public DownloadResponse createDownloadResponse() {
        return new DownloadResponse();
    }

    /**
     * Create an instance of {@link Upload }
     * 
     */
    public Upload createUpload() {
        return new Upload();
    }

    /**
     * Create an instance of {@link DataFileVO }
     * 
     */
    public DataFileVO createDataFileVO() {
        return new DataFileVO();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UploadMetaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sei.ws.fast.cdc.com/", name = "uploadMetaResponse")
    public JAXBElement<UploadMetaResponse> createUploadMetaResponse(UploadMetaResponse value) {
        return new JAXBElement<UploadMetaResponse>(_UploadMetaResponse_QNAME, UploadMetaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Delete }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sei.ws.fast.cdc.com/", name = "delete")
    public JAXBElement<Delete> createDelete(Delete value) {
        return new JAXBElement<Delete>(_Delete_QNAME, Delete.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DownloadResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sei.ws.fast.cdc.com/", name = "downloadResponse")
    public JAXBElement<DownloadResponse> createDownloadResponse(DownloadResponse value) {
        return new JAXBElement<DownloadResponse>(_DownloadResponse_QNAME, DownloadResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UploadResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sei.ws.fast.cdc.com/", name = "uploadResponse")
    public JAXBElement<UploadResponse> createUploadResponse(UploadResponse value) {
        return new JAXBElement<UploadResponse>(_UploadResponse_QNAME, UploadResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Download }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sei.ws.fast.cdc.com/", name = "download")
    public JAXBElement<Download> createDownload(Download value) {
        return new JAXBElement<Download>(_Download_QNAME, Download.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Upload }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sei.ws.fast.cdc.com/", name = "upload")
    public JAXBElement<Upload> createUpload(Upload value) {
        return new JAXBElement<Upload>(_Upload_QNAME, Upload.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UploadMeta }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sei.ws.fast.cdc.com/", name = "uploadMeta")
    public JAXBElement<UploadMeta> createUploadMeta(UploadMeta value) {
        return new JAXBElement<UploadMeta>(_UploadMeta_QNAME, UploadMeta.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sei.ws.fast.cdc.com/", name = "deleteResponse")
    public JAXBElement<DeleteResponse> createDeleteResponse(DeleteResponse value) {
        return new JAXBElement<DeleteResponse>(_DeleteResponse_QNAME, DeleteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Sign }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sei.ws.fast.cdc.com/", name = "sign")
    public JAXBElement<Sign> createSign(Sign value) {
        return new JAXBElement<Sign>(_Sign_QNAME, Sign.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentContentVO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sei.ws.fast.cdc.com/", name = "DocumentContentVO")
    public JAXBElement<DocumentContentVO> createDocumentContentVO(DocumentContentVO value) {
        return new JAXBElement<DocumentContentVO>(_DocumentContentVO_QNAME, DocumentContentVO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SignResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sei.ws.fast.cdc.com/", name = "signResponse")
    public JAXBElement<SignResponse> createSignResponse(SignResponse value) {
        return new JAXBElement<SignResponse>(_SignResponse_QNAME, SignResponse.class, null, value);
    }

}
