//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.0 in JDK 1.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2008.08.03 at 12:27:56 AM GMT-03:00 
//


package texgit.language;

import javax.xml.bind.annotation.XmlEnum;


/**
 * 
 * 						
 * 					<p>
 * 						Preenchimentos suportados por padr�o pelo
 * 						componente.
 * 					</p>
 * 					
 * 					
 * 
 * <p>Java class for enumPaddings.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="enumPaddings">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ZERO_RIGHT"/>
 *     &lt;enumeration value="ZERO_LEFT"/>
 *     &lt;enumeration value="WHITE_SPACE_RIGHT"/>
 *     &lt;enumeration value="WHITE_SPACE_LEFT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlEnum
public enum EnumPaddings {

    ZERO_RIGHT,
    ZERO_LEFT,
    WHITE_SPACE_RIGHT,
    WHITE_SPACE_LEFT;

    public String value() {
        return name();
    }

    public static EnumPaddings fromValue(String v) {
        return valueOf(v);
    }

}
