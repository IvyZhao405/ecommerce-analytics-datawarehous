#!/bin/bash
# create partitions for external tables
# receive 3 parameters
#1: table name
#2: partition key dt value: 20260101
#3: parition path


if [ $# != 3 ]
then
echo "parameter error: add_partition.sh <table_name> <dt> <path>"
exit 100
fi

table_name=$1
dt=$2
path=$3

hive -e "
alter table ${table_name} add  if not exists partition(dt='${dt}') location '${path}';
"
