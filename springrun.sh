#!/bin/bash


find ./ -name $1 -type d|awk '{print "cd " $1  ";mvn spring-boot:run"}'


