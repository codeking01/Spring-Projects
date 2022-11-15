package beans;

/**
 * @author : codeking
 * @date : 2022/11/15 18:42
 */

/**
 * 2、基于 xml 方式注入属性
 * （1）DI：依赖注入，就是注入属性
 * 3、第一种注入方式：使用 set 方法进行注入
 * （1）创建类，定义属性和对应的 set 方法
 * （2）在 spring 配置文件配置对象创建，配置属性注入
 *  2 set 方法注入属性
 * <bean id="book" class="com.atguigu.spring5.Book">
 *  使用 property 完成属性注入
 * name：类里面属性名称
 * value：向属性注入的值
 * -->
 * <property name="bname" value="易筋经"></property>
 * <property name="bauthor" value="达摩老祖"></property>
 * </bean>
 */
public class Book {
    private String b_name;
    private String b_author;

    public void setB_name(String b_name) {
        this.b_name = b_name;
    }

    public void setB_author(String b_author) {
        this.b_author = b_author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "b_name='" + b_name + '\'' +
                ", b_author='" + b_author + '\'' +
                '}';
    }
}
