Define a enviroment variable <i>expense.range-low</i> as a enviroment variable to overrides its values in application.properties and .env file using this command:

```
./mvnw clean package \
&& EXPENSE_RANGE_LOW=700 \
java -jar -Dquarkus.profile=dev \
target/quarkus-app/quarkus-run.jar 680
```

./mvnw -> Maven Wrapper from Quarkus project
If you have maven installed on your computer you change use <i>mvn</i> instead <i>./mvnw</i>
