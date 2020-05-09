#!/usr/bin/env bash
# create an network in order to enable communication between containers throu out container name
docker network create --driver bridge isolated 
docker network connect isolated mysqlapp
docker network connect isolated javaapp