
package br.com.caelum.estoquews.cliente;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for filtros complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="filtros">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="filtro" type="{http://ws.estoque.caelum.com.br/}filtro" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "filtros", propOrder = {
    "filtro"
})
public class Filtros {

    @XmlElement(nillable = true)
    protected List<Filtro> filtro;

    /**
     * Gets the value of the filtro property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the filtro property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFiltro().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Filtro }
     * 
     * 
     */
    public List<Filtro> getFiltro() {
        if (filtro == null) {
            filtro = new ArrayList<Filtro>();
        }
        return this.filtro;
    }

}
