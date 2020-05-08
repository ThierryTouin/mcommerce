#!/bin/bash

cd microservice-commandes
mvn clean package -Dmaven.test.skip=true
cd ..
cd microservice-paiement
mvn clean package -Dmaven.test.skip=true
cd ..
cd microservice-produits
mvn clean package -Dmaven.test.skip=true
cd ..
cd clientui
mvn clean package -Dmaven.test.skip=true
cd ..
cd config-server
mvn clean package -Dmaven.test.skip=true
cd ..
cd eureka-server
mvn clean package -Dmaven.test.skip=true
cd ..
cd zuul-server
mvn clean package -Dmaven.test.skip=true
cd ..
cd springadmin
mvn clean package -Dmaven.test.skip=true
cd ..



