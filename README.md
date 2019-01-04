# springboot-demo
springboot 基本模板

## 1. 创建工程
创建一个基本的maven工程


## 2. 添加依赖
### 2.1 添加父工程
```
    <parent>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-parent</artifactId>
        <version>2.1.1.RELEASE</version>
    </parent>
```

### 2.2 添加Web启动器
```
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-web</artifactId>
    </dependency>
```

### 2.3 JDK版本
```
    <properties>
        <java.version>1.8</java.version>
    </properties>
```

## 添加启动类
Spring Boot 项目通过main函数启动
```
    @SpringBootApplication()
    public class SpringBootDemoApplication {
        public static void main(String[] args) {
            SpringApplication.run(SpringBootDemoApplication.class, args);
        }
    
    }

```
注意：不能把该文件直接建在根目录下面

