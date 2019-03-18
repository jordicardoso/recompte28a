
# Camel Router Project for Blueprint (OSGi)

To build this project use

```
$ mvn install
```

To run the project you can execute the following Maven goal

```
$ mvn camel:run
```

To deploy the project in OSGi. For example using Apache ServiceMix or Apache Karaf. You can run the following command from its shell:

```
$ osgi:install -s mvn:cat.tcr.eleccions21d/simulador21d/0.0.1-SNAPSHOT
```

For more help see the Apache Camel documentation:

[http://camel.apache.org/]


# Execució de goals de maven 


```
$ mvn clean install -DskipTests=true
```
		
	

```
$ mvn clean test
```


```
$ mvn clean install -DskipITs=true
```
	
	
```	
$ mvn clean install
``` 
		
**Nota: També s'executen préviament els Tests Unitaris**


