基于IDEA的入门练习java web工程

# basic-train
>
##1.  first-web
一个包含servlet, filter, jsp的例子
##2. form-test
用来测试表单get,post提交，并通过getParameter，getParameterValues，getParameterNames分别获取request参数的例子
##3. error-test
一个用来处理servlet异常的例子
##4. JSP-Lifecycle
一个用来测试jsp生命周期的例子
##5. JSP-grammar
一个用来练习JSP语法的例子
##6. JDBC-test
一个用来操作数据库的简单例子
##7. maven-jdbc-test
通过maven来引入mysql-connector-java
##8. jdbc-demo
一个比较完整的jdbc操作的例子

# dubbo
>dubbo示例
首先建立一个java maven快速工程（非web工程），通过maven脚本引用dubbo，然后分别实现生产者
和消费者。分别实现了 zookeeper 和 multicast 方式注册中心，要想采用某一个方式，屏蔽相应的
注册方式即可。
注意：
1、建立快速maven工程可能会卡死，可以关闭IDEA后，再打开
2、运行程序时，可能会报找不到xml文件，可以先用maven package一下，再运行

# RPC
>来自极客学院的RPC例子

# spring
>该目录用来做一些spring的测试


# spring-springMVC-mybatis
>一个综合例子，通过http://localhost:8080/项目名/user/showUser?id=1来访问

# zookeeper
>来自极客学院的RPC用zookeeper实现的例子