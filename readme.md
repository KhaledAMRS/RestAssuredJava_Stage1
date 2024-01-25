# Project roadmap
- Create Maven project on IntelliJ.
- pom.xml - Add dependencies 
  - io.rest-assured » rest-assured
  - com.fasterxml.jackson.core » jackson-databind
  - io.cucumber » cucumber-java
  - io.cucumber » cucumber-testng
- src/main/resources/files
  - config.properties
- org.example.endpoints
  - Routes class
  - UsersEndPoints
- org.example.runners
  - TestRunners class
- org.example.utils 
  - RestAPIHelper class 
  - ConfigurationReader class
- org.example.pojo
  - LoginRequestBody class
- org.example.stepDefs
  - Create new object from LoginRequestBody and set request body values 
  - Create new object from ObjectMapper     -> com.fasterxml.jackson.databind.ObjectMapper
  - Declare String and serialize the loginrequestbody object to JSON
    String requestBody = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(loginrequestbody); 
  - Add headers using Map

        
> Map<String, String> headersMap = new HashMap<>();
> headersMap.put("Authorization","BearerToken");
> headersMap.put("Content-Type", "application/json");
> RestAssured.given().headers(requestHeaders);

<br>

> You can also use Headers
> Header requestHeader1 = new Header("someHeader","somevalue");
> Headers requestHeaders = new Headers(requestHeader1);
> RestAssured.given().headers(requestHeaders);


## Definitions
- **Abstraction:** hiding the implementation of internal details (complex and unnecessary details) and showing the functionality to the users
<br>
**Built-in Example:** 
<br>
**User-defined Example:**
<br>
<br>

- **Interface:** An interface looks similar to a class, meaning they are both can have Variables & Methods. 
  The methods in interface are abstract by default, meaning the internal details of this method are hidden.
<br>
**Built-in Example:** Response interface
<br>
**User-defined Example:**
<br>
<br>

- **Encapsulation:** When a class doesn't allow direct access to its private data, it's well-encapsulated.
  <br>
  **Built-in Example:** 
  <br>
  **User-defined Example:** Provide public setter and getter methods to modify and view the variables (which are declared as private) values.
  <br>
  <br>
