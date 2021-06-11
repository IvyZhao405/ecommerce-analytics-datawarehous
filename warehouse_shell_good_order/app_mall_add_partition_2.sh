#!/bin/bash
# requirement 2：Calculate e-Commerce GMV
# runs daily @12AM

# default to yesterday's date or can pass in desired date.
if [ "z$1" = "z" ]
then
dt=`date +%Y%m%d --date="1 day ago"`
else
dt=$1
fi


hive -e "
insert overwrite table app_mall.app_gmv partition(dt='${dt}')  select 
sum(order_money) as gmv
from dwd_mall.dwd_user_order
where dt = '${dt}';
"

