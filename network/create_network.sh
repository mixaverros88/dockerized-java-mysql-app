docker network create --driver bridge isolated 
docker network connect isolated db
docker network connect isolated java-connect-with-mysql