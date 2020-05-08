# mcommerce
Application très basique pour le cours de l'architecture Microservices

https://openclassrooms.com/fr/courses/4668216-optimisez-votre-architecture-microservices/5176135-creez-les-microservices-e-commerce-et-leur-client

## Compilation
```
./compli.sh
```

## Start application in order

| Name      |  Port  | Script | URL
| ------------- | ------------- | ------------- | ------------- | 
| Config | 9101 | _config-server.sh |  | 
| Eureka | 9102 | _eureka-server.sh | http://localhost:9102/ | 
| ZipKin | 9411 | _zipkin-server.sh | http://localhost:9411/zipkin/ | 
| ZUUL | 9004 | _zuul-server.sh |  | 
| Admin | 9105 | _admin-server.sh | http://localhost:9105/ | 
| Produit 1 | 9001 | _mproduit_9001.sh |  | 
| Produit 2 | 9011 | _mproduit_9011.sh |  | 
| Commande | 9002 | _mcommandes.sh |  | 
| Paiement | 9003 | _mpaiement.sh |  | 
| Client UI | 8080 | _clientui.sh | http://localhost:8080/ | 


| Description      |  URL  |
| ------------- | ------------- | 
| Spring Server | http://localhost:9101/microservice-produits/default | 
| Zipkin (repo)  | https://repo1.maven.org/maven2/io/zipkin/java/zipkin-server/2.6.1/zipkin-server-2.6.1-exec.jar | 


| Micro-Service Produit |  URL  |
| ------------- | ------------- | 
| Accès Via ZUUL | http://localhost:9004/microservice-produits/Produits |
| Console H2 | http://localhost:9001/h2-console |
| Actuator | http://localhost:9001/actuator | 
| Health  | http://localhost:9001/actuator/health | 
| Metrics | http://localhost:9001/actuator/metrics | 
| http.server.requests | http://localhost:9001/actuator/metrics/http.server.requests | 
| Beans | http://localhost:9001/actuator/beans | 
| Env | http://localhost:9001/actuator/env | 
| Info | http://localhost:9001/actuator/info | 


### Ordre des Branches 
01. SqueletteClient
02. TestBranch
03. ClientEtMSCommuniquant
04. ExternalisationConfig
05. Eureka
06. Ribbon
07. ZUUL
08. SecurityEtSleuth
09. Zipkin
10. SpringAdmin
11. springadmin




