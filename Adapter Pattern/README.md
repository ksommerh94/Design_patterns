# Project Template

This is a Java Maven Project Template


# How to compile the project




```bash
mvn clean compile
```



```bash
mvn clean compile assembly:single
```


# How to run

```bash
mvn -q clean compile exec:java -Dexec.executable="edu.bu.met.cs665.Main" -Dlog4j.configuration="file:log4j.properties"
```

We recommand the above command for running the project.

Alternativly, you can run the following command. It will generate a single jar file with all of the dependencies.

```bash
mvn clean compile assembly:single

java -Dlog4j.configuration=file:log4j.properties -classpath ./target/JavaProjectTemplate-1.0-SNAPSHOT-jar-with-dependencies.jar  edu.bu.met.cs665.Main
```


# Run all the unit test classes.


```bash
mvn clean compile test

```

# Using Findbugs

To see bug detail using the Findbugs GUI, use the following command "mvn findbugs:gui"

Or you can create a XML report by using  


```bash
mvn findbugs:gui
```

or


```bash
mvn findbugs:findbugs
```


For more info about FindBugs see

http://findbugs.sourceforge.net/

And about Maven Findbug plugin see
https://gleclaire.github.io/findbugs-maven-plugin/index.html


You can install Findbugs Eclipse Plugin

http://findbugs.sourceforge.net/manual/eclipse.html



SpotBugs https://spotbugs.github.io/ is the spiritual successor of FindBugs.


# Run Checkstyle

CheckStyle code styling configuration files are in config/ directory. Maven checkstyle plugin is set to use google code style.
You can change it to other styles like sun checkstyle.

To analyze this example using CheckStyle run

```bash
mvn checkstyle:check
```

This will generate a report in XML format


```bash
target/checkstyle-checker.xml
target/checkstyle-result.xml
```

and the following command will generate a report in HTML format that you can open it using a Web browser.

```bash
mvn checkstyle:checkstyle
```

```bash
target/site/checkstyle.html
```


# Generate  coveralls:report

```bash
mvn -DrepoToken=YOUR-REPO-TOCKEN-ON-COVERALLS  cobertura:cobertura coveralls:report
```

# Assumptions
I used the adapter pattern because I needed to convert the interface of a class into another interface that the client
expected to have, and the interfaces did not match.

# Answers

??? How is the flexibility, of your implementation, e.g., how you add or remove in future new
types?

    The client keeps using the program as they were doing before. So the change is only inside for adapting the old code to the new one.

??? How is the simplicity and understandability of your implementation?

    With the help of the UML (there are highlighted the methods that were used in for the adapter pattern). Is easy to follow the code and the implementation of the adapter pattern.

??? How you avoided duplicated code?

     I avoided duplicated code by letting the adapter pattern "adapt and call" the required methods without disturbing the other implementations.

# Github repository link
https://github.com/metcs/met-cs665-assignment-4-ksommerh94
