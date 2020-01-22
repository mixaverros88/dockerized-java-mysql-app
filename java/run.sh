filepath=$PWD
cd $filepath
mkdir deploy
cd deploy
# Download the war from gihub
curl -LOk https://github.com/mixaverros88/docker_with_java_and_mysql/raw/master/java/target/RESTfulExample.war
# run the docker
winpty docker run -it -p 80:8080 -v /$(pwd):/usr/local/tomcat/webapps java-connect-with-mysql
# you can reach this service through docker machine ip, also add the demorest folder to the path
# to find docker-machine ip execute the following command
# docker-machine ls
# example URL http://192.168.99.100/demorest/