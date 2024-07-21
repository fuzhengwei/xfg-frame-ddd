# 基础镜像
FROM openjdk:8-jre-slim
# 作者
MAINTAINER atsuc
# 配置
ENV PARAMS=""
# 时区
ENV TZ=PRC
RUN ln -snf /usr/share/zoneinfo/$TZ /etc/localtime && echo $TZ > /etc/timezone
# 添加应用
ADD /target/atsuc-frame-app.jar /atsuc-frame-app.jar
## 在镜像运行为容器后执行的命令
ENTRYPOINT ["java", "-Xmx512m", "-javaagent:/Users/fuzhengwei1/Documents/develop/skywalking/skywalking-agent-8-9/skywalking-agent.jar", "-Dskywalking.agent.service_name=xfg-frame", "-Dskywalking.collector.backend_service=10.253.3.8:11800", "-jar", "/xfg-frame-app.jar"]