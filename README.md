
# Getting Started
* Start the spring boot application


* Run the following docker commands 

      docker run -p 9090:9090 -v [location of prometheus.yml]:/etc/prometheus/prometheus.yml prom/prometheus

      docker run -d -p 3000:3000 --name=grafana -e "GF_SMTP_ENABLED=true" -e "GF_SMTP_HOST=smtp.gmail.com:587" -e "GF_SMTP_USER=yourmailid@gmail.com" -e "GF_SMTP_PASSWORD=your_smtp_password" grafana/grafana
* Run Grafana in http://localhost:3000/ and provide source for datasource http://192.xxx.xxx.xx:9000/
* Set the Alert matrix and receiver mail in Grafana dashboard. (UI of Grafana will change often so it is better to config by referring documentation)

# Sample output
* Grafana alert when the number of active is > 4.
<img width="476" alt="image" src="https://github.com/kalithass/Microservice-Monitor-App/assets/36320295/6cb8f81e-d3a3-4636-b94f-46e6484acb90">

