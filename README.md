# Count Words Coding Assignment

## Getting Started

### Dependencies
- Java 15

### Executing Program
1. Run ```./mvnw spring-boot:run```
2. Open up a browser and navigate to http://localhost:8080

### Functionality Supported
1. Counts and returns the NUMBER of words (i.e. Strings) that starts with a specified letter. It is not case-sensitive.

Endpoint ```/api/breakdown/startingLetter/{letter}```

For example, if you wish to count and return the number of words starting with "m" or "M", you can either
access the result from:

- ```http://localhost:8080/api/breakdown/startingLetter/m```

or 

- ```http://localhost:8080/api/breakdown/startingLetter/M```

2. Returns all words longer than specified number of characters

Endpoint ```/api/breakdown/moreLettersThan/{number}```

For example, if you wish to return all the words longer than 5 characters, then you can access the result from:

- ```http://localhost:8080/api/breakdown/moreLettersThan/5```

### Executing Tests
1. Run ```./mvnw test```

## Areas of improvement for the future
- Currently, there is a default dictionary that the endpoints reads from, which is `dictionary1.txt`, located in the resources file. Thus, it does not currently support functionality to specify which file to read from in the endpoints, however, this can easily be arranged. It was initially designed like this for convenience purposes.
