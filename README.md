# demogng

Competitive learning methods and self-organizing "neural" networks: LBG, LBG-U, Neural Gas, Competitive Hebbian Learning, Growing Neural Gas, Self-organizing Map, Growing Grid, Growing Ring.

![Growing grid](https://raw.githubusercontent.com/deric/demogng/screens/screens/ggf.png?width=600)

![](https://raw.githubusercontent.com/deric/demogng/screens/screens/ggf2.png)
![](https://raw.githubusercontent.com/deric/demogng/screens/screens/gng.png)
![](https://raw.githubusercontent.com/deric/demogng/screens/screens/gng1.png)

## How to run

Compile with Maven and run jar file:
```
  mvn install
  java -jar target/
```

or run directly with Maven:

```
mvn "-Dexec.args=-classpath %classpath cz.cvut.neuralnet.DemoNG" -Dexec.executable=java org.codehaus.mojo:exec-maven-plugin:1.2.1:exec
```

## Links

 See http://www.demogng.de/

## Authors

  * Bernd Fritzke
  * Hartmut S. Loos


