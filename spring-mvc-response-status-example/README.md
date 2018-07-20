# 说明

## 简介
此示例说明了@ResponseStatus的三种用法  



## @ResponseStatus的三种用法  
* 可以用于异常类
* 可以用于标记有@Controller的类
* 可以用于标记有@Controller类下的@RequestMapping方法



##用于异常类

```java
@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR, reason = "服务器内部错误")
public class MyException extends Exception{
   
}

```

```java
@RequestMapping("/exception")
@Controller
public class ExceptionController {

    @RequestMapping("/myException")
    @ResponseBody
    public String myException() throws MyException {
        throw new MyException();
    }
}
```
此时访问页面的会返回如下：
![错误页面](internal.png)

##用于标记有@Controller的类
```java
@RequestMapping("/exception2")
@Controller
@ResponseStatus(value = HttpStatus.FORBIDDEN, reason = "forbidden")
public class ExceptionController2 {

    @ResponseBody
    @RequestMapping("/my01")
    public String my01() {
        return "my01";
    }

    @ResponseBody
    @RequestMapping("/my02")
    public String my02() {
        return "my02";
    }
}

```
此时访问相应的链接会返回如下错误页面：
![错误页面](forbidden.png)


## 用于标记有@Controller类下的@RequestMapping方法

```java
@RequestMapping("/exception")
@Controller
public class ExceptionController {



    @RequestMapping("/myException02")
    @ResponseBody
    @ResponseStatus(value = HttpStatus.BAD_GATEWAY, reason = "bad gateway")
    public String myException02() {
        return "myException02";
    }
}
```
此时访问相应的链接会返回如下错误页面：
![错误页面](badgateway.png)


## 注意事项
标记有@ReponseStatus注解的方法不能抛出异常，否则此注解会失效。

如
```java
@RequestMapping("/exception")
@Controller
public class ExceptionController {


    @RequestMapping("/myException03")
    @ResponseBody
    @ResponseStatus(value = HttpStatus.BAD_GATEWAY, reason = "bad gateway")
    public String myException03() throws Exception {
        throw new Exception("myException03");
    }
}
```
此时访问相就的链接，不会返回期待的错误页面而是
![错误页面](exception.png)