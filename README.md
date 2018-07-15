
## 快速开始


### 测试地址

应用启动后访问测试地址

新增一个客户（随机生成）：

http://localhost:8080/customer/add 

````
{"errCode":null,"errMessage":null,"success":true}
````

查询客户列表：

http://localhost:8080/customer/list 

````
{"errCode":null,"errMessage":null,"total":5,"data":[{"extValues":{},"customerId":"832802","memberId":null,"customerName":null,"customerType":null,"companyName":"杭州XX公司","source":null},{"extValues":{},"customerId":"836874","memberId":null,"customerName":null,"customerType":null,"companyName":"杭州XX公司","source":null},{"extValues":{},"customerId":"838993","memberId":null,"customerName":null,"customerType":null,"companyName":"杭州XX公司","source":null},{"extValues":{},"customerId":"871459","memberId":null,"customerName":null,"customerType":null,"companyName":"杭州XX公司","source":null},{"extValues":{},"customerId":"89538","memberId":null,"customerName":null,"customerType":null,"companyName":"杭州XX公司","source":null}],"success":true}
````

主要工作是在脚手架的基础上，加入web功能和mysql连接

```shell
crm-sales-app
│   └── src
│       └── main
│           └── java
│               └── cn
│                   └── springcloud
│                       └── book
│                           └── crm
│                               └── sales
│                                   ├── assembler //防腐层
│                                   ├── command  // 放Command
│                                   │   ├── extension //扩展点实现
│                                   │   ├── extensionpoint //扩展点
│                                   │   └── query // 放Query
│                                   ├── event   // event事件
│                                   │   └── handler
│                                   ├── interceptor //基于Halo框架的Pre和Post拦截器
│                                   ├── service
│                                   └── validator  //校验
│                                       ├── extension //校验扩展点实现
│                                       └── extensionpoint //校验扩展点
```

```shell
crm-sales-domain
│   └── src
│       └── main
│           ├── java
│           │   └── cn
│           │       └── springcloud
│           │           └── book
│           │               └── crm
│           │                   └── sales
│           │                       └── domain
│           │                           └── customer
│           │                               ├── convertor //转换器
│           │                               │   ├── extension  //扩展点实现
│           │                               │   └── extensionpoint //扩展点
│           │                               ├── entity  //领域聚合
│           │                               ├── factory //创建领域实体的工厂
│           │                               ├── repository //持久化领域对象和Tunnel层交互
│           │                               ├── rule  //业务规则
│           │                               │   ├── extension // 业务规则扩展点实现
│           │                               │   └── extensionpoint //业务规则扩展点
│           │                               └── valueobject  //值对象
```
```shell
├── crm-sales-client
│   └── src
│       └── main
│           └── java
│               └── cn
│                   └── springcloud
│                       └── book
│                           └── crm
│                               └── sales
│                                   ├── api  //二方包接口
│                                   └── dto  //对应领域驱动框架中的Command对象
│                                       └── clientobject 客户端对象CO
```
