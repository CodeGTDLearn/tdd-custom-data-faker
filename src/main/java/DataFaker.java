import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DataFaker {

  private DataFaker() {

  }

  private static class FakeData {

    private static final Random random = new Random();

    private static final String[] SIN_NUMBER = {
         "123-456-789",
         "987-654-321",
         "456-789-123",
         "321-654-987",
         "555-888-999",
         "111-222-333",
         "444-777-000",
         "999-888-777",
         "222-555-111",
         "666-333-999"
    };

    private static final String[] ADDRESS = {
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
         "876 Acacia Ln"
    };

    private static final String[] ANIMAL = {
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
         "Dolphin"
    };

    private static final String[] HOLLYWOOD_ACTOR_ACTRESS = {
         "Tom Hanks",
         "Meryl Streep",
         "Leonardo DiCaprio",
         "Scarlett Johansson",
         "Robert Downey Jr.",
         "Jennifer Lawrence",
         "Brad Pitt",
         "Natalie Portman",
         "Johnny Depp",
         "Angelina Jolie"
    };

    private static final String[] BARCODE = {
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
         "456789012345"
    };

    private static final String[] BEER = {
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
         "Cream Ale"
    };

    private static final String[] BOOK_TITLES = {
         "To Kill a Mockingbird",
         "1984",
         "The Great Gatsby",
         "Pride and Prejudice",
         "The Catcher in the Rye",
         "The Lord of the " +
         "Rings",
         "The Hobbit",
         "Moby-Dick",
         "Jane Eyre"
    };

    private static final String[] CAT_BREED = {
         "Siamese",
         "Maine Coon",
         "Persian",
         "Ragdoll",
         "Bengal",
         "Sphynx",
         "Abyssinian",
         "British Shorthair",
         "Scottish Fold"
    };

    private static final String[] DOG_BREED = {
         "Labrador Retriever",
         "German Shepherd",
         "Golden Retriever",
         "French Bulldog",
         "Bulldog",
         "Poodle",
         "Beagle",
         "Rottweiler",
         "Yorkshire Terrier",
         "Boxer"
    };


    private static final String[] CURRENCY = {
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

    private static final String[] DISEASE = {
         "COVID-19",
         "Influenza",
         "Diabetes",
         "Cancer",
         "Hypertension",
         "Alzheimer's",
         "Parkinson's",
         "Asthma",
         "Arthritis",
         "Obesity"
    };

    private static final String[] SPORT = {
         "Soccer",
         "Basketball",
         "Tennis",
         "Golf",
         "Cricket",
         "Baseball",
         "Swimming",
         "Running",
         "Cycling",
         "Boxing"
    };


    private static final String[] HOBBY = {
         "Reading",
         "Cooking",
         "Painting",
         "Gardening",
         "Photography",
         "Playing an Instrument",
         "Writing",
         "Hiking",
         "Dancing",
         "Yoga"
    };

    private static final String[] MUSIC_STYLES = {
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
         "Blues"
    };

    private static final String[] FIRST_NAME = {
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
         "David"
    };

    private static final String[] LAST_NAME = {
         "Smith",
         "Johnson",
         "Williams",
         "Jones",
         "Brown",
         "Davis",
         "Miller",
         "Wilson",
         "Moore",
         "Taylor"
    };

    private static final String[] NATION = {
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
         "Ethiopia"
    };

    private static final String[] NUMBER_WRITTENS = {
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

    private static final String[] PHONE_NUMBER = {
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

    private static final String[] PROGRAMMING_LANGUAGE = {
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

    private static final String[] SUPER_HERO = {
         "Superman",
         "Batman",
         "Spider-Man",
         "Wonder Woman",
         "Iron Man",
         "Captain America",
         "Thor",
         "Black Widow",
         "Hulk",
         "Aquaman"
    };

    private static final String[] TEAM_NAMES = {
         "Crimson Crew",
         "Solar Sentinels",
         "Lunar Legends",
         "Aqua Avengers",
         "Thunder Tribe",
         "Emerald Enforcers",
         "Celestial Challengers",
         "Mystic Mavericks",
         "Sapphire Swarm"
    };

    private static final String[] WEATHER = {
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

    private static final String[] UNIVERSITY_NAMES = {
         "Harvard University",
         "Stanford University",
         "Massachusetts Institute of Technology",
         "California Institute of Technology",
         "University of Oxford",
         "University of Cambridge",
         "ETH Zurich",
         "University of Chicago",
         "Princeton University"
    };

    private static final String[] BUSINESS_COMPANIES = {
         "Apple Inc.",
         "Microsoft Corporation",
         "Amazon.com Inc.",
         "Alphabet Inc. (Google)",
         "Facebook Inc.",
         "Tesla Inc.",
         "Visa Inc.",
         "Samsung Electronics Co. Ltd.",
         "Walmart Inc."
    };

    private static final String[] POSTAL_CODE = {
         "A1A 1A1",
         "B2B 2B2",
         "C3C 3C3",
         "D4D 4D4",
         "E5E 5E5",
         "F6F 6F6",
         "G7G 7G7",
         "H8H 8H8",
         "I9I 9I9",
         "J0J 0J0"
    };

    private static final String[] JOBS = {
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
         "Writer"
    };

    private static final String[] EN_ARTIST_NAMES = {
         "Donatello",
         "Botticelli",
         "Michelangelo",
         "Raphael",
         "Titian",
         "Durer",
         "Caravaggio",
         "Rubens",
         "Bernini"
    };


    private static final String[] ASIN = {
         "B000BJ20TO",
         "B000BJ0Z50",
         "B000BUYO60",
         "B000HGWGHW",
         "B000II6WOW",
         "B000AMNV8G",
         "B000HDT0BU",
         "B000HGNY7I"
    };


    private static final String[] COLOR_NAME = {
         "red",
         "green",
         "blue",
         "yellow",
         "purple",
         "mint green",
         "teal",
         "white",
         "black",
         "orange",
         "pink",
         "grey",
         "maroon",
         "violet",
         "turquoise"
    };

    private static final String[] DEPARTMENTS = {
         "Books",
         "Movies",
         "Music",
         "Games",
         "Electronics",
         "Computers",
         "Home",
         "Garden",
         "Tools",
         "Grocery"
    };

    private static final String[] PRODUCT_NAME_ADJECTIVES = {
         "Small",
         "Ergonomic",
         "Rustic",
         "Intelligent",
         "Gorgeous",
         "Incredible",
         "Fantastic",
         "Practical",
         "Sleek",
         "Awesome"
    };

    private static final String[] MATERIALS = {
         "Steel",
         "Wooden",
         "Concrete",
         "Plastic",
         "Cotton",
         "Granite",
         "Rubber",
         "Leather",
         "Silk",
         "Wool"
    };

    private static final String[] PRODUCTS = {
         "Chair",
         "Car",
         "Computer",
         "Gloves",
         "Pants",
         "Shirt",
         "Table",
         "Shoes",
         "Hat",
         "Plate"
    };

    private static final String[] PROMOTION_CODE_ADJECTIVES = {
         "Amazing",
         "Awesome",
         "Cool",
         "Good",
         "Great",
         "Incredible",
         "Killer",
         "Premium",
         "Special",
         "Stellar"
    };

    private static final String[] PROMOTION_CODE_NOUNS = {
         "Code",
         "Deal",
         "Discount",
         "Price",
         "Promo",
         "Promotion",
         "Sale",
         "Savings",
         "Super Sale",
         "Black Friday"
    };

    private static final String[] BUZZWORDS = {
         "Adaptive",
         "Advanced",
         "Ameliorated",
         "Assimilated",
         "Automated",
         "Balanced",
         "Business-focused",
         "Centralized",
         "Cloned",
         "Compatible"
    };

    private static final String[] NOUNS = {
         "ability",
         "access",
         "adapter",
         "algorithm",
         "alliance",
         "analyzer",
         "application",
         "approach",
         "architecture",
         "archive"
    };

    private static final String[] VERBS = {
         "implement",
         "utilize",
         "integrate",
         "streamline",
         "optimize",
         "evolve",
         "transform",
         "embrace",
         "enable",
         "orchestrate"
    };

    private static final String[] WORDS = {
         "synergies",
         "web-readiness",
         "paradigms",
         "markets",
         "partnerships",
         "infrastructures",
         "platforms",
         "initiatives",
         "channels",
         "eyeballs"
    };

    private static final String[] INDUSTRY = {
         "Defense & Space",
         "Computer Hardware",
         "Computer Software",
         "Computer Networking",
         "Internet",
         "Semiconductors",
         "Telecommunications",
         "Law Practice",
         "Legal Services",
         "Management Consulting"
    };

    private static final String[] PROFESSION = {
         "teacher",
         "actor",
         "musician",
         "philosopher",
         "writer",
         "doctor",
         "accountant",
         "agriculturist",
         "architect",
         "economist"
    };

    private static final String[] COMPANY_TYPE = {
         "Public Company",
         "Educational Institution",
         "Self-Employed",
         "Government Agency",
         "Nonprofit",
         "Sole Proprietorship",
         "Privately Held",
         "Partnership"
    };

    private static final String[] SIC_CODE = {
         "0111",
         "0112",
         "0115",
         "0116",
         "0119",
         "0131",
         "0132",
         "0133",
         "0134",
         "0139",
         "0161"
    };


    private static final String[] GENDER = {
         "Male",
         "Female",
         "Other"
    };

    private static final String[] NATIONALITY = {
         "Afghan",
         "Albanian",
         "Algerian",
         "American",
         "Andorran",
         "Angolan",
         "Argentine",
         "Armenian",
         "Aromanian",
         "Aruban"
    };

    private static final String[] EDUCATIONAL_ATTAINMENT = {
         "No schooling completed",
         "Nursery school",
         "Kindergarten",
         "Grade 1 though 11",
         "12th grade - No Diploma",
         "Regular high school diploma",
         "GED or alternative credential",
         "Some college",
         "Associate's degree",
         "Bachelor's degree"
    };

    private static final String[] MARITAL_STATUS = {
         "Married",
         "Widowed",
         "Divorced",
         "Separated",
         "Never married"
    };

    private static final String[] EDUCATOR_NAMES = {
         "Marblewald",
         "Mallowtown",
         "Brookville",
         "Flowerlake",
         "Falconholt",
         "Ostbarrow",
         "Lakeacre",
         "Clearcourt",
         "Ironston",
         "Mallowpond"
    };

    private static final String[] SECONDARY_SCHOOLS = {
         "High School",
         "Secondary College",
         "High"
    };

    private static final String[] DEGREE_SUBJECTS = {
         "Arts",
         "Business",
         "Education",
         "Applied Science (Psychology)",
         "Architectural Technology",
         "Biological Science",
         "Biomedical Science",
         "Commerce",
         "Communications",
         "Creative Arts"
    };

    private static final String[] FILE_EXTENSIONS = {
         "flac",
         "mp3",
         "wav",
         "bmp",
         "gif",
         "jpeg",
         "jpg",
         "png",
         "tiff",
         "css"
    };

    private static final String[] FAMOUS_LAST_WORDS = {
         "I don't know.",
         "No comment.",
         "Van Halen!",
         "Is it not meningitis?",
         "I love you too, honey. Good luck with your show.",
         "Am I dying, or is this my birthday?",
         "I want your bunk!",
         "I went the distance.",
         "Goodnight, my darlings, I'll see you tomorrow.",
         "I am confound."
    };


  }

  public static class Provides {

    private Provides() {

    }

    private static final String MAX_MIN_ERROR_MESSAGE = "minValue must be less than maxValue";

    public static String color() {

      return selectRandomOption(FakeData.COLOR_NAME);
    }

    public static String artist() {

      return selectRandomOption(FakeData.EN_ARTIST_NAMES);
    }

    public static String sinId() {

      return selectRandomOption(FakeData.ASIN);
    }

    public static String stringFromRegex(String regex) {

      StringBuilder generatedString = new StringBuilder();
      Random random = privateRandom();

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

    public static double randomDouble(double minValue, double maxValue) {


      if (minValue >= maxValue) {
        throw new IllegalArgumentException(MAX_MIN_ERROR_MESSAGE);
      }

      Random random = privateRandom();
      return minValue + (random.nextDouble() * (maxValue - minValue));
    }

    public static double randomDouble() {

      Random random = privateRandom();
      return random.nextDouble();
    }

    public static long randomLong(long minValue, long maxValue) {

      if (minValue >= maxValue) {
        throw new IllegalArgumentException(MAX_MIN_ERROR_MESSAGE);
      }

      Random random = privateRandom();
      return minValue +  (random.nextLong() * (maxValue - minValue));
    }

    public static long randomLong() {

      Random random = privateRandom();
      return random.nextLong();
    }

    public static int randomInteger(int minValue, int maxValue) {

      if (minValue >= maxValue) {
        throw new IllegalArgumentException(MAX_MIN_ERROR_MESSAGE);
      }

      Random random = privateRandom();
      return minValue +  (random.nextInt() * (maxValue - minValue));
    }

    public static long randomInteger() {

      Random random = privateRandom();
      return random.nextInt();
    }

    public static String address() {

      return selectRandomOption(FakeData.ADDRESS);
    }

    public static String animal() {

      return selectRandomOption(FakeData.ANIMAL);
    }

    public static String hollywoodActorActress() {

      return selectRandomOption(FakeData.HOLLYWOOD_ACTOR_ACTRESS);
    }

    public static String barcode() {

      return selectRandomOption(FakeData.BARCODE);
    }

    public static String beer() {

      return selectRandomOption(FakeData.BEER);
    }

    public static String book() {

      return selectRandomOption(FakeData.BOOK_TITLES);
    }

    public static String catBreed() {

      return selectRandomOption(FakeData.CAT_BREED);
    }

    public static String dogBreed() {

      return selectRandomOption(FakeData.DOG_BREED);
    }

    public static String currency() {

      return selectRandomOption(FakeData.CURRENCY);
    }

    public static String date() {

      Random rand = privateRandom();
      int year = rand.nextInt(100) + 2000;
      int month = rand.nextInt(12) + 1;
      int day = rand.nextInt(31) + 1;
      LocalDate randomDate = LocalDate.of(year, month, day);
      return randomDate.toString();
    }

    public static String time() {

      Random rand = privateRandom();
      int hour = rand.nextInt(24);
      int minute = rand.nextInt(60);
      int second = rand.nextInt(60);

      LocalTime randomTime = LocalTime.of(hour, minute, second);
      return randomTime.toString();
    }

    private static Random privateRandom() {

      return new Random();

    }

    public static String disease() {

      return selectRandomOption(FakeData.DISEASE);
    }

    public static String sport() {

      return selectRandomOption(FakeData.SPORT);
    }

    public static String gender() {

      return selectRandomOption(FakeData.GENDER);
    }

    public static String hobby() {

      return selectRandomOption(FakeData.HOBBY);
    }

    public static String music() {

      return selectRandomOption(FakeData.MUSIC_STYLES);
    }

    public static String fullName() {

      return selectRandomOption(FakeData.FIRST_NAME)
           .concat(" ")
           .concat(lastName());
    }

    public static String firstName() {

      return selectRandomOption(FakeData.FIRST_NAME);
    }

    public static String lastName() {

      return selectRandomOption(FakeData.LAST_NAME);
    }

    public static String nation() {

      return selectRandomOption(FakeData.NATION);
    }

    public static String number() {

      return selectRandomOption(FakeData.NUMBER_WRITTENS);
    }

    public static String phoneNumber() {

      return selectRandomOption(FakeData.PHONE_NUMBER);
    }

    public static String programmingLanguage() {

      return selectRandomOption(FakeData.PROGRAMMING_LANGUAGE);
    }

    public static String sinNumber() {

      return selectRandomOption(FakeData.SIN_NUMBER);
    }

    public static String superhero() {

      return selectRandomOption(FakeData.SUPER_HERO);
    }

    public static String team() {

      return selectRandomOption(FakeData.TEAM_NAMES);
    }

    public static String weather() {

      return selectRandomOption(FakeData.WEATHER);
    }

    public static String university() {

      return selectRandomOption(FakeData.UNIVERSITY_NAMES);
    }

    public static String business() {

      return selectRandomOption(FakeData.BUSINESS_COMPANIES);
    }

    public static String postalCode() {

      return selectRandomOption(FakeData.POSTAL_CODE);
    }

    public static String jobOptions() {

      return selectRandomOption(FakeData.JOBS);
    }

    public static String departments() {

      return selectRandomOption(FakeData.DEPARTMENTS);
    }

    public static String productNameAdjectives() {

      return selectRandomOption(FakeData.PRODUCT_NAME_ADJECTIVES);
    }

    public static String promotionCodeAdjectives() {

      return selectRandomOption(FakeData.PROMOTION_CODE_ADJECTIVES);
    }

    public static String promotionCodeNouns() {

      return selectRandomOption(FakeData.PROMOTION_CODE_NOUNS);
    }

    public static String materials() {

      return selectRandomOption(FakeData.MATERIALS);
    }

    public static String buzzwords() {

      return selectRandomOption(FakeData.BUZZWORDS);
    }

    public static String verbs() {

      return selectRandomOption(FakeData.VERBS);
    }

    public static String nouns() {

      return selectRandomOption(FakeData.NOUNS);
    }

    public static String famousLastWords() {

      return selectRandomOption(FakeData.FAMOUS_LAST_WORDS);
    }

    public static String fileExtensions() {

      return selectRandomOption(FakeData.FILE_EXTENSIONS);
    }

    public static String degree() {

      return selectRandomOption(FakeData.DEGREE_SUBJECTS);
    }

    public static String educator() {

      return selectRandomOption(FakeData.EDUCATOR_NAMES);
    }

    public static String educationAttainment() {

      return selectRandomOption(FakeData.EDUCATIONAL_ATTAINMENT);
    }

    public static String nationality() {

      return selectRandomOption(FakeData.NATIONALITY);
    }

    public static String secondarySchools() {

      return selectRandomOption(FakeData.SECONDARY_SCHOOLS);
    }

    public static String sicCode() {

      return selectRandomOption(FakeData.SIC_CODE);
    }

    public static String companyType() {

      return selectRandomOption(FakeData.COMPANY_TYPE);
    }

    public static String profession() {

      return selectRandomOption(FakeData.PROFESSION);
    }

    public static String job() {

      return selectRandomOption(FakeData.PRODUCTS);
    }

    public static String words() {

      return selectRandomOption(FakeData.WORDS);
    }

    public static String industry() {

      return selectRandomOption(FakeData.INDUSTRY);
    }

    public static String maritalStatus() {

      return selectRandomOption(FakeData.MARITAL_STATUS);
    }

    private static String selectRandomOption(String[] options) {

      int index = FakeData.random.nextInt(options.length);
      return options[index];
    }
  }

}