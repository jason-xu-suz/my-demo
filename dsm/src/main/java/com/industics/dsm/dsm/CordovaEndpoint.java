///*
// * Copyright (c) 2017 Industics Co., Ltd.
// *
// * Licensed under the Apache License, Version 2.0 (the "License");
// * you may not use this file except in compliance with the License.
// * You may obtain a copy of the License at
// *
// *      http://www.apache.org/licenses/LICENSE-2.0
// *
// * Unless required by applicable law or agreed to in writing, software
// * distributed under the License is distributed on an "AS IS" BASIS,
// * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// * See the License for the specific language governing permissions and
// * limitations under the License.
// */
//
//package com.industics.dsm.dsm;
//
//
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import static com.industics.isword.common.Constants.MediaType.APPLICATION_JSON_DEFAULT;
//
///**
// * @author jason.xu
// */
//@RestController
//@RequestMapping(value = "api/offer")
//public class CordovaEndpoint extends AbstractEndpoint {
//
//    private static final Logger LOGGER = LoggerFactory.getLogger(CordovaEndpoint.class);
//
//    @PostMapping()
//    public DemoRep postOffer(@RequestBody DemoReq demoRequest) {
//        LOGGER.debug("\r\n ====\r\n supplier:" + demoRequest.getSupplier() + "\r\n price" + demoRequest.getPrice());
//        return new DemoRep("OK");
//    }
//}
