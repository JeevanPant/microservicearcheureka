package com.eureka.serviceregistry.clientInitialization;


import com.sun.jndi.toolkit.url.Uri;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.net.URI;

@RestController
@RequestMapping("api/v1")
public class ClientResource {
    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private LoadBalancerClient loadBalancer;
    @GetMapping("/printClient")
    public String printClientName(){
        ServiceInstance instance = loadBalancer.choose("SERVER-INITIALIZATION");
        URI uri=instance.getUri();
     return new RestTemplate().getForObject(instance.getUri().toString()+"/api/v1/printserver",String.class);

    }
}
