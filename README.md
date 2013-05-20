HELLO-JAVA-SPRING-NEO4J
====

INTRO
----
this is a simple project i modified to get started with spring data neo4j.
it is basically a copy of this project here by James Ward:  
<http://www.jamesward.com/2012/05/14/graphs-in-the-cloud-spring-neo4j-on-heroku>  
<https://github.com/jamesward/hello-java-spring-neo4j>

i really liked his example, as it got rid of some more complicated things i found in other examples such as aspects and tests. all i have done, is tried to make it generic to run locally on a jetty server so that it is easier to explore and get started with spring data neo4j

this web app will enable you to create and delete 'person' nodes.. (*relationships are not created*)


TO IMPORT INTO ECLIPSE:
----
to download this repository you can

1. click on the github ZIP button and then extract to a folder of your choice 

 OR (by using git)
 * make sure you have git installed
 * git clone this repository onto your local computer from the command line by entering this command:

            git clone https://github.com/rootsical/hello-java-spring-neo4j.git <local name>

     which will clone the project into a folder called `<local name>` in the current directory you are in on the command line

2. make sure you have installed eclipse maven plugin:  
<http://eclipse.org/m2e/download/>

3. then select  
file->import->maven->existing maven projects

4. browse to the location of the downloaded repository

5. the project should now be available in your current eclipse workspace

TO RUN:
----
1. right-click on the project root in eclipse workspace  
select run as->maven build

2. the run configuration dialog should come up
enter:

        jetty:run

 in the goal section

3. click run

TO VIEW THE WEB APP:
----
1. in a web browser of your choice navigate to:  
<http://localhost:8080>

2. click the link to the simple CRUD page to see where it all happens

3. add and delete people to your heart's content.. *(i already added 5 people already to get started..)*  the neo4j database is located in the data directory under the project root
(hello-java-spring-neo4j/data/graph.db/)

TO VIEW YOUR DATABASE IN NEO4J WEB ADMIN INTERFACE:
----
1. make sure you have neo4j installed and configured

2. change the database your neo4j installation points to by changing the
conf/neo4j-server.properties file located in your neo4j installation folder

 on line 10 (or there abouts i guess) change the location to match the location of your project database

	    # location of the database directory 
	    #org.neo4j.server.database.location=data/graph.db
	    org.neo4j.server.database.location=<path-to-your-project>/data/graph.db

 for example:

        org.neo4j.server.database.location=C:/users/me/myproject/hello-java-spring-neo4j/data/graph.db

 *(in this file, the hash symbol '#' denotes a comment and will be ignored)*

3. start the neo4j server

4. navigate to:  
<http://localhost:7474>  
in your web browser and then find the nodes using the data browser and queries of your choice.  the initial nodes already created have id 1 to and including 5.  
*for example, just enter the number 1 in the search box and the node with id=1 should be returned*  
*note that no relationships are defined in this example, only nodes..*