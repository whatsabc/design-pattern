package Builder;

/**
 * 简易版本的建造者模式
 * @author Jianshu
 * @since 20201106
 */
public class SimpleUser {

    private String firstName;     // 必传参数
    private String lastName;      // 必传参数
    private int age;              // 可选参数
    private String phone;         // 可选参数
    private String address;       // 可选参数

    public SimpleUser(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    public SimpleUser age(int age) {
        this.age = age;
        return this;
    }

    public SimpleUser phone(String phone) {
        this.phone = phone;
        return this;
    }

    public SimpleUser address(String address) {
        this.address = address;
        return this;
    }

    @Override
    public String toString() {
        return "SimpleUser{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
