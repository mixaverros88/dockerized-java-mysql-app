# Dockerize java mysql example project

### You can find the mysql dockerfile in the mysql folder.

![preview image](https://raw.githubusercontent.com/mixaverros88/docker_with_java_and_mysql/master/icons/dockerIcon.png)
There you can run the build.sh file in order to build the docker image.
If you want to change the database you can change the ENV in dockerfile or you can remove it from docker file and pass the value at the run stage.
After the build of the image, you can run the image. You can use the run.sh file.
At the run stage you can specify the root pass, and the  ports.

If you want to validate the creation of the database you can connect to the container with the below commands.

``` 
Connect in the running container => docker exec -t my-mysql bash 
log in as a root => mysql -uroot -p
Root credentials => supersecret
Display all the databases => showdatabases;
Use the company database => use company;
Display all the tables of company database => show tables;
Show all the rows of a employees => select * from employees;
```

![preview image](https://raw.githubusercontent.com/mixaverros88/docker_with_java_and_mysql/master/icons/docker_network.png) Create a docker network in order to allow communication between the containers
```
Create network => docker network create --driver bridge isolated 
Add db container into the network => docker network connect isolated db
Add java-connect-with-mysql container into the network => docker network connect isolated java-connect-with-mysql
```
