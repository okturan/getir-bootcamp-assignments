## Running the Application

### Using Make (Recommended)

Make provides a platform-independent way to build and run the application without requiring executable permissions on scripts.

```bash
# Build and run the application
make

# Clean the build directory
make clean

# Only compile the source files
make compile

# Run the application (if already compiled)
make run

# Run without recompiling
make run-only
```

### Using Java Directly

If you don't have Make installed, you can still build and run the application using Java commands:

```bash
# Create bin directory if it doesn't exist
mkdir -p housing-assignment/bin

# Compile the sources
find housing-assignment/src -name "*.java" | xargs javac -d housing-assignment/bin

# Run the application
java -cp housing-assignment/bin com.housingapp.Main
```

### Using the build.sh Script

The project includes a convenient build script that compiles and runs the application:

```bash
# Make the script executable (first time only)
chmod +x housing-assignment/build.sh

# Run the script
./housing-assignment/build.sh
```

### Using a One-Liner Command

For a quick compile and run in a single command:

```bash
cd housing-assignment && javac -d bin src/com/housingapp/Main.java src/com/housingapp/*/*.java && java -cp bin com.housingapp.Main
```

### Creating a JAR File

Create a JAR file to package the application for easy distribution and execution:

```bash
# Compile first
mkdir -p housing-assignment/bin
find housing-assignment/src -name "*.java" | xargs javac -d housing-assignment/bin

# Create a manifest file
echo "Main-Class: com.housingapp.Main" > housing-assignment/manifest.txt

# Create JAR file
cd housing-assignment && jar cvfm HousingApp.jar manifest.txt -C bin .

# Run the JAR file
java -jar housing-assignment/HousingApp.jar
```

### Using an IDE

Import the project into your favorite Java IDE:
- IntelliJ IDEA
- Eclipse
- VS Code with Java extensions

Then run the main class `com.housingapp.Main` from within your IDE.

## Project Structure

- `housing-assignment/src/` - Source files
- `housing-assignment/bin/` - Compiled class files
