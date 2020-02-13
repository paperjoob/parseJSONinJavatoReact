package com.jbsinternational.safeshop;

import com.jbsinternational.safeshop.Service.XmlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class RecallsController {

    @Autowired
    private XmlService xmlService;

    @GetMapping(value = "/safe", produces = MediaType.APPLICATION_JSON_VALUE)
    public XmlService recalljson() {
        return xmlService.parseRecallsdata();
    }

}
