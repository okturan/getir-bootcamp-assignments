## Example Output

```bash
===== TOTAL PRICES =====
Total price of all Houses:              ₺10.500.000
Total price of all Villas:              ₺24.000.000
Total price of all Summer Houses:       ₺16.000.000
Total price of all types of properties: ₺50.500.000

===== AVERAGE SQUARE METERS =====
Average square meters of Houses:                  140.00 m²
Average square meters of Villas:                  300.00 m²
Average square meters of Summer Houses:           200.00 m²
Average square meters of all types of properties: 213.33 m²

===== FILTERED PROPERTIES =====
Properties with 3 rooms and 1 living room:
        House [price=3.000.000, squareMeters=120, numberOfRooms=3, numberOfLivingRooms=1]
        House [price=3.500.000, squareMeters=140, numberOfRooms=3, numberOfLivingRooms=1]

Properties with 4 rooms and 1 living room:
        House [price=4.000.000, squareMeters=160, numberOfRooms=4, numberOfLivingRooms=1]
        SummerHouse [price=4.500.000, squareMeters=180, numberOfRooms=4, numberOfLivingRooms=1]
        SummerHouse [price=5.000.000, squareMeters=200, numberOfRooms=4, numberOfLivingRooms=1]

Properties with 5 rooms and 2 living rooms:
        Villa [price=7.000.000, squareMeters=250, numberOfRooms=5, numberOfLivingRooms=2]
        SummerHouse [price=6.500.000, squareMeters=220, numberOfRooms=5, numberOfLivingRooms=2]

Properties with 10 rooms and 5 living rooms:
        No properties found with these criteria
```

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
