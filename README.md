1、MyBatis  项目配置
====
第一节：environments
----
MyBatis 支持多个环境，可以任意配置；

第二节：transactionManager
----
MyBatis 支持两种类型的事务管理器：JDBC 和 MANAGED(托管)；
JDBC：应用程序负责管理数据库连接的生命周期；
MANAGED：由应用服务器负责管理数据库连接的生命周期；(一般商业服务器才有此功能，如
JBOSS,WebLogic)

第三节：dataSource
----
用来配置数据源；类型有：UNPOOLED，POOLED，JNDI；
UNPOOLED，没有连接池，每次数据库操作，MyBatis 都会创建一个新的连接，用完后，关闭；适合小并发
项目；
POOLED，用上了连接池；
JNDI，使用应用服务器配置 JNDI 数据源获取数据库连接；

第四节：properties
----
配置属性

第五节：typeAliases
----
给类的完成限定名取别名，方便使用；

第六节：mappers
----
引入映射文件

第七节：配置 Log4j  日志
----

2、使用 XML配置 SQL映射器
====

第一节：INSERT  映射语句
----

第二节：UPDATE  映射语句
----

第三节：DELETE  映射语句
----

第四节：SELECT  映射语句
----



