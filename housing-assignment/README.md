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

## Project Structure

- `housing-assignment/src/` - Source files
- `housing-assignment/bin/` - Compiled class files
