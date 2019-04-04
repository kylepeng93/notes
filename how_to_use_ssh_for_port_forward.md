假设我们无法直接在本地访问运行在远程机器上的3000端口的服务，通过使用ssh的隧
道技术可以帮助我们实现访问该服务的目的：
ssh admin@server1.example.com -L 8080: server1.example.com:3000
或者，为了进入远程机器的shell，我们可以加上-N参数：
ssh -N admin@server1.example.com -L 8080: server1.example.com:3000
或者，我们加上-f让ssh在后台继续运行：
ssh -f -N admin@server1.example.com -L 8080: server1.example.com:3000
