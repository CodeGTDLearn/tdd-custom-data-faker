import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.lang.System.*;

public class CustomDataFaker {

  public static void main(String[] args) {

    out.printf(
         """
              This is my %s %s
              My fullName is: %s
              I like the: %s movies and
              I usually code in %s,
              """.formatted(
              DataFaker.getFirstName(),
              DataFaker.getLastName(),
              DataFaker.getFullName(),
              DataFaker.getHollywoodActorActress(),
              DataFaker.getProgrammingLanguage()
         )
    );
  }


  private static class DataFaker {

    private static final Random random = new Random();

    private static final String[] ADDRESS_OPTIONS = {
         "123 Main St",
         "456 Elm Ave",
         "789 Oak Blvd",
         "987 Pine Rd",
         "543 Maple Ln",
         "876 Cedar Dr",
         "210 Birch Ct",
         "654 Redwood St",
         "765 Juniper Rd",
         "432 Spruce Blvd",
         "876 Acacia Ln",
         "109 Chestnut Dr",
         "234 Laurel Ave",
         "567 Poplar Rd"
    };

    private static final String[] ANIMAL_OPTIONS = {
         "Dog",
         "Cat",
         "Elephant",
         "Lion",
         "Tiger",
         "Giraffe",
         "Monkey",
         "Kangaroo",
         "Bear",
         "Penguin",
         "Dolphin",
         "Panda",
         "Gorilla",
         "Zebra",
         "Koala"
    };

    private static final String[] HOLLYWOOD_ACTOR_ACTRESS_OPTIONS = {
         "Tom Hanks",
         "Meryl Streep",
         "Leonardo DiCaprio",
         "Scarlett Johansson",
         "Robert Downey Jr.",
         "Jennifer Lawrence",
         "Brad Pitt",
         "Natalie Portman",
         "Johnny Depp",
         "Angelina Jolie",
         "Denzel Washington",
         "Charlize Theron",
         "Will Smith",
         "Cate Blanchett",
         "Chris Hemsworth"
    };

    private static final String[] BARCODE_OPTIONS = {
         "123456789012",
         "987654321098",
         "543210987651",
         "192837465012",
         "567890123456",
         "654321098765",
         "987612345890",
         "890123456789",
         "098765432109",
         "234567890123",
         "456789012345",
         "012345678901",
         "109876543210",
         "345678901234",
         "890123456790"
    };

    private static final String[] BEER_OPTIONS = {
         "IPA",
         "Stout",
         "Pilsner",
         "Porter",
         "Wheat Beer",
         "Lager",
         "Amber Ale",
         "Sour Beer",
         "Pale Ale",
         "Belgian Ale",
         "Brown Ale",
         "Cream Ale",
         "Red Ale",
         "Scotch Ale",
         "Saison"};

    private static final String[] BOOK_OPTIONS = {
         "To Kill a Mockingbird",
         "1984",
         "The Great Gatsby",
         "Pride and Prejudice",
         "The Catcher in the Rye",
         "The Lord of the " +
         "Rings",
         "The Hobbit",
         "Moby-Dick",
         "Jane Eyre",
         "Animal Farm",
         "Brave New World",
         "The Odyssey",
         "Fahrenheit 451",
         "The Alchemist"
    };

    private static final String[] CAT_BREED_OPTIONS = {
         "Siamese",
         "Maine Coon",
         "Persian",
         "Ragdoll",
         "Bengal",
         "Sphynx",
         "Abyssinian",
         "British Shorthair",
         "Scottish Fold",
         "Siberian",
         "Birman",
         "Norwegian Forest",
         "Oriental",
         "Devon Rex",
         "Manx"};

    private static final String[] DOG_BREED_OPTIONS = {
         "Labrador Retriever",
         "German Shepherd",
         "Golden Retriever",
         "French Bulldog",
         "Bulldog",
         "Poodle",
         "Beagle",
         "Rottweiler",
         "Yorkshire Terrier",
         "Boxer",
         "Dachshund",
         "Siberian Husky",
         "Shih Tzu",
         "Great Dane",
         "Pomeranian"
    };


    private static final String[] CURRENCY_OPTIONS = {
         "USD",
         "EUR",
         "JPY",
         "GBP",
         "AUD",
         "CAD",
         "CHF",
         "CNY",
         "SEK",
         "NZD",
         "KRW",
         "SGD",
         "NOK",
         "MXN",
         "INR"
    };

    private static final String[] DISEASE_OPTIONS = {
         "COVID-19",
         "Influenza",
         "Diabetes",
         "Cancer",
         "Hypertension",
         "Alzheimer's",
         "Parkinson's",
         "Asthma",
         "Arthritis",
         "Obesity",
         "Malaria",
         "HIV/AIDS",
         "Tuberculosis",
         "Epilepsy",
         "Heart Disease"
    };

    private static final String[] SPORT_OPTIONS = {
         "Soccer",
         "Basketball",
         "Tennis",
         "Golf",
         "Cricket",
         "Baseball",
         "Swimming",
         "Running",
         "Cycling",
         "Boxing",
         "Volleyball",
         "Ice Hockey",
         "Rugby",
         "Skiing",
         "Martial Arts"
    };

    private static final String[] GENDER_OPTIONS = {
         "Male",
         "Female",
         "Other"
    };

    private static final String[] HOBBY_OPTIONS = {
         "Reading",
         "Cooking",
         "Painting",
         "Gardening",
         "Photography",
         "Playing an Instrument",
         "Writing",
         "Hiking",
         "Dancing",
         "Yoga",
         "Fishing",
         "Gaming",
         "Traveling",
         "Knitting",
         "Collecting"
    };

    private static final String[] MUSIC_OPTIONS = {
         "Pop",
         "Rock",
         "Hip-Hop",
         "Electronic",
         "Country",
         "Jazz",
         "Classical",
         "R&B",
         "Reggae",
         "Metal",
         "Folk",
         "Blues",
         "Indie",
         "Latin",
         "Alternative"
    };

    private static final String[] FIRST_NAME_OPTIONS = {
         "James",
         "Mary",
         "John",
         "Patricia",
         "Robert",
         "Jennifer",
         "Michael",
         "Linda",
         "William",
         "Elizabeth",
         "David",
         "Barbara",
         "Richard",
         "Susan",
         "Joseph"
    };

    private static final String[] LAST_NAME_OPTIONS = {
         "Smith",
         "Johnson",
         "Williams",
         "Jones",
         "Brown",
         "Davis",
         "Miller",
         "Wilson",
         "Moore",
         "Taylor",
         "Anderson",
         "Jackson",
         "White",
         "Harris",
         "Martin"
    };

    private static final String[] NATION_OPTIONS = {
         "United States",
         "China",
         "India",
         "Brazil",
         "Pakistan",
         "Nigeria",
         "Bangladesh",
         "Russia",
         "Mexico",
         "Japan",
         "Ethiopia",
         "Philippines",
         "Egypt",
         "Vietnam",
         "DR Congo"
    };

    private static final String[] NUMBER_OPTIONS = {
         "One",
         "Two",
         "Three",
         "Four",
         "Five",
         "Six",
         "Seven",
         "Eight",
         "Nine",
         "Ten",
         "Eleven",
         "Twelve",
         "Thirteen",
         "Fourteen",
         "Fifteen"
    };

    private static final String[] PHONE_NUMBER_OPTIONS = {
         "+1 123-456-7890",
         "+44 20 1234 5678",
         "+81 3 1234 5678",
         "+86 10 1234 5678",
         "+33 12345 6789",
         "+55 11 1234 5678",
         "+49 30 1234 5678",
         "+7 495 123-45-67",
         "+39 06 1234 5678"
    };

    private static final String[] PROGRAMMING_LANGUAGE_OPTIONS = {
         "Java",
         "Python",
         "C++",
         "JavaScript",
         "C#",
         "Ruby",
         "Swift",
         "Go",
         "PHP",
         "Kotlin",
         "Rust",
         "Scala",
         "TypeScript",
         "Haskell",
         "Perl"
    };

    private static final String[] SUPERHERO_OPTIONS = {
         "Superman",
         "Batman",
         "Spider-Man",
         "Wonder Woman",
         "Iron Man",
         "Captain America",
         "Thor",
         "Black Widow",
         "Hulk",
         "Aquaman",
         "Black Panther",
         "Flash",
         "Green Lantern",
         "Wolverine",
         "Doctor Strange"
    };

    private static final String[] TEAM_OPTIONS = {
         "Crimson Crew",
         "Solar Sentinels",
         "Lunar Legends",
         "Aqua Avengers",
         "Thunder Tribe",
         "Emerald Enforcers",
         "Celestial Challengers",
         "Mystic Mavericks",
         "Sapphire Swarm",
         "Rising Phoenix",
         "Golden Guardians",
         "Galactic Gladiators",
         "Eternal Emissaries",
         "Velvet Vortex",
         "Nova Knights"
    };

    private static final String[] WEATHER_OPTIONS = {
         "Sunny",
         "Cloudy",
         "Rainy",
         "Windy",
         "Snowy",
         "Foggy",
         "Stormy",
         "Hazy",
         "Clear",
         "Overcast",
         "Partly Cloudy",
         "Misty",
         "Breezy",
         "Drizzling",
         "Hot"
    };

    private static final String[] UNIVERSITY_OPTIONS = {
         "Harvard University",
         "Stanford University",
         "Massachusetts Institute of Technology",
         "California Institute of Technology",
         "University of Oxford",
         "University of Cambridge",
         "ETH Zurich",
         "University of Chicago",
         "Princeton University",
         "Imperial College London",
         "Yale University",
         "Columbia University",
         "University of Pennsylvania",
         "University of California, Berkeley",
         "University of Toronto"
    };

    private static final String[] BUSINESS_OPTIONS = {
         "Apple Inc.",
         "Microsoft Corporation",
         "Amazon.com Inc.",
         "Alphabet Inc. (Google)",
         "Facebook Inc.",
         "Tesla Inc.",
         "Visa Inc.",
         "Samsung Electronics Co. Ltd.",
         "Walmart Inc.",
         "JP Morgan Chase & Co.",
         "Berkshire Hathaway Inc.",
         "Johnson & Johnson",
         "Procter & Gamble Co."
    };

    private static final String[] POSTAL_CODE_OPTIONS = {
         "A1A 1A1",
         "B2B 2B2",
         "C3C 3C3",
         "D4D 4D4",
         "E5E 5E5",
         "F6F 6F6",
         "G7G 7G7",
         "H8H 8H8",
         "I9I 9I9",
         "J0J 0J0",
         "K1K 1K1",
         "L2L 2L2",
         "M3M 3M3",
         "N4N 4N4",
         "O5O 5O5"
    };

    private static final String[] JOB_OPTIONS = {
         "Software Engineer",
         "Doctor",
         "Teacher",
         "Marketing Manager",
         "Sales Representative",
         "Graphic Designer",
         "Data Analyst",
         "Nurse",
         "Accountant",
         "Chef",
         "Mechanical Engineer",
         "Writer",
         "Lawyer",
         "Electrician",
         "Architect"
    };

    public static String generateStringFromRegex(String regex) {

      StringBuilder generatedString = new StringBuilder();
      Random random = new Random();

      while (true) {
        char randomChar = (char) (random.nextInt(128)); // Generating printable ASCII characters
        String candidateString = generatedString.toString() + randomChar;

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(candidateString);

        if (matcher.matches()) {
          generatedString.append(randomChar);
        }

        if (generatedString.length() >= candidateString.length()) {
          break;
        }
      }

      return generatedString.toString();
    }

    public static double generateRandomDouble(double minValue, double maxValue) {

      if (minValue >= maxValue) {
        throw new IllegalArgumentException("minValue must be less than maxValue");
      }

      Random random = new Random();
      return minValue + (random.nextDouble() * (maxValue - minValue));
    }


    public static long generateRandomLong(long minValue, long maxValue) {

      if (minValue >= maxValue) {
        throw new IllegalArgumentException("minValue must be less than maxValue");
      }

      Random random = new Random();
      return minValue + (long) (random.nextDouble() * (maxValue - minValue));
    }

    public static void main(String[] args) {

      long minValue = 100000L;
      long maxValue = 999999L;

      long randomValue = generateRandomLong(minValue, maxValue);
      out.println("Random Long Value: " + randomValue);
    }


    public static String getAddress() {

      return getRandomOption(ADDRESS_OPTIONS);
    }

    public static String getAnimal() {

      return getRandomOption(ANIMAL_OPTIONS);
    }

    public static String getHollywoodActorActress() {

      return getRandomOption(HOLLYWOOD_ACTOR_ACTRESS_OPTIONS);
    }

    public static String getBarcode() {

      return getRandomOption(BARCODE_OPTIONS);
    }

    public static String getBeer() {

      return getRandomOption(BEER_OPTIONS);
    }

    public static String getBook() {

      return getRandomOption(BOOK_OPTIONS);
    }

    public static String getCatBreed() {

      return getRandomOption(CAT_BREED_OPTIONS);
    }

    public static String getDogBreed() {

      return getRandomOption(DOG_BREED_OPTIONS);
    }

    public static String getCurrency() {

      return getRandomOption(CURRENCY_OPTIONS);
    }

    public static String getDate() {

      return "2023-08-28"; // Return a fixed date for simplicity
    }

    public static String getTime() {

      return "15:30:00"; // Return a fixed time for simplicity
    }

    public static String getDisease() {

      return getRandomOption(DISEASE_OPTIONS);
    }

    public static String getSport() {

      return getRandomOption(SPORT_OPTIONS);
    }

    public static String getGender() {

      return getRandomOption(GENDER_OPTIONS);
    }

    public static String getHobby() {

      return getRandomOption(HOBBY_OPTIONS);
    }

    public static String getMusic() {

      return getRandomOption(MUSIC_OPTIONS);
    }

    public static String getFullName() {

      return getRandomOption(FIRST_NAME_OPTIONS).concat(" ")
                                                .concat(getLastName());
    }

    public static String getFirstName() {

      return getRandomOption(FIRST_NAME_OPTIONS);
    }

    public static String getLastName() {

      return getRandomOption(LAST_NAME_OPTIONS);
    }

    public static String getNation() {

      return getRandomOption(NATION_OPTIONS);
    }

    public static String getNumber() {

      return getRandomOption(NUMBER_OPTIONS);
    }

    public static String getPhoneNumber() {

      return getRandomOption(PHONE_NUMBER_OPTIONS);
    }

    public static String getProgrammingLanguage() {

      return getRandomOption(PROGRAMMING_LANGUAGE_OPTIONS);
    }

    public static String getSinNumber() {

      return "123-456-789"; // Return a fixed SIN number for simplicity
    }

    public static String getSuperhero() {

      return getRandomOption(SUPERHERO_OPTIONS);
    }

    public static String getTeam() {

      return getRandomOption(TEAM_OPTIONS);
    }

    public static String getWeather() {

      return getRandomOption(WEATHER_OPTIONS);
    }

    public static String getUniversity() {

      return getRandomOption(UNIVERSITY_OPTIONS);
    }

    public static String getBusiness() {

      return getRandomOption(BUSINESS_OPTIONS);
    }

    public static String getPostalCode() {

      return getRandomOption(POSTAL_CODE_OPTIONS);
    }

    public static String getJob() {

      return getRandomOption(JOB_OPTIONS);
    }

    private static String getRandomOption(String[] options) {

      int index = random.nextInt(options.length);
      return options[index];
    }
  }
}