# AnsiFansi

A lightweight, dependency-free Java library for ANSI console styling and coloring. Perfect for enhancing terminal output in Java applications without external dependencies.

## Description

AnsiFansi provides two complementary APIs for ANSI escape code manipulation:

- **Ansi**: A simple, fast utility class with static methods for basic color and bold formatting.
- **Fansi**: A fluent, chainable API supporting advanced features like gradients, RGB colors, and complex text effects.

This library is designed for developers who want to add color and style to console output easily and efficiently.

## Features

- **Zero Dependencies**: Pure Java, no external libraries required.
- **Performance Optimized**: Ansi class offers minimal overhead for simple styling.
- **Rich Styling**: Fansi supports gradients, 256-color mode, true RGB, and text effects.
- **Fluent API**: Chain methods for expressive styling.
- **Maven Ready**: Easy integration via local Maven repository.

## Installation

Clone the repository and install to your local Maven repository:

```bash
git clone https://github.com/tearim/ansifansi.git
cd ansifansi
mvn install
```

Then add to your project's `pom.xml`:

```xml
<dependency>
    <groupId>com.zarterstein</groupId>
    <artifactId>ansifansi</artifactId>
    <version>1.0.0</version>
</dependency>
```

## Usage

### Ansi (Simple and Fast)

For basic coloring and bold text:

```java
import com.zarterstein.ansifansi.Ansi;

public class Example {
    public static void main(String[] args) {
        System.out.println(Ansi.red("Error: Something went wrong"));
        System.out.println(Ansi.green("Success: Operation completed"));
        System.out.println(Ansi.bBlue("Info: This is bold blue"));
        System.out.println(Ansi.bYellow("Warning: Check your input"));
    }
}
```

### Fansi (Advanced and Fluent)

For complex styling with chaining:

```java
import com.zarterstein.ansifansi.Fansi;

public class Example {
    public static void main(String[] args) {
        String styled = Fansi.create()
            .red()
            .bold()
            .append("Warning: ")
            .reset()
            .append("Check your input")
            .render();

        System.out.println(styled);

        // Gradients
        String gradient = Fansi.create()
                .gradientFg("Hello World", "255;0;0", "0;255;0")
                .render();

        System.out.println(gradient);

        String bGradient = Fansi.create()
                .gradientBg("Hello World (yet again)", "0;64;128", "128;255;255")
                .reset()
                .render();

        System.out.println(bGradient);
    }
}
```

Here is a screenshot from cmd, IntelliJ and VSCode. *Please note: VSCode sometimes can ignore foreground colors if it thinks that it will not be readable enough.*
<img width="1121" height="359" alt="image" src="https://github.com/user-attachments/assets/36ae4a42-1741-4753-827a-f2b9981eddf3" />


## API Reference

### Ansi Class

Static methods for wrapping text with ANSI codes:
- `red(String)`, `green(String)`, `blue(String)`, etc.
- `bold(String)`, `bRed(String)`, etc. (bold variants)

### Fansi Class

Fluent methods for building styled output:
- Color methods: `red()`, `green()`, `blue()`, etc.
- Effects: `bold()`, `italic()`, `underline()`, etc.
- Advanced: `RGB(int, int, int)`, `gradientFg(String, String, String)`
- Output: `render()`, `print()`, `println()`

See JavaDoc for complete method documentation.

## Testing

Run the included console tests to verify ANSI support in your terminal:

```bash
java -cp target/classes com.zarterstein.ansifansi.ConsoleTests
java -cp target/classes com.zarterstein.ansifansi.FansiConsoleTests
```

## Contributing

Contributions are welcome! Please submit issues and pull requests on GitHub.

## License

This project is open source. See LICENSE file for details.

## Credits

- Java code written by Mark Gondelman
- JavaDoc and README created with assistance from AI tools

*Note: The core Java implementation was developed without AI assistance. AI was used solely for generating JavaDoc comments and this README file.*
