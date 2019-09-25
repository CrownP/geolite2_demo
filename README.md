# geolite2_demo
GeoLite2的Java实现，Jar包部署可用

# 一、需求

通过输入一个IP地址，解析并获取信息，比如国家、国家代码、省份、省份代码、城市、邮政编码、经纬度等等信息

例如，解析ip（128.101.101.101）的信息如下：

![img](https://img-blog.csdnimg.cn/20190925094245809.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L0Nyb3duUA==,size_16,color_FFFFFF,t_70)



# 二、实现形式

**使用在线第三方提供的api：**

- ip-api.com
- ip.taotao.com
- 百度地图api
- 新浪 iplookup

**使用离线查询方式：**

- 纯真库
- GeoLite2
- 埃文科技



**数据丰富度对比：**

![img](https://img-blog.csdnimg.cn/20190925095729296.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L0Nyb3duUA==,size_16,color_FFFFFF,t_70)



**查询准确率比较：**

![img](https://img-blog.csdnimg.cn/20190925095852922.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L0Nyb3duUA==,size_16,color_FFFFFF,t_70)



**查询速度比较：**

![img](https://img-blog.csdnimg.cn/20190925095958344.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L0Nyb3duUA==,size_16,color_FFFFFF,t_70)



**总结：       需要速度用离线，需要准确率用在线，需要数据丰富性GeoLite2、埃文科技，需要免费用GeoLite2（埃文科技虽说国内头头，奈何收费）**



# 三、Java使用GeoLite2教程

## 1、官网下载离线的IP数据文件：GeoLite2-City.mmdb

https://dev.maxmind.com/geoip/geoip2/geolite2/

![img](https://img-blog.csdnimg.cn/20190925102003184.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L0Nyb3duUA==,size_16,color_FFFFFF,t_70)

**下载City的mmdb数据文件，较于其他两者信息更丰富。**

**这三种离线数据包都是免费的，相对应的也有收费版本 Geo-IP2，提供更准确更详细的信息，如果需要解析获取IPS则需要用到收费版本，如下，提供了7种不同的离线数据文件：**

![img](https://img-blog.csdnimg.cn/20190925102238821.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L0Nyb3duUA==,size_16,color_FFFFFF,t_70)



## 2、使用参照收费版的geo-ip2文档说明

**提供了多种语言使用，**https://dev.maxmind.com/geoip/geoip2/downloadable/#MaxMind_APIs

![img](https://img-blog.csdnimg.cn/20190925102506706.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L0Nyb3duUA==,size_16,color_FFFFFF,t_70)



## 3、Java使用GeoLite2教程

**添加maven依赖**

```
<!-- GeoLite2依赖 -->
<dependency>
    <groupId>com.maxmind.geoip2</groupId>
    <artifactId>geoip2</artifactId>
    <version>2.12.0</version>
</dependency>
```

**具体请查看代码，已加上充分注释！**







