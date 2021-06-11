#!/bin/bash
# requirement 2：Calculate e-Commerce GMV
# app layer data warehouse table initialization, only needs to run once.

hive -e "
create database if not exists app_mall;

create external table if not exists app_mall.app_gmv(
gmv   decimal(10,2) 
)partitioned by(dt string) 
row format delimited  
fields terminated by '\t'
location 'hdfs://localhost:9000/data/app/gmv/';
"

