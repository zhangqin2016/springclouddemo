package test.common.model.test;

/**
 * Created by Administrator on 2019/1/20.
 */
public class GirlVo {
    private String name;

    private String age;

    private String like;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getLike() {
        return like;
    }

    public void setLike(String like) {
        this.like = like;
    }

    public GirlVo(String name, String age, String like) {
        this.name = name;
        this.age = age;
        this.like = like;
    }

    public GirlVo() {
    }

    @Override
    public String toString() {
        return "GirlVo{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", like='" + like + '\'' +
                '}';
    }
}
