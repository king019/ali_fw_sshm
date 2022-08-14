#!/bin/bash
if [ $1 == 'nexus' ] ; then
  echo 'nexus'
  sed -i -e 's/https/http/g' /root/.m2/settings.xml
  sed -i -e 's/maven.aliyun.com/smp:8081/g' /root/.m2/settings.xml
  sed -i -e 's/nexus\/content\/groups/repository/g' /root/.m2/settings.xml
  sed -i -e 's/public/maven-public/g' /root/.m2/settings.xml
fi


mvn clean package -DskipTests=true
mvn install -DskipTests=true


