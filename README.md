# mcommerce
Application très basique pour le cours de l'architecture Microservices

https://openclassrooms.com/fr/courses/4668216-optimisez-votre-architecture-microservices/5176135-creez-les-microservices-e-commerce-et-leur-client

## Compilation
```
./compli.sh
```

## Start a module

- Module Config Server
```
mvn clean package -Dmaven.test.skip=true
java -jar target/config-server-0.0.1-SNAPSHOT.jar
```

- Module Eureka Server
```
mvn clean package -Dmaven.test.skip=true
java -jar target/eureka-server-0.0.1-SNAPSHOT.jar
```

- Module ZipKin
```
java -jar zipkin-server-2.6.1-exec.jar
```

- Module ZUUL
```
mvn clean package -Dmaven.test.skip=true
java -jar ./target/zuul-0.0.1-SNAPSHOT.jar
```

- Module Produit
```
mvn clean package -Dmaven.test.skip=true
java -jar ./target/mproduits-0.0.1-SNAPSHOT.jar
```

- Module Commande
```
mvn clean package -Dmaven.test.skip=true
java -jar target/mcommandes-0.0.1-SNAPSHOT.jar
```
- Module Paiement
```
mvn clean package -Dmaven.test.skip=true
java -jar target/mpaiement-0.0.1-SNAPSHOT.jar
```

- Module Client
```
mvn clean package -Dmaven.test.skip=true
java -jar ./target/clientui-0.0.1-SNAPSHOT.jar
```





| Description      |  URL  |
| ------------- | ------------- | 
| Accès application (clintui) | http://localhost:8080/ | 
| Console Eureka  | http://localhost:9102/ | 
| Spring Server | http://localhost:9101/microservice-produits/default | 
| Zipkin  | http://localhost:9411/zipkin/ | 
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




