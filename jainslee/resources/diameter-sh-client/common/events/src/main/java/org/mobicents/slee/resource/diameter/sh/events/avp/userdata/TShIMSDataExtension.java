/*
 * JBoss, Home of Professional Open Source
 *
 * Copyright 2010, Red Hat Middleware LLC, and individual contributors
 * as indicated by the @authors tag. All rights reserved.
 * See the copyright.txt in the distribution for a full listing
 * of individual contributors.
 *
 * This copyrighted material is made available to anyone wishing to use,
 * modify, copy, or redistribute it subject to the terms and conditions
 * of the GNU General Public License, v. 2.0.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License,
 * v. 2.0 along with this distribution; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301, USA.
 */
package org.mobicents.slee.resource.diameter.sh.events.avp.userdata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import net.java.slee.resource.diameter.sh.events.avp.userdata.ShIMSDataExtension;
import net.java.slee.resource.diameter.sh.events.avp.userdata.ShIMSDataExtension2;


/**
 * <p>Java class for tShIMSDataExtension complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tShIMSDataExtension">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PSIActivation" type="{}tPSIActivation" minOccurs="0"/>
 *         &lt;element name="Extension" type="{}tShIMSDataExtension2" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * @author <a href="mailto:brainslog@gmail.com"> Alexandre Mendonca </a>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tShIMSDataExtension", propOrder = {
    "psiActivation",
    "extension"
})
public class TShIMSDataExtension implements ShIMSDataExtension {

    @XmlElement(name = "PSIActivation")
    protected Short psiActivation;
    @XmlElement(name = "Extension")
    protected TShIMSDataExtension2 extension;

    /* (non-Javadoc)
     * @see org.mobicents.slee.resource.diameter.sh.events.avp.userdata.ShIMSDataExtension#getPSIActivation()
     */
    public Short getPSIActivation() {
        return psiActivation;
    }

    /* (non-Javadoc)
     * @see org.mobicents.slee.resource.diameter.sh.events.avp.userdata.ShIMSDataExtension#setPSIActivation(java.lang.Short)
     */
    public void setPSIActivation(Short value) {
        this.psiActivation = value;
    }

    /* (non-Javadoc)
     * @see org.mobicents.slee.resource.diameter.sh.events.avp.userdata.ShIMSDataExtension#getExtension()
     */
    public ShIMSDataExtension2 getExtension() {
        return extension;
    }

    /* (non-Javadoc)
     * @see org.mobicents.slee.resource.diameter.sh.events.avp.userdata.ShIMSDataExtension#setExtension(org.mobicents.slee.resource.diameter.sh.events.avp.userdata.TShIMSDataExtension2)
     */
    public void setExtension(ShIMSDataExtension2 value) {
        this.extension = (TShIMSDataExtension2) value;
    }

}