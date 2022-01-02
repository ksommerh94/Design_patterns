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
My project is a fast food restaurant, that creates meals and each meal is going to be sent to a driver to pick it up and to deliver it.

For this project I used 3 design patterns.
1) Prototype pattern: for creating dynamically the concrete meal
2) Builder pattern: for separating the construction of meal object
3) Observer pattern: for sending notification to all Drivers that a new order is available

# Answers

• What are the design goals in your project?

    The goals of implementing this patterns are to have dynamically in creating the meals depending on the type.
    Having a separate construction of the meal object, and to sent multiple notification to all the deliveries guys/girls.

• How is the flexibility, of your implementation, e.g., how you add or remove in future new
types?

    Flexibility, if I need to create a new type of meal, e.g SeniorsMeal, I only need to include it as a class and include it into the Cashier map.

• How is the simplicity and understandability of your implementation?

    With the help of the UML is easy to follow the code and the implementation of the 3 patterns, moreover the is information on the diagram that helps to understand where are the patterns.

• How you avoided duplicated code?

     I avoid duplicate code by letting each class their own responsibilities.

# Github repository link
https://github.com/ksommerh94/met-cs622-final-project-ksommer
