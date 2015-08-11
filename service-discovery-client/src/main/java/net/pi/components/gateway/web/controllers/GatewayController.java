package net.pi.components.gateway.web.controllers;

import net.pi.components.gateway.core.model.BigData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

/**
 * Created by oleg on 17/07/15.
 */
@RestController
@Profile("uat")
@RequestMapping("/data")
public class GatewayController {

    @Autowired
    RestTemplate restTemplate;

    @Value("${test.value}")
    private String testValue;

    @RequestMapping(value = "/{dataID}", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public /*BigData*/ String getDataById(@PathVariable("dataID") String dataID) {

        return testValue + " " + dataID;
//        return restTemplate.getForObject("http://another-client/big-data/" + dataID, BigData.class);
    }

}

