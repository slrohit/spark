# sparkjava
Setting up basic project in sparkjava showing how to organize code as MVC in sparkjava.

Dependencies sparkjava a micro web framework

<dependency>
    <groupId>com.sparkjava</groupId>
    <artifactId>spark-core</artifactId>
    <version>2.3</version>
</dependency>

In Main.java we have all the routes 

All the controllers are in controller folder which extends the base Controller class
corresponding to every Controller class there a folder in templates folder 
which contains all the templates related to Controller

We are using a hashMap as database which act as a in cache database and in public/asset folder we will be having 
all our static assets.
 
For templating we are using Apache velocity templating library.


