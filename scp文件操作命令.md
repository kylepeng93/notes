scp:用来在两台计算机之间远程传输文件。
常用命令：
scp -P 26526 kyle@linux4fun.com:config.json ~/tmp
表示将远程机器上kyle用户的家目录下的config.json文件复制到本地用户家目录下的tmp目录下。
scp -P 26526 /home/pengkai/shadowsocks.json kyle@linux4fun.com:/home/kyle/
将本地家目录下的文件复制到远程主机linux4fun.com的家目录下。