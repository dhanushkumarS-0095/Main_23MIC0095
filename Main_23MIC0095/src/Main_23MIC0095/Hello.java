Question:
Write down the steps involed in Sonar cube installation, installation of Sonar scanner cli, configure Sonarcube, set up Sonarcube as a system service.

	
	Answer:
1) SonarCube Installation:
Prerequisties:
Step 1: Install PostgreSQL.
sudo apt install -y postgresql-common postgresql -y
Step 2: Enable PostgreSQL to start at boot.
sudo systemctl enable postgresql
Step 3: Start PostgreSQL database server.
sudo systemctl start postgresql
Step 4: Log in as the postgres user.
sudo -u postgres psql
Step 5: Create a new role with a strong password.
CREATE ROLE dhanush WITH LOGIN ENCRYPTED PASSWORD 'dhanush';
Step 6: Create the sonarqube database.
CREATE DATABASE sonarqube;
Step 7: Grant full privileges to the database.
GRANT ALL PRIVILEGES ON DATABASE sonarqube TO dhanush;
Step 8: Switch to the database and grant schema privileges.
\c sonarqube
GRANT ALL PRIVILEGES ON SCHEMA public TO dhanush;
Step 9: Exit the console.
\q
Step 10: Update the server's APT package index.
sudo apt update
Step 11: Install OpenJDK 17.
sudo apt install openjdk-17-jdk -y
Step 12: Install Unzip.
sudo apt install unzip
Step 13: Verify Java version and download SonarQube archive.
java -version
sudo wget https://binaries.sonarsource.com/Distribution/sonarqube/sonarqube-25.2.0.102705.zip
Step 14: Extract files from the downloaded archive.
unzip sonarqube-25.2.0.102705.zip
Step 15: Move the extracted files to /opt.
sudo mv sonarqube-25.2.0.102705/ /opt/sonarqube
Step 16: Create a dedicated system user.
sudo adduser --system --no-create-home --group --disabled-login sonarqube
Step 17: Grant full privileges to the directory.
sudo chown -R sonarqube:sonarqube /opt/sonarqube
2) Install SonarScanner CLI:
Step 1: Download the SonarScanner CLI.
wget https://binaries.sonarsource.com/Distribution/sonar-scanner-cli/sonar-scanner-cli-
7.0.1.4817-linux-x64.zip
Step 2: Extract files from the archive.
unzip sonar-scanner-cli-7.0.1.4817-linux-x64.zip
Step 3: Move the extracted directory to /opt/sonarscanner.
sudo mv sonar-scanner-7.0.1.4817-linux-x64/ /opt/sonarscanner
Step 4: Open the configuration file.
sudo nano /opt/sonarscanner/conf/sonar-scanner.properties
Step 5: Change the host URL and apply execution permissions.
sonar.host.url=127.0.0.1
sudo chmod +x /opt/sonarscanner/bin/sonar-scanner
Step 6: Link the binary to enable it as a system-wide command.
sudo ln -s /opt/sonarscanner/bin/sonar-scanner /usr/local/bin/sonar-scanner
Step 7: View the installed SonarScanner version.
sonar-scanner -v
3) Configure SonarQube:
Step 1: Open the main configuration file.
sudo nano /opt/sonarqube/conf/sonar.properties
Step 2: Add database and web configurations, and open sysctl.conf.
sonar.jdbc.username=dhanush
sonar.jdbc.password=dhanush
sonar.jdbc.url=jdbc:postgresql://localhost:5432/sonarqube
sonar.web.javaAdditionalOpts=-server
sonar.web.host=0.0.0.0
sonar.web.port=9000
sudo nano /etc/sysctl.conf
Step 3: Add directives and open limits file.
vm.max_map_count=524288
fs.file-max=131072
sudo nano /etc/security/limits.d/99-sonarqube.conf
Step 4: Add directives to increase limits, allow port 9000, and setup UFW.
sonarqube nofile 131072
sonarqube nproc 8192
sudo ufw allow 9000/tcp
sudo apt install ufw -y&& sudo ufw allow 22/tcp
Step 5: Reload UFW to apply configurations.
sudo ufw reload
Step 6: View the UFW status.
sudo ufw status
4) Set Up SonarQube as a System Service:
Step-1:
Create a new sonarqube.service file.
sudo nano /etc/systemd/system/sonarqube.service
Step-2:
Add the following configurations to the file. [Unit]
Description=SonarQube service After=syslog.target network.target [Service]
Type=forking
ExecStart=/opt/sonarqube/bin/linux-x86-64/sonar.sh start ExecStop=/opt/sonarqube/bin/linux-x86-64/sonar.sh stop User=sonarqube
Group=sonarqube PermissionsStartOnly=true Restart=always StandardOutput=syslog LimitNOFILE=131072 LimitNPROC=8192
TimeoutStartSec=5
SuccessExitStatus=143 [Install]
WantedBy=multi-user.target sudo systemctl daemon-reload
Step-3:
Enable SonarQube to start at boot. sudo systemctl enable sonarqube
Step-4:
Start the SonarQube service. sudo systemctl start sonarqube
Step-5:
View the SonarQube service status and verify that it's running. sudo systemctl status sonarqube
sudo reboot now.









Question:
write down the steps involved in installing docker on windows and write the docker
commands for the following

ANSWER:
	Steps to Install Docker on Windows
	
Go to the official Docker website: https://www.docker.com
Download Docker Desktop for Windows
Double-click the downloaded .exe file to start installation
Follow the installation wizard instructions
Enable WSL 2 (Windows Subsystem for Linux) when prompted
Restart your system after installation
Open Docker Desktop from the Start Menu
Wait until Docker shows “Docker is running”
Verify installation using command prompt:
docker --version
1.To see the list of docker images in our machine
docker images (or) docker image ls
2.To download an image from docker hub
docker pull image-name
3.To upload an image into dockerhub
docker push image-name
4.To search for an images on docker hub
docker search image-name
5.To delete an image on docker host
docker rmi image-name
6.To create an image from a container
docker commit container-name/container-id image-name
7. To create an image from a dockerfile
docker network inspect network-id/network-name
docker build -t imagename .
8.To see the list of running containers
docker container ls
9.To see the list of stopped and running containers
docker ps -a
10. To start a container
docker start container-name/container-id
11. To stop a container
docker stop container-name/container-id
12.To restart a container
20.To inspect a networkdocker restart container-name/container-id
To restart a container after 10 seconds
docker restart -t 10 container-name/container-id
13.To remove a stopped container
docker rm container-name/container-id
14. To remove a running container
docker rm -f container-name/container-id
15. To stop all the running containers
docker stop $(docker ps -aq)
16. To see the logs generated by the container
docker logs container-name/container-id
17. To see the ports of a container
docker port container-name/container-id
18. To find detailed info about a container
docker logs container-name/container-id
19.creating a docker container
docker run image-nam
20.To inspect a network
docker network inspect network-id/network-name
