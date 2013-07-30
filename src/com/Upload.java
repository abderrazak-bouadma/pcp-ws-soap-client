
package com;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour upload complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="upload">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="label" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="subscriberId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="circuitId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dataFileVO" type="{http://sei.ws.fast.cdc.com/}dataFileVO" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "upload", propOrder = {
    "label",
    "comment",
    "subscriberId",
    "circuitId",
    "dataFileVO"
})
public class Upload {

    protected String label;
    protected String comment;
    protected String subscriberId;
    protected String circuitId;
    protected DataFileVO dataFileVO;

    /**
     * Obtient la valeur de la propri�t� label.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabel() {
        return label;
    }

    /**
     * D�finit la valeur de la propri�t� label.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabel(String value) {
        this.label = value;
    }

    /**
     * Obtient la valeur de la propri�t� comment.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComment() {
        return comment;
    }

    /**
     * D�finit la valeur de la propri�t� comment.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComment(String value) {
        this.comment = value;
    }

    /**
     * Obtient la valeur de la propri�t� subscriberId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubscriberId() {
        return subscriberId;
    }

    /**
     * D�finit la valeur de la propri�t� subscriberId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubscriberId(String value) {
        this.subscriberId = value;
    }

    /**
     * Obtient la valeur de la propri�t� circuitId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCircuitId() {
        return circuitId;
    }

    /**
     * D�finit la valeur de la propri�t� circuitId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCircuitId(String value) {
        this.circuitId = value;
    }

    /**
     * Obtient la valeur de la propri�t� dataFileVO.
     * 
     * @return
     *     possible object is
     *     {@link DataFileVO }
     *     
     */
    public DataFileVO getDataFileVO() {
        return dataFileVO;
    }

    /**
     * D�finit la valeur de la propri�t� dataFileVO.
     * 
     * @param value
     *     allowed object is
     *     {@link DataFileVO }
     *     
     */
    public void setDataFileVO(DataFileVO value) {
        this.dataFileVO = value;
    }

}
