package com.zarterstein.ansifansi;

/**
 * FansiConsoleTests - manual console smoke tests for Fansi behavior.
 *
 * <p>This class provides a lightweight manual verification harness for the
 * Fansi styling API. It is designed for interactive console testing, not
 * automated JUnit assertions. The goal is to confirm that chained styles,
 * color escape codes, reset behavior, and gradient operations print
 * visibly correct artifacts in terminals that support ANSI.</p>
 *
 * <p>Since Fansi is a richer and larger API than the simpler Ansi helper,
 * it should be validated under manual conditions in addition to automated
 * unit tests. Fansi includes multiple style/effect mode combinations that
 * may change output length and could expose edge-case formatting bugs.</p>
 */
public class FansiConsoleTests {
    /**
     * Runs console demonstration checks for Fansi.
     * @param args no arguments are required
     */
    public static void main(String[] args) {
        System.out.println("Fansi console compatibility test starting...");

        System.out.println(Fansi.create().red().bold().append("Bold red text").reset().render());
        System.out.println(Fansi.create().green(false).underline().append("Underline green text").render());
        System.out.println(Fansi.create().blue(true).append("Background blue text").reset().render());

        System.out.println(Fansi.create().RGB(255, 150, 0).append("Bright orange text").reset().render());
        System.out.println(Fansi.create().bRGB(0, 150, 255).append("Bright background cyan text").reset().render());

        System.out.println("Testing gradientFg:");
        System.out.println(Fansi.create().gradientFg("Gradient text example", "255;0;0", "0;0;255").reset().render());

        System.out.println("Testing gradientBg:");
        System.out.println(Fansi.create().gradientBg("Gradient background example", "0;255;0", "0;0;255").reset().render());

        System.out.println("Testing gradientBoth:");
        System.out.println(Fansi.create().gradientBoth("Gradient both example", "255;0;0", "0;255;0", "0;0;255", "255;255;0").reset().render());

        System.out.println("Fansi console compatibility test complete.");
    }
}
