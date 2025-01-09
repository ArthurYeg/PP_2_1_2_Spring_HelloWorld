//public class Cat {
//
//    private String name;
//    public String getName() {
//        return name;
//    }
//    public void setName(String name) {
//        this.name = name;
//    }
//}

public class Cat {
    private String name;
    private int age;
    private String breed;
    private String message;


    public Cat() {
    }

    public Cat(String name, int age, String breed, String message) {
        this.name = name;
        this.age = age;
        this.breed = breed;
        this.message = message;
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

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }


    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", breed='" + breed + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
