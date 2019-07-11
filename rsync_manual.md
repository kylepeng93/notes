在本地主机和远程主机之间传输数据：
CREATE DATABASE  CHARACTER SET = 'keybcs2'

sudo firewall-cmd --zone=public --add-port=8001/tcp --permanent
sudo firewall-cmd --reload
sudo firewall-cmd --list-port