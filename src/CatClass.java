public class CatClass {
    String name; //не менее 3 символов
    int age;
    String sex;
    String ownerName;  //не менее 5 символов
    Boolean graft;

    public CatClass(String name, int age, String sex, String ownerName, Boolean graft) {
        validateName(name);
        validateAge(age);
        this.sex = sex;
        validateOwnerName(ownerName);
        this.graft = graft;
    }

    public CatClass(String name, int age, String sex, String ownerName) {
        validateName(name);
        validateAge(age);
        this.sex = sex;
        validateOwnerName(ownerName);
    }

    public CatClass(String name, int age, String ownerName, Boolean graft) {
        this.name = name;
        validateAge(age);
        validateOwnerName(ownerName);
        this.graft = graft;
    }

    public CatClass(String name, int age, String ownerName) {
        this.name = name;
        validateAge(age);
        validateOwnerName(ownerName);
    }

    public String getName() {return name;}
    public void setName(String name) {validateName(name);}

    public int getAge() {return age; }
    public void setAge(int age) {this.age = age;}

    public String getSex() {return sex;}
    public void setSex(String sex) {this.sex = sex;}

    public String getOwnerName() {return ownerName;}
    public void setOwnerName(String ownerName) {validateOwnerName(ownerName);}

    public Boolean getGraft() {return graft;}
    public void setGraft(Boolean graft) {this.graft = graft;}

    public void validateName(String name){
        if (name.length()>=3){
            this.name = name;
        } else {
            name = "DefaultName";
            System.out.println("Too short name");
        }
    }

    public void validateOwnerName(String ownerName){
        if (ownerName.length()>=5){
            this.ownerName = ownerName;
        } else {
            ownerName = "DefaultOwnerName";
            System.out.println("Too short ownerName");
        }
    }

    public void validateAge(int age){
        if (age < 25 && age > 0){
            this.age = age;
        } else {
            System.out.println("Incorrect Cat's Age");
        }
    }

    public String toString() {
        return "CatClass{" +
                "name=" + name +
                ", age=" + age +
                ", sex=" + sex +
                ", graft=" + graft +
                ", ownerName=" + ownerName +
                '}';
    }

}


