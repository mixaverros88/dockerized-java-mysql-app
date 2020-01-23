# Dockerize java mysql example project

This simple example combines 2 docker files, one to spin up a mysql container and the other a java container.

These docker files are located in the corresponding folders ( mysql, java).

Also you can find a network folder, which contains instructions to create a network in order to allow the communication between the containers throughout containers names.

### You can find the mysql dockerfile in the mysql folder.

![preview image](https://raw.githubusercontent.com/mixaverros88/docker_with_java_and_mysql/master/icons/dockerIcon.png)
There you can run the build.sh file in order to build the docker image.
If you want to change the database you can change the ENV in dockerfile or you can remove it from docker file and pass the value at the run stage.

After the build of the image, you can run the image. You can use the run.sh file.
At the run stage you can specify the root pass, and the  ports.
Or you can run the below command
```
docker run -d -p 3306:3306 --name mysqlapp -e MYSQL_ROOT_PASSWORD=supersecret my-mysql
```

If you want to validate the creation of the database you can connect to the container with the below commands.

Connect in the running container 
* docker exec -t my-mysql bash 

log in as a root
* mysql -uroot -p

Root credentials
* supersecret

Display all the databases
* showdatabases;

Use the company database
* use company;

Display all the tables of company database 
* show tables;

Show all the rows of a employees 
* select * from employees;

If the results are the following.

The process is correct.

![preview image](https://raw.githubusercontent.com/mixaverros88/docker_with_java_and_mysql/master/icons/docker_network.png) Create a docker network in order to allow communication between the containers

* Create network => docker network create --driver bridge isolated 
* Add db container into the network => docker network connect isolated db
* Add java-connect-with-mysql container into the network => docker network connect isolated java-connect-with-mysql

Create secrets 
* echo "my-db-pass" | docker secret create mysql_root_pass -
