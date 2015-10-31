package ru.nullpointer.service;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "ValCurs")
public class CBResponse {

    public static class Valute {

        private String charCode;

        private String value;

        private int nominal;

        public String getCharCode() {
            return charCode;
        }

        @XmlElement(name = "CharCode")
        public void setCharCode(String charCode) {
            this.charCode = charCode;
        }

        public String getValue() {
            return value;
        }

        @XmlElement(name = "Value")
        public void setValue(String value) {
            this.value = value;
        }

        public int getNominal() {
            return nominal;
        }

        @XmlElement(name = "Nominal")
        public void setNominal(int nominal) {
            this.nominal = nominal;
        }
    }

    private List<Valute> valutes;

    public List<Valute> getValutes() {
        return valutes;
    }

    @XmlElement(name = "Valute")
    public void setValutes(List<Valute> valutes) {
        this.valutes = valutes;
    }
}
