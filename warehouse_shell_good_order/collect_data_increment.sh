#!/bin/bash
# incremental data collection
# execute once daily @12AM

# default get yesterday's date, if no parameter passed in, use default
if [ "z$1" = "z" ]
then
dt=`date +%Y%m%d --date="1 days ago"`
else
dt=$1
fi

# change date format from 20260201 to 2026-02-01
dt_new=`date +%Y-%m-%d --date="${dt}"`


# SQL query statement
user_order_sql="select order_id,order_date,user_id,order_money,order_type,order_status,pay_id,update_time from user_order where order_date >= '${dt_new} 00:00:00' and order_date <= '${dt_new} 23:59:59'"
order_item_sql="select order_id,goods_id,goods_amount,curr_price,create_time from order_item where create_time >= '${dt_new} 00:00:00' and create_time <= '${dt_new} 23:59:59'"
order_delivery_sql="select order_id,addr_id,user_id,carriage_money,create_time from order_delivery where create_time >= '${dt_new} 00:00:00' and create_time <= '${dt_new} 23:59:59'"
payment_flow_sql="select pay_id,order_id,trade_no,pay_money,pay_type,pay_time from payment_flow where pay_time >= '${dt_new} 00:00:00' and pay_time <= '${dt_new} 23:59:59'"


# hdfs path prefix
path_prefix="hdfs://localhost:9000/data/ods"

# output path
user_order_path="${path_prefix}/user_order/${dt}"
order_item_path="${path_prefix}/order_item/${dt}"
order_delivery_path="${path_prefix}/order_delivery/${dt}"
payment_flow_path="${path_prefix}/payment_flow/${dt}"


# data collection
echo "begin collection..."
echo "collecting table：user_order"
sh sqoop_collect_data_util.sh "${user_order_sql}" "${user_order_path}"
echo "collecting table：order_item"
sh sqoop_collect_data_util.sh "${order_item_sql}" "${order_item_path}"
echo "collecting table：order_delivery"
sh sqoop_collect_data_util.sh "${order_delivery_sql}" "${order_delivery_path}"
echo "collecting table：payment_flow"
sh sqoop_collect_data_util.sh "${payment_flow_sql}" "${payment_flow_path}"
echo "Finished collecting..."

