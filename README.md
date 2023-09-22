## DataFaker
* DataFaker is a versatile Java class designed to generate synthetic data for various use cases, including 
  testing, sample data generation, and prototyping. 
* This utility provides a wide range of data categories, from names and addresses to programming languages and more, making it a valuable tool for data-driven development.

### Table of Contents

- [Features](#features)
- [Usage](#usage)
- [Data Categories](#data-categories)
- [Example Usage](#example-usage)
- [Output Example](#output-example)
- [Contributing](#contributing)
- [License](#license)

### Features

- **Data Diversity**: 
  - Offers an extensive collection of data categories to suit your needs. Whether you require random names, addresses, or even superhero names, it has you covered.

- **Easy Integration**: 
  - Integrating DataFaker into your Java project is straightforward. 
  - Simply import the `DataFaker` class and start generating data with minimal setup.

- **Customization**:
  - Feel free to extend or modify the data categories within the class to align with your specific
    requirements.

### Usage

To use DataFaker in your Java project, follow these steps:
1. Clone or download the DataFaker repository.
2. Import the `DataFaker` class into your Java project.
3. Use the provided methods to generate random data as needed in your application.

### Data Categories
DataFaker can generate data in the following categories:
**Available Categories**
1. Address
2. Animal
3. Artist Names
4. Barcode
5. Beer
6. Book Titles
7. Business Companies
8. Buzzwords
9. Cat Breed
10. Color
11. Company Type
12. Currency
13. Date
14. Degree Subjects
15. Departments
16. Disease
17. Dog Breed
18. Educational Attainment
19. Educator Names
20. Famous Last Words
21. File Extensions
22. First Name
23. Full Name
24. Gender
25. Hobby
26. Hollywood Actor/Actress
27. Industry
28. Job
29. Jobs
30. Last Name
31. Marital Status
32. Materials
33. Music Styles
34. Nation
35. Nationality
36. Nouns
37. Numbers Written Out
38. Phone Number
39. Postal Code
40. Product Name Adjectives
41. Profession
42. Programming Language
43. Promotion Code Adjectives
44. Promotion Code Nouns
45. Random Double
46. Random Integer
47. Random Long
48. Random String Matching a Regex Pattern
49. SIN ID (ASIN)
50. SIN Number
51. Secondary Schools
52. SIC Code
53. Sport
54. Superhero
55. Team Names
56. Time
57. University Names
58. Verbs
59. Weather
60. Words


You can easily extend this class to include additional data categories or modify existing ones according to your needs.

### Example Usage

Here's a simple example of how to use `DataFaker`:

```java
public class ExampleUsage {

  public static void main(String[] args) {

    System.out.println("Generated Data:");

    // Generate a random first name
    String firstName = DataFaker.getFirstName();
    System.out.println("First Name: " + firstName);

    // Generate a random last name
    String lastName = DataFaker.getLastName();
    System.out.println("Last Name: " + lastName);

    // Generate a random full name
    String fullName = DataFaker.getFullName();
    System.out.println("Full Name: " + fullName);

    // Generate a random programming language
    String programmingLanguage = DataFaker.getProgrammingLanguage();
    System.out.println("Programming Language: " + programmingLanguage);

    // Add more data generation as needed...
  }
} 
```
### Output Example
![img.png](img.png)