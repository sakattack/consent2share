package org.hl7.v3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="BN")
public class BN extends ANYNonNull
{

  @XmlAttribute(name="value")
  protected Boolean value;

  public Boolean isValue()
  {
    return this.value;
  }

  public void setValue(Boolean value)
  {
    this.value = value;
  }
}

