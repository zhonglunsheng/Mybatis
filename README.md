1、MyBatis  项目配置
----
#### 第一节：environments

MyBatis 支持多个环境，可以任意配置；

#### 第二节：transactionManager

MyBatis 支持两种类型的事务管理器：JDBC 和 MANAGED(托管)；
JDBC：应用程序负责管理数据库连接的生命周期；
MANAGED：由应用服务器负责管理数据库连接的生命周期；(一般商业服务器才有此功能，如
JBOSS,WebLogic)
  
  
#### dataSource
用来配置数据源；类型有：UNPOOLED，POOLED，JNDI；
UNPOOLED，没有连接池，每次数据库操作，MyBatis 都会创建一个新的连接，用完后，关闭；适合小并发
项目；
POOLED，用上了连接池；
JNDI，使用应用服务器配置 JNDI 数据源获取数据库连接；
  
  
#### 第四节：properties

配置属性
  
  
#### 第五节：typeAliases

给类的完成限定名取别名，方便使用；

#### 第六节：mappers

引入映射文件
  
  
#### 第七节：配置 Log4j  日志

  
  
  
  
  
  
2、使用 XML配置 SQL映射器
----

#### 第一节：INSERT  映射语句

  
#### 第二节：UPDATE  映射语句
  
  
#### 第三节：DELETE  映射语句
  
   
#### 第四节：SELECT  映射语句

3、mybatis关系映射
---
  
#### 第一节：一对一关系实现

#### 第二节：一对多关系实现

4、动态sql
---

#### 第一节：if条件
  
#### 第二节：choose,when和otherwise条件

#### 第四节：where条件
  
#### 第五节：trim条件
  
#### 第六节：foreach循环

#### 第七节：set条件
  
5、Mybatis杂项
---
  
#### 第一节：处理 CLOB 、BLOB 
  
#### 第二节：传入多个输入参数
  
#### 第三节：Mybatis 分页
1，逻辑分页；
将读取的数据全部取出放在内存中，然后再分页
2，物理分页；
利用数据库的limit函数
  
#### 第四节：Mybatis 缓存
Mybatis 默认情况下，MyBatis 启用一级缓存，即同一个 SqlSession 接口对象调用了相同的 select 语句，则直
接会从缓存中返回结果，而不是再查询一次数据库；
开发者可以自己配置二级缓存，二级缓存是全局的；
默认情况下，select 使用缓存的，insert update delete 是不使用缓存的；

#### 第七章 使用注解配置 SQL映射器
第一节：基本映射语句
1，@Insert
2，@Update
3，@Delete
4，@Select
  

第二节：结果集映射语句
  

第三节：关系映射
1，一对一映射；
2，一对多映射； 
  
第四节：动态SQL注解
@InsertProvider
@UpdateProvider
@DeleteProvider
@SelectProvider


