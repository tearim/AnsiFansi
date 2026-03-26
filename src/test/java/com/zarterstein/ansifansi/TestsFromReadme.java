package com.zarterstein.ansifansi;

public class TestsFromReadme {
    public static void main(String[] args) {

        System.out.println(Ansi.red("Error: Something went wrong"));
        System.out.println(Ansi.green("Success: Operation completed"));
        System.out.println(Ansi.bBlue("Info: This is bold blue"));
        System.out.println(Ansi.bYellow("Warning: Check your input"));

        System.out.println("\n\n\n\n\n");

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
