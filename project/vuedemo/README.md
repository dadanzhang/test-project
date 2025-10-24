# vuedemo

> A Vue.js project

## Build Setup

``` bash
# install dependencies
npm install

# serve with hot reload at localhost:8080
npm run dev

# build for production with minification
npm run build

# build for production and view the bundle analyzer report
npm run build --report

# run unit tests
npm run unit

# run all tests
npm test
```

For a detailed explanation on how things work, check out the [guide](http://vuejs-templates.github.io/webpack/) and [docs for vue-loader](http://vuejs.github.io/vue-loader).

``` bash
# 推荐目录
📁 项目结构建议
确保你的项目结构如下：

text
vuedemo/
├── Dockerfile
├── .dockerignore
├── nginx.conf (可选)
├── package.json
├── src/
└── dist/ (构建后生成)


#如果你是用k8s部署的话
📁 项目结构建议
在项目根目录创建 kubernetes/ 文件夹存放部署配置：

text
vuedemo/
├── kubernetes/
│   ├── deployment.yaml
│   ├── service.yaml
│   └── ingress.yaml (可选)
├── Dockerfile
├── .gitlab-ci.yml
└── package.json

```


.gitlab-ci.yaml 需要修改的配置
``` bash
密钥的话尽量换成变量

HARBOR_REGISTRY 我用的是阿里云的ACR 根据自己的情况修改

build-image: 镜像仓库的密码根据自己情况修改

~/.kube/config   在cat ~/.kube/config查看你自己的集群地址修改

```