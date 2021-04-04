create database study default charset utf8;
create user kyle identified by '199393';
grant all privileges on study.* to 'kyle'@'%';


在centos7上使用firewall-cmd追加指定服务端口
sudo firewall-cmd --zone=public --permanent --add-service=mysql