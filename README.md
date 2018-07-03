
## 快速开始


### 测试地址

应用启动后访问测试地址

新增一个客户（随机生成）：

http://localhost:8080/test/add 

````
{"errCode":null,"errMessage":null,"success":true}
````

查询客户列表：

http://localhost:8080/test/list 

````
{"errCode":null,"errMessage":null,"total":5,"data":[{"extValues":{},"customerId":"832802","memberId":null,"customerName":null,"customerType":null,"companyName":"杭州XX公司","source":null},{"extValues":{},"customerId":"836874","memberId":null,"customerName":null,"customerType":null,"companyName":"杭州XX公司","source":null},{"extValues":{},"customerId":"838993","memberId":null,"customerName":null,"customerType":null,"companyName":"杭州XX公司","source":null},{"extValues":{},"customerId":"871459","memberId":null,"customerName":null,"customerType":null,"companyName":"杭州XX公司","source":null},{"extValues":{},"customerId":"89538","memberId":null,"customerName":null,"customerType":null,"companyName":"杭州XX公司","source":null}],"success":true}
````

主要工作是在脚手架的基础上，加入web功能和mysql连接