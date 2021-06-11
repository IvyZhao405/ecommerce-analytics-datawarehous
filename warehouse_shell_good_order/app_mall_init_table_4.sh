#!/bin/bash
# requirement 4: Conversion Rate Metrics
# app layer data warehouse table initialization, only needs to run once.

hive -e "
create database if not exists app_mall;

create external table if not exists app_mall.app_user_conver_funnel(
active_num    int,
item_num     int,
order_num    int,
pay_num    int,
active_to_item_ratio    decimal(10,2),
item_to_order_ratio    decimal(10,2),
order_to_pay_ratio    decimal(10,2)
)partitioned by(dt string) 
row format delimited  
fields terminated by '\t'
location 'hdfs://localhost:9000/data/app/user_conver_funnel/';
"

