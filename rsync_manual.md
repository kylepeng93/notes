在本地主机和远程主机之间传输数据：


rsync -azh /local/path/file -e 'ssh -p 22334' user@host.com:/remote/path/file
rsync -azh /home/kyle/seafile/seafile-data -e 'ssh -p 26526' kyle@66.98.123.140:/home/kyle/seafile
rsync -azh /etc/v2ray/config.json -e 'ssh -p 26526' kyle@66.98.123.140:/etc/v2ray/config.json
CREATE DATABASE  CHARACTER SET = 'keybcs2'

sudo firewall-cmd --zone=public --add-port=16823/tcp --permanent
sudo firewall-cmd --reload
sudo firewall-cmd --list-port


ssh kyle@67.230.187.173 -p 26779
ssh kyle@66.98.123.140 -p 26526

--n表示不对主机名进行解析，L表示列出详细信息，v表示列出冗余信息
iptables -nvL INPUT 
--清空所有的过滤规则
iptables -F INPUT

--测试远程主机是否联通
ping 192.168.43.83

--添加过滤规则[t指定表名，I指定链（chain），s指定源主机地址，j指定过滤后执行的动作]
iptables -t filter -I INPUT -s 192.168.43.221 -j DROP
--A表示追加规则
iptables -t filter -A INPUT -s 192.168.43.221 -j ACCEPT

iptables -t filter -I INPUT -s 192.168.43.221 -j ACCEPT
--2指定了这条规则在所有规则中的行位置，这里就是第2行
iptables -t filter -I INPUT 2 -s 192.168.43.221 -j ACCEPT
--删除指定行位置的规则，使用-D来指定删除操作，这里是删除第2条规则
iptables -t filter -D INPUT 2
--删除指定选项内容的规则，这里必须同时指定选项-s和-j
iptables -t filter -D INPUT -s 192.168.43.221 -j DROP
--追加一个REJECT动作的规则
iptables -t filter -I INPUT -s 192.168.43.221 -j REJECT
--指定FORWARD链的默认动作为DROP
iptables -t filter -P FORWARD DROP


sudo systemctl restart nginx
sudo systemctl restart php-fpm