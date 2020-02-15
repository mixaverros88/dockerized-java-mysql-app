# run the docker
docker run  -d --name javaapp -p 80:8080 mixaverross88/dockerize_java_mysql_example_project
# docker run  -d --name javaapp -p 80:8080 -v /$(pwd):/usr/local/tomcat/webapps mixaverross88/dockerize_java_mysql_example_project
# you can reach this service through docker machine ip, also add the demorest folder to the path
# to find docker-machine ip execute the following command
# docker-machine ls
# example URL http://192.168.99.100/demorest/