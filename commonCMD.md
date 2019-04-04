ls | head -3
将ls列出的文件列表中的前3个文件打印出来。
ls | head -3 | tail -1
将head输出的前3个文件中的最后一个文件打印出来。
ls -l /etc | tail -n +2 | sort
将etc目录中的文件从第二行(第一行是总用量,需要排除在外)开始计数并打印出来，然后进行排序。（最后得到的结果是所有的目录会排在最前面）
ls -l ~ | grep '^.....w'
列出我的家目录中group用户拥有写（write）权限的文件（如果是检查other用户的写权限，则为'^........w'。
Every program you may run on the command line has 3 streams, STDIN, STDOUT and STDERR.
你执行的每个命令都存在3种流，分别是标准输入流（STDIN），标准输出流（STDOUT），标准错误流（STDERR）。
ls -l ~ | egrep '^-'
列出家目录中的文件。(如果要列出文件夹，则使用egrep '^d')
ls -l ~ | egrep -c '^-'
列出家目录中的文件的个数。
ls -l ~ | egrep -c '^d|-'
列出家目录中的所有文件和文件夹的个数。
ls -l ~ | egrep '^-' | awk '{ SUM += $5} END { print SUM/1024/1024 "MB"}'
计算出家目录中所有文件的总容量($5代表了每一行的第5列)
ls -l ~ | tail -n +2 | egrep '^d|-..x' 
列出家目录下所有文件拥有者具有执行权限的文件或者文件夹

