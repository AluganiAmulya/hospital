FROM openjdk:17
LABEL maintainer="com.springboot.HospitalManagement"
ADD target/HospitalManagement-0.0.1-SNAPSHOT.jar HospitalManagement.jar
ENTRYPOINT ["java","-jar", "HospitalManagement.jar"]