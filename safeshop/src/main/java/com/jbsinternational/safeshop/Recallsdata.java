package com.jbsinternational.safeshop;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.jbsinternational.safeshop.Service.XmlService;

import java.util.List;

public class Recallsdata extends XmlService {

    @JacksonXmlElementWrapper
    @JacksonXmlProperty
    private List<Recall> recalls;

    // empty constructor
    public Recallsdata() {

    }

    public Recallsdata(List<Recall> recalls) {
        this.recalls = recalls;
    }

    // getter for recall list
    public List<Recall> getRecalls() {
        return recalls;
    }

    // setter for recall list
    public void setRecalls(List<Recall> recalls) {
        this.recalls = recalls;
    }

//    @Override
//    public String toString() {
//        return "{" +
//                "recall=" + recalls +
//                "}";
//    }
}
