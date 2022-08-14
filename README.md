#fw_sshm


mkdir -p /opt/soft/version/
cd /opt/soft/version/
git clone https://gitee.com/king019/ali_fw_sshm.git

sh ali_fw_sshm/springrun.sh webmvc






find ./ -name webmvc -type d|awk '{print "cd " $1  ";spring-boot:run"}'