package net.pi.components.gateway.web.controllers;

import net.pi.components.gateway.core.model.BigData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

/**
 * Created by oleg on 17/07/15.
 */
@RestController
@RequestMapping("/")
public class GatewayController {

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping(value = "/{dataID}", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public BigData getDataById(@PathVariable("dataID") String dataID) {

        return restTemplate.getForObject("http://another-client/big-data/" + dataID, BigData.class);
    }

}

