package Copy;

public class Person implements Cloneable {
  private Address address;
  public String name;

  // 省略构造函数、Getter&Setter方法
  @Override
  public Person clone() {
    try {
      Person person = (Person) super.clone();
      return person;
    } catch (CloneNotSupportedException e) {
      throw new AssertionError();
    }
  }

  public static void main(String[] args) {
    String str1 = "str";
    String str2 = "ing";
    String str3 = "str" + "ing";
    String str4 = str1 + str2;
    String str5 = "string";
    System.out.println(str3 == str4); // false
    System.out.println(str3 == str5); // true
    System.out.println(str4 == str5); // false }
    System.out.printf("\n%b %b %b\n", str3.equals(str4), str3.equals(str5),
        str4.equals(str5));
  }
}
