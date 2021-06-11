#!/bin/bash
# requirement 1： Combined User table
# runs daily @12AM

# default to yesterday's date or can pass in desired date.
if [ "z$1" = "z" ]
then
dt=`date +%Y%m%d --date="1 day ago"`
else
dt=$1
fi

hive -e "
insert overwrite table dws_mall.dws_user_info_all partition(dt='${dt}')  select 
du.user_id,
du.user_name,
du.user_gender,
du.user_birthday,
du.e_mail,
du.mobile,
du.register_time,
du.is_blacklist,
due.is_pregnant_woman,
due.is_have_children,
due.is_have_car,
due.phone_brand,
due.phone_cnt,
due.change_phone_cnt,
due.weight,
due.height
from dwd_mall.dwd_user as du
left join dwd_mall.dwd_user_extend as due
on du.user_id = due.user_id
where du.dt = '${dt}' and due.dt = '${dt}';
"
