CONTAINER_NAME=demowhite-frame
IMAGE_NAME=demowhite/demowhite-frame-app:1.3
PORT=8090

echo "容器部署开始 ${CONTAINER_NAME}"

# 停止容器
docker stop ${CONTAINER_NAME}

# 删除容器
docker rm ${CONTAINER_NAME}

# 启动容器 skywalking-agent 下载：https://archive.apache.org/dist/skywalking/java-agent/8.9.0/apache-skywalking-java-agent-8.9.0.tgz
docker run --name ${CONTAINER_NAME} \
-p ${PORT}:${PORT} \
-v /Users/fuzhengwei1/Documents/develop/skywalking/skywalking-agent-8-9/:/Users/fuzhengwei1/Documents/develop/skywalking/skywalking-agent-8-9/ \
-d ${IMAGE_NAME}

echo "容器部署成功 ${CONTAINER_NAME}"

docker logs -f ${CONTAINER_NAME}