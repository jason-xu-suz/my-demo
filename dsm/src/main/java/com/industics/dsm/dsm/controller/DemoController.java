package com.industics.dsm.dsm.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jason.xu
 */
@RestController
@RequestMapping(value = "/api/offer")
public class DemoController {
//    @CrossOrigin("http://localhost:8080")
    @PostMapping(consumes = "application/json", produces = "application/json")
    public DemoRep postOffer(@RequestBody DemoReq demoRequest) {
        System.out.println("====\r\n supplier:" + demoRequest.getSupplier() + "\r\n price" + demoRequest.getPrice());
        return new DemoRep("The price "+demoRequest.getPrice() + " is Ok!");
    }
}
