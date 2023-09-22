import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DataFaker {

  private static final Random random = new Random();

  private static final String MAX_MIN_ERROR_MESSAGE = "minValue must be less than maxValue";

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
       "876 Acacia Ln",
       "109 Chestnut Dr",
       "234 Laurel Ave",
       "567 Poplar Rd"
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
       "Dolphin",
       "Panda",
       "Gorilla",
       "Zebra",
       "Koala"
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
       "Angelina Jolie",
       "Denzel Washington",
       "Charlize Theron",
       "Will Smith",
       "Cate Blanchett",
       "Chris Hemsworth"
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
       "456789012345",
       "012345678901",
       "109876543210",
       "345678901234",
       "890123456790"
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
       "Cream Ale",
       "Red Ale",
       "Scotch Ale",
       "Saison"
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
       "Jane Eyre",
       "Animal Farm",
       "Brave New World",
       "The Odyssey",
       "Fahrenheit 451",
       "The Alchemist"
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
       "Scottish Fold",
       "Siberian",
       "Birman",
       "Norwegian Forest",
       "Oriental",
       "Devon Rex",
       "Manx"};

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
       "Boxer",
       "Dachshund",
       "Siberian Husky",
       "Shih Tzu",
       "Great Dane",
       "Pomeranian"
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
       "Obesity",
       "Malaria",
       "HIV/AIDS",
       "Tuberculosis",
       "Epilepsy",
       "Heart Disease"
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
       "Boxing",
       "Volleyball",
       "Ice Hockey",
       "Rugby",
       "Skiing",
       "Martial Arts"
  };

  private static final String[] GENDER = {
       "Male",
       "Female",
       "Other"
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
       "Yoga",
       "Fishing",
       "Gaming",
       "Traveling",
       "Knitting",
       "Collecting"
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
       "Blues",
       "Indie",
       "Latin",
       "Alternative"
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
       "David",
       "Barbara",
       "Richard",
       "Susan",
       "Joseph"
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
       "Taylor",
       "Anderson",
       "Jackson",
       "White",
       "Harris",
       "Martin"
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
       "Ethiopia",
       "Philippines",
       "Egypt",
       "Vietnam",
       "DR Congo"
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
       "+01 123-456-7890",
       "+44 020 1234 5678",
       "+81 003 1234 5678",
       "+86 010 1234 5678",
       "+33 123 0045 6789",
       "+55 110 1234 5678",
       "+49 030 1234 5678",
       "+07 495 1230 4567",
       "+39 064 1234 5678",
       "+01 212 0555 1234",
       "+44 205 7123 4567",
       "+33 145 2345 6789",
       "+49 304 1234 5678",
       "+61 256 8765 4321",
       "+57 495 123 4567",
       "+55 11 3456 7890",
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
       "Aquaman",
       "Black Panther",
       "Flash",
       "Green Lantern",
       "Wolverine",
       "Doctor Strange"
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
       "Sapphire Swarm",
       "Rising Phoenix",
       "Golden Guardians",
       "Galactic Gladiators",
       "Eternal Emissaries",
       "Velvet Vortex",
       "Nova Knights"
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
       "Princeton University",
       "Imperial College London",
       "Yale University",
       "Columbia University",
       "University of Pennsylvania",
       "University of California, Berkeley",
       "University of Toronto"
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
       "Walmart Inc.",
       "JP Morgan Chase & Co.",
       "Berkshire Hathaway Inc.",
       "Johnson & Johnson",
       "Procter & Gamble Co."
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
       "J0J 0J0",
       "K1K 1K1",
       "L2L 2L2",
       "M3M 3M3",
       "N4N 4N4",
       "O5O 5O5"
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
       "Writer",
       "Lawyer",
       "Electrician",
       "Architect"
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
       "Bernini",
       "Rembrandt",
       "Pissarro",
       "Manet",
       "Degas",
       "Cezanne"
  };


  private static final String[] ASIN = {
       "B000BJ20TO",
       "B000BJ0Z50",
       "B000BUYO60",
       "B000HGWGHW",
       "B000II6WOW",
       "B000AMNV8G",
       "B000HDT0BU",
       "B000HGNY7I",
       "B000I6VQX6",
       "B0002I6HKW",
       "B00067POW6",
       "B0000VFDCY",
       "B0000W4I2O",
       "B00026IESC",
       "B000GWIHF2"
  };


  private static final String[] COLOR_NAMES = {
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

  private static final String[] CREDIT_CARD_NUMBERS = {
       "4111 3330 4963 1019",
       "5500 0000 0000 0004",
       "6011 1111 1111 1117",
       "3782 8224 6310 0005",
       "3714 4963 5398 5431",
       "3625 9600 0055 4963",
       "5610 5910 8101 8250",
       "5019 7170 1010 3742",
       "6331 1019 9999 0016",
       "3566 0020 2036 0505",
       "6333 8101 5610 0001",
       "3530 1113 3330 3714",
       "6304 5431 7170 8224",
       "3056 9309 0259 0594",
       "3852 5610 0232 8937"
  };

  private static final String[] DOG_NAMES = {
       "Buddy",
       "Max",
       "Charlie",
       "Jack",
       "Cooper",
       "Rocky",
       "Bear",
       "Duke",
       "Toby",
       "Tucker",
       "Finn",
       "Bentley",
       "Milo",
       "Leo",
       "Beau"
  };

  private static final String[] CAT_NAMES = {
       "Luna",
       "Bella",
       "Lucy",
       "Chloe",
       "Daisy",
       "Molly",
       "Lily",
       "Sophie",
       "Charlie",
       "Stella",
       "Oliver",
       "Simba",
       "Jack",
       "Milo",
       "Leo"
  };

  private static final String[] SIN_NUMBERS = {
       "123 456 789",
       "234 567 890",
       "345 678 901",
       "456 789 012",
       "567 890 123",
       "678 901 234",
       "789 012 345",
       "890 123 456",
       "901 234 567",
       "012 345 678",
       "123 567 901",
       "234 678 012",
       "345 789 123",
       "456 890 234",
       "567 901 345"
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

  public static LocalDate[] randomDate() {

    LocalDate[] dates = new LocalDate[15];
    int minYear = 1970;
    int maxYear = LocalDate.now()
                           .getYear();

    for (int i = 0; i < dates.length; i++) {

      int year = random.nextInt(maxYear - minYear + 1) + minYear;
      int dayOfYear = random.nextInt(
           LocalDate.ofYearDay(year, 1)
                    .lengthOfYear()) + 1;

      dates[i] = LocalDate.ofYearDay(year, dayOfYear);
    }
    return dates;
  }

  public static LocalTime[] randomTimes() {

    LocalTime[] times = new LocalTime[15];

    for (int i = 0; i < times.length; i++) {

      int hour = random.nextInt(24);
      int min = random.nextInt(60);
      int sec = random.nextInt(60);

      times[i] = LocalTime.of(hour, min, sec);

    }

    return times;
  }

  public static String stringFromRegex(String regex) {

    StringBuilder generatedString = new StringBuilder();

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


  public static String artist() {

    return randomOption(EN_ARTIST_NAMES);
  }

  public static String sinId() {

    return randomOption(ASIN);
  }

  public static String address() {

    return randomOption(ADDRESS);
  }

  public static String animal() {

    return randomOption(ANIMAL);
  }

  public static String hollywoodActorActress() {

    return randomOption(HOLLYWOOD_ACTOR_ACTRESS);
  }


  public static String catName() {

    return randomOption(CAT_NAMES);
  }

  public static String dogName() {

    return randomOption(DOG_NAMES);
  }

  public static String creditCardNumer() {

    return randomOption(CREDIT_CARD_NUMBERS);
  }


  public static String disease() {

    return randomOption(DISEASE);
  }


  public static String numberWrittens() {

    return randomOption(NUMBER_WRITTENS);
  }

  public static String phoneNumber() {

    return randomOption(PHONE_NUMBER);
  }


  public static String superHero() {

    return randomOption(SUPER_HERO);
  }


  public static String randomOption(String[] options) {

    int index = random.nextInt(options.length);
    return options[index];
  }

  public static String[] randomOptions(String[] options) {

    final int totalItemsToBeReturned = 3;
    String[] finalList = new String[totalItemsToBeReturned];

    for (int i = 0; i < totalItemsToBeReturned; i++) {
      finalList[i] = options[i];
    }

    return finalList;
  }


  public static String color() {

    return selectRandomOption(COLOR_NAMES);
  }


  public static double randomDouble(double minValue, double maxValue) {

    if (minValue >= maxValue) {
      throw new IllegalArgumentException(MAX_MIN_ERROR_MESSAGE);
    }

    return minValue + (random.nextDouble() * (maxValue - minValue));
  }

  public static double randomDouble() {

    return random.nextDouble();
  }

  public static long randomLong(long minValue, long maxValue) {

    if (minValue >= maxValue) {
      throw new IllegalArgumentException(MAX_MIN_ERROR_MESSAGE);
    }


    return minValue + (random.nextLong() * (maxValue - minValue));
  }

  public static long randomLong() {


    return random.nextLong();
  }

  public static int randomInteger(int minValue, int maxValue) {

    if (minValue >= maxValue) {
      throw new IllegalArgumentException(MAX_MIN_ERROR_MESSAGE);
    }

    return minValue + (random.nextInt() * (maxValue - minValue));
  }

  public static Integer randomInteger() {

    return random.nextInt();
  }


  public static String barcode() {

    return selectRandomOption(BARCODE);
  }

  public static String beer() {

    return selectRandomOption(BEER);
  }

  public static String book() {

    return selectRandomOption(BOOK_TITLES);
  }

  public static String catBreed() {

    return selectRandomOption(CAT_BREED);
  }

  public static String dogBreed() {

    return selectRandomOption(DOG_BREED);
  }

  public static String currency() {

    return selectRandomOption(CURRENCY);
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


  public static String sport() {

    return selectRandomOption(SPORT);
  }

  public static String gender() {

    return selectRandomOption(GENDER);
  }

  public static String hobby() {

    return selectRandomOption(HOBBY);
  }

  public static String music() {

    return selectRandomOption(MUSIC_STYLES);
  }

  public static String fullName() {

    return selectRandomOption(FIRST_NAME)
         .concat(" ")
         .concat(lastName());
  }

  public static String firstName() {

    return selectRandomOption(FIRST_NAME);
  }

  public static String lastName() {

    return selectRandomOption(LAST_NAME);
  }

  public static String nation() {

    return selectRandomOption(NATION);
  }

  public static String number() {

    return selectRandomOption(NUMBER_WRITTENS);
  }


  public static String programmingLanguage() {

    return selectRandomOption(PROGRAMMING_LANGUAGE);
  }

  public static String sinNumber() {

    return selectRandomOption(SIN_NUMBERS);
  }

  public static String superhero() {

    return selectRandomOption(SUPER_HERO);
  }

  public static String team() {

    return selectRandomOption(TEAM_NAMES);
  }

  public static String weather() {

    return selectRandomOption(WEATHER);
  }

  public static String university() {

    return selectRandomOption(UNIVERSITY_NAMES);
  }

  public static String business() {

    return selectRandomOption(BUSINESS_COMPANIES);
  }

  public static String postalCode() {

    return selectRandomOption(POSTAL_CODE);
  }

  public static String jobOptions() {

    return selectRandomOption(JOBS);
  }

  public static String departments() {

    return selectRandomOption(DEPARTMENTS);
  }

  public static String productNameAdjectives() {

    return selectRandomOption(PRODUCT_NAME_ADJECTIVES);
  }

  public static String promotionCodeAdjectives() {

    return selectRandomOption(PROMOTION_CODE_ADJECTIVES);
  }

  public static String promotionCodeNouns() {

    return selectRandomOption(PROMOTION_CODE_NOUNS);
  }

  public static String materials() {

    return selectRandomOption(MATERIALS);
  }

  public static String buzzwords() {

    return selectRandomOption(BUZZWORDS);
  }

  public static String verbs() {

    return selectRandomOption(VERBS);
  }

  public static String nouns() {

    return selectRandomOption(NOUNS);
  }

  public static String famousLastWords() {

    return selectRandomOption(FAMOUS_LAST_WORDS);
  }

  public static String fileExtensions() {

    return selectRandomOption(FILE_EXTENSIONS);
  }

  public static String degree() {

    return selectRandomOption(DEGREE_SUBJECTS);
  }

  public static String educator() {

    return selectRandomOption(EDUCATOR_NAMES);
  }

  public static String educationAttainment() {

    return selectRandomOption(EDUCATIONAL_ATTAINMENT);
  }

  public static String nationality() {

    return selectRandomOption(NATIONALITY);
  }

  public static String secondarySchools() {

    return selectRandomOption(SECONDARY_SCHOOLS);
  }

  public static String sicCode() {

    return selectRandomOption(SIC_CODE);
  }

  public static String companyType() {

    return selectRandomOption(COMPANY_TYPE);
  }

  public static String profession() {

    return selectRandomOption(PROFESSION);
  }

  public static String job() {

    return selectRandomOption(PRODUCTS);
  }

  public static String words() {

    return selectRandomOption(WORDS);
  }

  public static String industry() {

    return selectRandomOption(INDUSTRY);
  }

  public static String maritalStatus() {

    return selectRandomOption(MARITAL_STATUS);
  }

  private static String selectRandomOption(String[] options) {

    int index = random.nextInt(options.length);
    return options[index];
  }


}