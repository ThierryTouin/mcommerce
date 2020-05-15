package com.clientui.proxies;

import com.clientui.beans.PaiementBean;
import com.clientui.configuration.FeignConfig;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(contextId = "microservice-paiement",name = "zuul-server")//, configuration = FeignConfig.class)
@RibbonClient(name = "microservice-paiement")
public interface MicroservicePaiementProxy {

    @PostMapping(value = "/microservice-paiement/paiement")
    ResponseEntity<PaiementBean> payerUneCommande(@RequestBody PaiementBean paiement);

}
