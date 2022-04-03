FROM java:8
MAINTAINER  jiaxing
ADD users-spring-boot-0.0.1-SNAPSHOT.jar users-spring.jar

EXPOSE 5088
# 执行命令，此处运行admin-sprint.jar
RUN bash -c 'touch /users-spring.jar'
ENTRYPOINT ["java","-jar","users-spring.jar"]