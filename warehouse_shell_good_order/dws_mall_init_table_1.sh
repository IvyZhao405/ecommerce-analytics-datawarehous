#!/bin/bash
# requirement 1： Combined User table
# dws layer data warehouse table initialization, only needs to run once.

hive -e "
create database if not exists dws_mall;

create external table if not exists dws_mall.dws_user_info_all(
user_id              bigint,
user_name            string,
user_gender          tinyint,
user_birthday        string,
e_mail               string,
mobile               string,
register_time        string,
is_blacklist         tinyint,
is_pregnant_woman    tinyint,
is_have_children     tinyint,
is_have_car          tinyint,
phone_brand          string,
phone_cnt            int,
change_phone_cnt     int,
weight               int,
height               int
)partitioned by(dt string) 
row format delimited  
fields terminated by '\t'
location 'hdfs://localhost:9000/data/dws/user_info_all/';
"
