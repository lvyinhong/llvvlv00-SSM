package com.llvvlv00.spring.pojo;

import java.util.List;

/**
 * @Package com.llvvlv00.spring.pojo
 * @Description TODO
 * @Author llvvlv00
 * @Email llvvlv00@qq.com
 * @Version v1.0.0
 */
public class Clazz {
    private Integer cid;
    private String clazzName;
    private Integer level;
    private List<Student> students;

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public Clazz() {
    }

    public Clazz(Integer cid, String clazzName, Integer level) {
        this.cid = cid;
        this.clazzName = clazzName;
        this.level = level;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getClazzName() {
        return clazzName;
    }

    public void setClazzName(String clazzName) {
        this.clazzName = clazzName;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "Clazz{" +
                "cid=" + cid +
                ", clazzName='" + clazzName + '\'' +
                ", level=" + level +
                ", students=" + students +
                '}';
    }
}
