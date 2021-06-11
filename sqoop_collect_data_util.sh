#!/bin/bash
#collect data from MySQL and transfer to HDFS
if [ $# != 2 ]
then
echo "Need 2 parameters: sqoop_collect_data_util.sh <sql> <hdfs_path>"
exit 100
fi


#SQL query input
#example: select id,name from user where id>1

sql=$1

#hdfs input path
hdfs_path=$2

sqoop import \
--connect jdbc:mysql://localhost:3306/mall?serverTimeZone=UTC \
--username root \
--password xxxx \
--target-dir "${hdfs_path}" \
--delete-target-dir \
--num-mappers 1 \
--fields-terminated-by "\t" \
--query "${sql}"' and $CONDITIONS;' \
--null-string '\\N' \
--null-non-string '\\N' 
