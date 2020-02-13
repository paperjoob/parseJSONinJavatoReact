package com.jbsinternational.safeshop.Service;

import com.jbsinternational.safeshop.Recall;
import com.jbsinternational.safeshop.Recallsdata;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.util.ArrayList;
import java.util.List;

@Service
public class XmlService {

    private final Logger logger = LoggerFactory.getLogger(XmlService.class);

    public XmlService parseRecallsdata() {
        Recallsdata recallsdata = null;

        try {
            // 2019
            String URL = "https://www.fda.gov/media/124800/download";

            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document doc = builder.parse(URL);

            doc.getDocumentElement().normalize();

            recallsdata = new Recallsdata();

            NodeList nodeList = doc.getElementsByTagName("recall");

            // create an empty list for recall
            List<Recall> recalls = new ArrayList<>();

            // lop through all available recall nodes
            for (int i = 0; i < nodeList.getLength(); i++) {
                Node node = nodeList.item(i);

                if(node.getNodeType() == Node.ELEMENT_NODE) {
                    Element elem = (Element) node;
                    Recall recall = new Recall(elem.getElementsByTagName("Brand").item(0).getTextContent(),
                            elem.getElementsByTagName("Company").item(0).getTextContent(),
                            elem.getElementsByTagName("Date").item(0).getTextContent(),
                            elem.getElementsByTagName("ProductDescription").item(0).getTextContent(),
                            elem.getElementsByTagName("Reason").item(0).getTextContent(),
                            elem.getElementsByTagName("Url").item(0).getTextContent()
                    );
                    recalls.add(recall);
                }
            }
            // set recalls into recallsdata
            recallsdata.setRecalls(recalls);

        } catch (Exception e) {
            logger.error(e.getMessage());
        }

        // return the recalls list
        return recallsdata;

    }
}
