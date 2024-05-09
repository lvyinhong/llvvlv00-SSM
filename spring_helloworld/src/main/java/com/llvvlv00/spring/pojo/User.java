package com.llvvlv00.spring.pojo;

/**
 * @Package com.llvvlv00.spring.pojo
 * @Description TODO
 * @Author llvvlv00
 * @Email llvvlv00@qq.com
 * @Version v1.0.0
 */
public class User {
    private Integer id;
    private String username;
    private Integer age;
    private String sex;

    public User() {
        System.out.println("生命周期1:实例化");
    }

    public Integer getId() {
        System.out.println("生命周期2:依赖注入");
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void initMethod() {
        System.out.println("生命周期3:初始化");
    }

    public void destroyMethod() {
        System.out.println("生命周期4:销毁");
    }
}
