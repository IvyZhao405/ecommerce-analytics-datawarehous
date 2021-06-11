#!/bin/bash
# requirement 3: Product Related Metrics
# app layer data warehouse table initialization, only needs to run once.

hive -e "
create database if not exists app_mall;

create external table if not exists app_mall.app_goods_sales_item(
goods_name    string,
first_category_name     string,
order_total    bigint,
price_total    decimal(10,2)
)partitioned by(dt string) 
row format delimited  
fields terminated by '\t'
location 'hdfs://localhost:9000/data/app/goods_sales_item/';


create external table if not exists app_mall.app_category_top10(
first_category_name     string,
order_total    bigint
)partitioned by(dt string) 
row format delimited  
fields terminated by '\t'
location 'hdfs://localhost:9000/data/app/category_top10/';

"

