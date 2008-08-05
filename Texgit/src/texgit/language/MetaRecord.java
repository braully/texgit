//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.0 in JDK 1.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2008.08.03 at 12:27:56 AM GMT-03:00 
//


package texgit.language;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 						
 * 					<p>
 * 						Uma esp�cie de container de fields numa forma mais simples, usualmente � conhecido como
 * 						Registro ou Bloco.
 * 					</p>
 * 					
 * 					
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MetaRecord", propOrder = {
    "groupOfFields",
    "groupOfInnerRecords"
})
public class MetaRecord {

    @XmlElement(name = "GroupOfFields", required = true)
    protected MetaGroupFields groupOfFields;
    @XmlElement(name = "GroupOfInnerRecords")
    protected MetaGroupRecords groupOfInnerRecords;
    @XmlAttribute
    protected String description;
    @XmlAttribute
    protected String name;
    @XmlAttribute
    protected Boolean repeatable;

    /**
     * Gets the value of the groupOfFields property.
     * 
     * @return
     *     possible object is
     *     {@link MetaGroupFields }
     *     
     */
    public MetaGroupFields getGroupOfFields() {
        return groupOfFields;
    }

    /**
     * Sets the value of the groupOfFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link MetaGroupFields }
     *     
     */
    public void setGroupOfFields(MetaGroupFields value) {
        this.groupOfFields = value;
    }

    /**
     * Gets the value of the groupOfInnerRecords property.
     * 
     * @return
     *     possible object is
     *     {@link MetaGroupRecords }
     *     
     */
    public MetaGroupRecords getGroupOfInnerRecords() {
        return groupOfInnerRecords;
    }

    /**
     * Sets the value of the groupOfInnerRecords property.
     * 
     * @param value
     *     allowed object is
     *     {@link MetaGroupRecords }
     *     
     */
    public void setGroupOfInnerRecords(MetaGroupRecords value) {
        this.groupOfInnerRecords = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the repeatable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isRepeatable() {
        if (repeatable == null) {
            return false;
        } else {
            return repeatable;
        }
    }

    /**
     * Sets the value of the repeatable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRepeatable(Boolean value) {
        this.repeatable = value;
    }

}
