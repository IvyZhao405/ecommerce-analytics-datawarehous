#!/bin/bash_
# add paritions to ods layer tables, runs once daily.
# runs daily @12AM, add prior day's partitions, once completed, run rest of calculation scripts.

# default yesterday's date, user can passed in date parameter as well

if [ "z$1" = "z" ]
then
dt=`date +%Y%m%d --date="1 days ago"`
else
dt=$1
fi


#alter table ods_mall.ods_user add if not exists partition(dt='20260101') location '20260101';
#alter table ods_mall.ods_user_extend add if not exists partition(dt='20260101') location '20260101';
#alter table ods_mall.ods_user_addr add if not exists partition(dt='20260101') location '20260101';
#alter table ods_mall.ods_goods_info add if not exists partition(dt='20260101') location '20260101';
#alter table ods_mall.ods_category_code add if not exists partition(dt='20260101') location '20260101';
#alter table ods_mall.ods_user_order add if not exists partition(dt='20260101') location '20260101';
#alter table ods_mall.ods_order_item add if not exists partition(dt='20260101') location '20260101';
#alter table ods_mall.ods_order_delivery add if not exists partition(dt='20260101') location '20260101';
#alter table ods_mall.ods_payment_flow add if not exists partition(dt='20260101') location '20260101';

bash add_partition.sh ods_mall.ods_user ${dt} ${dt}
bash add_partition.sh ods_mall.ods_user_extend ${dt} ${dt}
bash add_partition.sh ods_mall.ods_user_addr ${dt} ${dt}
bash add_partition.sh ods_mall.ods_goods_info ${dt} ${dt}
bash add_partition.sh ods_mall.ods_category_code ${dt} ${dt}
bash add_partition.sh ods_mall.ods_user_order ${dt} ${dt}
bash add_partition.sh ods_mall.ods_order_item ${dt} ${dt}
bash add_partition.sh ods_mall.ods_order_delivery ${dt} ${dt}
bash add_partition.sh ods_mall.ods_payment_flow ${dt} ${dt}
