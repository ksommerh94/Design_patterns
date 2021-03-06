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
We recommand the above command for running the project.

Alternativly, you can run the following command. It will generate a single jar file with all of the dependencies.
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
# Using Findbugs

To see bug detail using the Findbugs GUI, use the following command "mvn findbugs:gui"

Or you can create a XML report by using  


```bash
mvn findbugs:gui
mvn findbugs:gui
```

or
or


```bash
mvn findbugs:findbugs
```


For more info about FindBugs see
For more info about FindBugs see

http://findbugs.sourceforge.net/

And about Maven Findbug plugin see
And about Maven Findbug plugin see
https://gleclaire.github.io/findbugs-maven-plugin/index.html


You can install Findbugs Eclipse Plugin
You can install Findbugs Eclipse Plugin

http://findbugs.sourceforge.net/manual/eclipse.html



SpotBugs https://spotbugs.github.io/ is the spiritual successor of FindBugs.


# Run Checkstyle
# Run Checkstyle

CheckStyle code styling configuration files are in config/ directory. Maven checkstyle plugin is set to use google code style.
You can change it to other styles like sun checkstyle.
CheckStyle code styling configuration files are in config/ directory. Maven checkstyle plugin is set to use google code style.
You can change it to other styles like sun checkstyle.

To analyze this example using CheckStyle run
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
and the following command will generate a report in HTML format that you can open it using a Web browser.

```bash
mvn checkstyle:checkstyle
```

```bash
target/site/checkstyle.html
```


# Generate  coveralls:report
# Generate  coveralls:report

```bash
mvn -DrepoToken=YOUR-REPO-TOCKEN-ON-COVERALLS  cobertura:cobertura coveralls:report
```

# Generate  coveralls:report
>>>>>>> Stashed changes


```bash
mvn -DrepoToken=YOUR-REPO-TOCKEN-ON-COVERALLS  cobertura:cobertura coveralls:report
```
# Assumptions
I used the observer pattern because I needed to send push notifications to many subjects when the state of the shop changes.

# Answers
??? How is the flexibility, of your implementation, e.g., how you add or remove in future new
types?
    It doesn't matter how many drivers I want to send the push notification, I don't have to make big changes in the code.

??? How is the simplicity and understandability of your implementation?
    With the help of the UML and the observer pattern. It is possible to understand how the code works.

??? How you avoided duplicated code?
     I avoided duplicated code by unifying the objects that had the same behavior. And by using the observer pattern

# Github repository link
https://github.com/metcs/met-cs665-assignment-2-ksommerh94
