# javademo

.gitlab-ci.yaml 需要修改的配置
``` bash
密钥的话尽量换成变量

HARBOR_REGISTRY 我用的是阿里云的ACR 根据自己的情况修改

build-image: 镜像仓库的密码根据自己情况修改

~/.kube/config   在cat ~/.kube/config查看你自己的集群地址修改

```

## 验证访问
部署完成后，您可以访问：

主页: http://IP:Port/ - 现在应该看到美观的界面

Hello API: http://IP:Port/api/hello - 返回 JSON 数据

状态 API: http://IP:Port/api/status - 返回应用状态

信息 API: http://IP:Port/api/info - 返回应用信息

![alt text](image.png)