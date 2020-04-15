# Getting Started
SpringBoot app with Camel routes and Hawtio.<br/>
Tomcat instance running on 8085.

# Rest endpoint
Calling http://localhost:8085/ generates a message that is pushed to a camel route.

# Hawtio
Camel routes are visible at http://localhost:8085/actuator/hawtio/ .

# Docker
docker build -t camel-hawtio .<br/>
docker run -p 8085:8085 -t camel-hawtio

