# Java Housing App Makefile

# Define variables
PROJECTDIR = ./
SOURCEDIR = $(PROJECTDIR)/src
BINDIR = $(PROJECTDIR)/bin
MAIN_CLASS = com.housingapp.Main

# Default target
all: clean compile run

# Clean the bin directory
clean:
	@echo "Cleaning bin directory..."
	@rm -rf $(BINDIR)
	@mkdir -p $(BINDIR)

# Compile the source files
compile:
	@echo "Compiling Java sources..."
	@find $(SOURCEDIR) -name "*.java" | xargs javac -d $(BINDIR)

# Run the main class
run:
	@echo "Running application..."
	@java -cp $(BINDIR) $(MAIN_CLASS)

# Run only (if already compiled)
run-only:
	@java -cp $(BINDIR) $(MAIN_CLASS)

.PHONY: all clean compile run run-only
