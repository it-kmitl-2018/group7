package th.ac.kmitl.it.soa.group7.converters;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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

        assertEquals(xml, xmlConverter.toXml(new Xml()));
    }
}