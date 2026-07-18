# Getir Java Bootcamp — Housing Assignment

> **Status:** completed learning exercise. This repository is retained as a compact record of Java modeling and collection-processing practice; it is not a maintained product or reusable package.

The assignment models houses, villas, and summer houses, then calculates totals, averages, and room-count filters over a deterministic in-memory catalog.

## What it demonstrates

- A shared `Property` model with specialized `House`, `Villa`, and `SummerHouse` types.
- Repository, service, model, and formatting responsibilities separated into packages.
- Aggregate price and floor-area calculations across one type or the full catalog.
- Filtering by room and living-room counts, including an explicit empty result.
- Locale-aware Turkish-lira output.

## Run it

Requires a JDK. From the repository root:

```bash
cd housing-assignment
make
```

Without Make:

```bash
mkdir -p housing-assignment/bin
find housing-assignment/src -name '*.java' | xargs javac -d housing-assignment/bin
java -cp housing-assignment/bin com.housingapp.Main
```

The [assignment README](housing-assignment/README.md) contains the complete deterministic output and alternative build commands.

## Structure

```text
housing-assignment/
├── src/com/housingapp/model/       property types
├── src/com/housingapp/repository/  deterministic sample catalog
├── src/com/housingapp/service/     totals, averages, and filters
├── src/com/housingapp/util/        currency formatting
└── Makefile / build.sh             local build entry points
```

The repository intentionally has no release, package, hosted demo, or production database: those facilities would not improve the evidence supplied by this self-contained assignment.
