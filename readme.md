## Start a module

- Module Produit
```
mvn clean package -Dmaven.test.skip=true
java -jar ./target/mproduits-0.0.1-SNAPSHOT.jar
```

- Module Client
```
mvn clean package -Dmaven.test.skip=true
java -jar ./target/clientui-0.0.1-SNAPSHOT.jar
```

### Application Accès

http://localhost:8080/