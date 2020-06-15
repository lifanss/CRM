package bean;

public class Cats {
    public int id;
    public String name;
    public int age;
    public String kind;
    public String sex;

    public Cats() {
    }

    public Cats(int id, String name, int age, String kind, String sex) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.kind = kind;
        this.sex = sex;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Cats{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", kind='" + kind + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }
}
