import java.util.ArrayList;

public class Main {

  public static void main(String[] args) {

      RandomCat RandomCat = new RandomCat();

      ArrayList<CatClass> cat = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            cat.add(i, RandomCat.getRandomCat());
        }
      for (int n = 1; n <= cat.size(); n++) {
          System.out.println(n + ") Cat's name - "+ RandomCat.getRandomName() +", Age - "+RandomCat.getRandomAge() +
                  ", Sex - "+ RandomCat.getRandomSex() + ", OwnerName - " + RandomCat.getRandomOwnerName() +
                  ", Graft - " + RandomCat.getRandomBoolean());
      }
    }

}


