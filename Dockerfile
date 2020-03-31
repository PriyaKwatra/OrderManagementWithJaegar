FROM java:8

COPY target/order-management-0.0.1-SNAPSHOT.jar /etc/nagp/order-management.jar

WORKDIR /etc/nagp

EXPOSE 7000

ENTRYPOINT ["java","-jar","order-management.jar"]
