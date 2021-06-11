#!/bin/bash
# load ods layer ad-hoc 28 day data

for((i=1;i<=1;i++))
do
    if [ $i -lt 10 ]
	then
	    dt="2026020"$i
	else
        dt="202602"$i	
	fi
	
	echo "ods_mall_add_partition.sh" ${dt}
	sh ods_mall_add_partition.sh ${dt}
done
