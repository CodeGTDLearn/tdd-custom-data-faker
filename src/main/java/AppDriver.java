
public class AppDriver {

  public static void main(String[] args) {

    System.out.printf(
         """
              This is my %s %s
              My fullName is: %s
              I like the: %s movies and
              I usually code in %s,
              I like the color %s,
              """.formatted(
              DataFaker.Provides.firstName(),
              DataFaker.Provides.lastName(),
              DataFaker.Provides.fullName(),
              DataFaker.Provides.hollywoodActorActress(),
              DataFaker.Provides.programmingLanguage(),
              DataFaker.Provides.color()
         )
    );
  }
}