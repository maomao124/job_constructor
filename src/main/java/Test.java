/**
 * Project name(项目名称)：作业 构造函数
 * Package(包名): PACKAGE_NAME
 * Class(类名): Person
 * Author(作者）: mao
 * Author QQ：1296193245
 * Date(创建日期)： 2021/10/8
 * Time(创建时间)： 16:59
 * Version(版本): 1.0
 * Description(描述)： 无
 */

import java.util.Scanner;

public class Test
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        String sex = sc.next();
        /********** Begin **********/
        //分别使用两种构造器来创建Person对象
        Person p = new Person(name, sex);
        p.display();

        /********** End **********/

    }
}

//创建Person对象，并创建两种构造方法
/********** Begin **********/


/********** End **********/
class Person
{
    private String name;
    private String sex;

    Person(String name, String sex)
    {
        this.name = name;
        this.sex = sex;
    }

    Person(String name)
    {
        this.name = name;
        this.sex = "未知";
    }

    public void display()
    {
        System.out.println("一个人被创建了");
        System.out.println("姓名：" + name + "，性别：" + sex + "，被创建了");
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getSex()
    {
        return sex;
    }

    public void setSex(String sex)
    {
        this.sex = sex;
    }
}
