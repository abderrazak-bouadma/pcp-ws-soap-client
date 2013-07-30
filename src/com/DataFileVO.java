
package com;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour dataFileVO complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="dataFileVO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dataHandler" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="filename" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dataFileVO", propOrder = {
    "dataHandler",
    "filename"
})
public class DataFileVO {

    protected byte[] dataHandler;
    protected String filename;

    /**
     * Obtient la valeur de la propri�t� dataHandler.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getDataHandler() {
        return dataHandler;
    }

    /**
     * D�finit la valeur de la propri�t� dataHandler.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setDataHandler(byte[] value) {
        this.dataHandler = value;
    }

    /**
     * Obtient la valeur de la propri�t� filename.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilename() {
        return filename;
    }

    /**
     * D�finit la valeur de la propri�t� filename.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilename(String value) {
        this.filename = value;
    }

}
