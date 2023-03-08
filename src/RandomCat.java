import java.util.Random;

public class RandomCat {

    Random random = new Random();

    public String getRandomName() {
        String result = "";
        char a;
        for (int i = 0; i < 5; i++) {
            a = (char) (random.nextInt(35) + '0');
            result = result + a;
        }
        return (result);
    }

    public String getRandomOwnerName() {
        String result = "";
        char a;
        for (int i = 0; i < 10; i++) {
            a = (char) (random.nextInt(35) + '0');
            result = result + a;
        }
        return (result);
    }

    public String getRandomSex() {
        String result = "";
        char a;
        for (int i = 0; i < 1; i++) {
            a = (char) (random.nextInt(35) + '0');
            result = result + a;
        }
        return (result);
    }
    public boolean getRandomBoolean() {
        return random.nextBoolean();
    }

    public int getRandomAge() {
        return random.nextInt(15);
    }

    public CatClass getRandomCat() {
        CatClass cat = new CatClass(getRandomName(), getRandomAge(), getRandomName(), getRandomName(), getRandomBoolean());
        return cat;
    }
}

