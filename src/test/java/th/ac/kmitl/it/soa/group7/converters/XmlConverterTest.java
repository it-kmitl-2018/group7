package th.ac.kmitl.it.soa.group7.converters;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import org.junit.Assert;
import org.junit.Test;

class XmlConverterTest {

    private class Xml {

        @JacksonXmlProperty(localName = "id")
        private int id = 0;

        @JacksonXmlProperty(localName = "name")
        private String name = null;
    }

    private String xml =
            "<Xml>" +
                "<id>0</id>" +
            "</Xml>";

    @Test
    public void shouldGetCorrectXml() {
        XmlConverter xmlConverter = new XmlConverter();

        Assert.assertEquals(xml, xmlConverter.toXml(new Xml()));
    }
}