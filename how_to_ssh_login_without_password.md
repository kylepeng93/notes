1.首先在本地机器上生成一对公钥，使用下面的命令：
	ssh-keygen -t rsa
2.然后在远程主机上的登陆用户家目录下创建.ssh目录：
	ssh b@B mkdir -p .ssh
3.将1中生成的公钥拷贝到远程主机中的指定文件中（authorized_keys）：
	cat .ssh/id_rsa.pub | ssh b@B 'cat >> ./ssh/authorized_keys'
4.重新登陆远程主机，会发现不再需要输入密码了。
