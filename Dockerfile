# Step 1: Use Java 17 JDK image
FROM eclipse-temurin:17-jdk

# Step 2: Set working directory inside container
WORKDIR /app

# Step 3: Copy all project files into container
COPY . .

# Step 4: Install Maven wrapper if it exists, otherwise install Maven
RUN apt-get update && apt-get install -y maven

# Step 5: Build the Spring Boot app
RUN mvn clean package -DskipTests

# Step 6: Run the app
CMD ["java", "-jar", "target/eccomercesspringboot-0.0.1-SNAPSHOT.jar"]