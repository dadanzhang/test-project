# 使用Nginx镜像
FROM registry.cn-shanghai.aliyuncs.com/wql-k8s/nginx:alpine

# 将构建好的静态文件复制到Nginx的默认目录
COPY dist /usr/share/nginx/html

# 复制自定义 Nginx 配置（可选）
COPY nginx.conf /etc/nginx/conf.d/default.conf

# 暴露80端口
EXPOSE 80

# 不需要CMD，因为基础镜像已经定义了启动Nginx的命令
