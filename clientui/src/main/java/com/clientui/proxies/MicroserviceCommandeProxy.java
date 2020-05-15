package com.clientui.proxies;

import com.clientui.beans.CommandeBean;
import com.clientui.configuration.FeignConfig;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@FeignClient(contextId = "microservice-commandes",name = "zuul-server")//, configuration = FeignConfig.class)
@RibbonClient(name = "microservice-commandes")
public interface MicroserviceCommandeProxy {

    //@PostMapping(value = "/microservice-commandes/commandes")
    @RequestMapping(value = "/microservice-commandes/commandes", method = RequestMethod.POST)
    CommandeBean ajouterCommande(@RequestBody CommandeBean commande);

    @GetMapping( value = "/microservice-commandes/testmicro/{id}")
    String testMicro(@PathVariable("id") int id);

}


