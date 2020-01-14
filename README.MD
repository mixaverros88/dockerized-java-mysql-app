# Dockerize java mysql example project

### You can find the mysql dockerfile in the mysql folder.

![preview image](https://raw.githubusercontent.com/mixaverros88/docker_with_java_and_mysql/master/icons/dockerIcon.png)
There you can run the build.sh file in order to build the docker image.
If you want to change the database you can change the ENV in dockerfile or you can remove it from docke file and pass the value in the run stage.
After the build of the image, you can run the image. You can use the run.sh file.
At the run stage you can specify the root pass, and the  ports.

If you want to validate the creation of the database you can connect to the container with the below commands.

``` 
docker exec -t my-mysql bash 
mysql -uroot -p
supersecret
showdatabases;
use company;
show tables;
select * from employees;
