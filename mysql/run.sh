#!/usr/bin/env bash
docker run -d -p 3311:3306 --name mysqlapp -e MYSQL_ROOT_PASSWORD=supersecret mixaverross88/dockerize_java_mysql_example_project_mysql