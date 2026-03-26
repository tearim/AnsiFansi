package com.zarterstein.ansifansi;

public class ConsoleTests {
    /**
     * Simple console test to verify ANSI color output. This is not a unit test but a manual check to see if the colors render correctly in the console.
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Testing ANSI color output:");
        System.out.println(Ansi.red("This should be red"));
        System.out.println(Ansi.green("This should be green"));
        System.out.println(Ansi.blue("This should be blue"));
        System.out.println(Ansi.yellow("This should be yellow"));
        System.out.println(Ansi.black("This should be black"));
        System.out.println(Ansi.white("This should be white"));
        System.out.println(Ansi.bold("This should be bold"));
        System.out.println(Ansi.bGreen("This should be in Bold Green"));
    }
}
