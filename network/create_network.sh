docker network create --driver bridge isolated 
docker network connect isolated mysqlapp
docker network connect isolated javaapp