
# Domain-Specific Language for WordPress Plugin Scaffolding

## Description

This project focuses on creating a Domain-Specific Language (DSL) for the effortless generation of WordPress plugin scaffolding code. The DSL simplifies plugin development by specifying key plugin attributes such as name, author details, and operational views (admin, public, or both). By integrating the DSL with the WordPress Boilerplate Project, we aim to automate the initial setup process, catering to both novice and experienced WordPress developers. This approach streamlines the plugin creation process, reducing manual coding errors.

### Aim

Our aim is to provide an easy-to-use framework for WordPress plugin development that can significantly reduce time and effort in the initial stages of plugin creation. It's designed to handle common patterns in WordPress plugin development, ensuring comprehensive coverage of essential aspects like menu and settings configuration.

### Methodology

The project progresses through iterative stages, including requirement gathering, DSL design, model compiler development, and testing with real-world WordPress setups. We continuously incorporate feedback at each stage for improvement. Our methodology involves analyzing a variety of plugin examples to understand diverse requirements, ensuring that our DSL is robust and versatile.

### Technologies Used

- **Xtext**: Used for defining the DSL grammar.
- **Groovy**: Employs dynamic language features for scripting and tooling.
- **EMF (Eclipse Modeling Framework)**: Provides the data model for the DSL and tooling support.

## Usage

### Generating the Model

To generate the model, run the following file as "Generate XText Artifacts":

```
co7217.week18.entity.parent/co7217.week18.entity/src/main/java/co7217/week18/entity/generator/EntityGenerator_ExplicitTraversal_JavaClasses.groovy
```

### Location of `.dmodel` files

The `.dmodel` files are placed at:

```
co7217.week18.entity.parent/co7217.week18.entity/src/main/resources/week18
```

This directory already contains three sample `.dmodel` files.

### Output Location

The generated WordPress plugin files are located at:

```
co7217.week18.entity.parent/co7217.week18.entity/src/main/resources/week18/generated
```

### Generating WordPress Plugin Files

To generate the WordPress plugin files, run the following file as "Run as Java":

```
co7217.week18.entity.parent/co7217.week18.entity/src/main/java/co7217/week18/entity/generator/EntityGenerator_ExplicitTraversal_JavaClasses.groovy
```

### Project Zip Folder Structure

The zip folder for the project includes:
- Project folder
- Presentation slides
- `README.md` file

## Contributing

Contributions to this project are welcome. Please read the `CONTRIBUTING.md` for guidelines on how to submit pull requests and contribute to the project.

## License

This project is licensed under the [Your License Here] - see the `LICENSE.md` file for details.
