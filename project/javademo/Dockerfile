# Dockerfile for Java application (JDK 21)
FROM swr.cn-north-4.myhuaweicloud.com/ddn-k8s/docker.io/openjdk:21-jdk-slim

# 设置工作目录
WORKDIR /app

# 复制 JAR 文件到容器中
COPY target/*.jar app.jar

# 暴露端口（根据您的应用端口修改）
EXPOSE 8080

# 设置 JVM 参数
ENV JAVA_OPTS=""

# 启动应用
ENTRYPOINT ["sh", "-c", "java $JAVA_OPTS -jar app.jar"]