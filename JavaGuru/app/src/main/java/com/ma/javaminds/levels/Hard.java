package com.ma.javaminds.levels;

public class Hard {

    public static String questions[] = {
            "What is the output of the following code?\n\n```java\npublic class Example {\n    public static void main(String[] args) {\n        int x = 5;\n        System.out.println(x++ + ++x);\n    }\n}\n```",

            "What is the output of the following code?\n\n```java\npublic class Example {\n    public static void main(String[] args) {\n        int x = 10;\n        System.out.println(x-- - --x + x++ + x);\n    }\n}\n```",

            "What is the output of the following code?\n\n```java\npublic class Example {\n    public static void main(String[] args) {\n        int x = 3;\n        System.out.println(++x * 5 / x-- + --x);\n    }\n}\n```",

            "What is the output of the following code?\n\n```java\npublic class Example {\n    public static void main(String[] args) {\n        int x = 8;\n        System.out.println(x++ + --x * x-- - x);\n    }\n}\n```",

            "What is the output of the following code?\n\n```java\npublic class Example {\n    public static void main(String[] args) {\n        int x = 2, y = 5;\n        System.out.println(x += x * y + y);\n    }\n}\n```",

            "What is the output of the following code?\n\n```java\npublic class Example {\n    public static void main(String[] args) {\n        int x = 4, y = 7;\n        System.out.println(x += y -= x * 2 + y);\n    }\n}\n```",

            "What is the output of the following code?\n\n```java\npublic class Example {\n    public static void main(String[] args) {\n        int x = 3;\n        System.out.println(x *= x + 2);\n    }\n}\n```",

            "What is the output of the following code?\n\n```java\npublic class Example {\n    public static void main(String[] args) {\n        int x = 5;\n        System.out.println(x /= 2 + 1);\n    }\n}\n```",

            "What is the output of the following code?\n\n```java\npublic class Example {\n    public static void main(String[] args) {\n        int x = 6, y = 3;\n        System.out.println(x %= y *= 2);\n    }\n}\n```",

            "What is the output of the following code?\n\n```java\npublic class Example {\n    public static void main(String[] args) {\n        int x = 2;\n        System.out.println(x ^= x++ * 3 + ++x);\n    }\n}\n```",

            "What is the output of the following code?\n\n```java\npublic class Example {\n    public static void main(String[] args) {\n        int x = 4;\n        System.out.println(x &= x | 2);\n    }\n}\n```",

            "What is the output of the following code?\n\n```java\npublic class Example {\n    public static void main(String[] args) {\n        int x = 8;\n        System.out.println(x >>= 2 + 1);\n    }\n}\n```",

            "What is the output of the following code?\n\n```java\npublic class Example {\n    public static void main(String[] args) {\n        int x = -5;\n        System.out.println(x >>>= 2);\n    }\n}\n```",

            "What is the output of the following code?\n\n```java\npublic class Example {\n    public static void main(String[] args) {\n        int x = 7;\n        System.out.println(x <<= 2);\n    }\n}\n```",

            "What is the output of the following code?\n\n```java\npublic class Example {\n    public static void main(String[] args) {\n        int x = 10;\n        System.out.println(~x);\n    }\n}\n```",

            "What is the output of the following code?\n\n```java\npublic class Example {\n    public static void main(String[] args) {\n        boolean x = true, y = false;\n        System.out.println(x && y || !(x || y));\n    }\n}\n```",

            "What is the output of the following code?\n\n```java\npublic class Example {\n    public static void main(String[] args) {\n        boolean x = false, y = true;\n        System.out.println(x && y || !(x && y));\n    }\n}\n```",

            "What is the output of the following code?\n\n```java\npublic class Example {\n    public static void main(String[] args) {\n        int x = 5;\n        System.out.println(x > 2 ? x < 4 ? 10 : 8 : 7);\n    }\n}\n```",

            "What is the output of the following code?\n\n```java\npublic class Example {\n    public static void main(String[] args) {\n        int x = 7;\n        System.out.println(x > 5 ? x < 10 ? 1 : 0 : -1);\n    }\n}\n```",

            "What is the output of the following code?\n\n```java\npublic class Example {\n    public static void main(String[] args) {\n        int x = 3;\n        System.out.println(x > 2 ? x < 4 ? 1 : 2 : 3);\n    }\n}\n```"
    };
    public static String[][] choices = {
            {"8", "10", "11", "12"},
            {"13", "20", "8", "24"},
            {"16", "15", "5", "11"},
            {"-11", "-16", "16", "5"},
            {"14", "12", "18", "10"},
            {"-5", "-6", "-8", "15"},
            {"15", "12", "9", "5"},
            {"2", "1", "5", "3"},
            {"0", "1", "2", "3"},
            {"14", "12", "10", "8"},
            {"6", "4", "2", "0"},
            {"4", "2", "1", "8"},
            {"-8", "8", "2", "-2"},
            {"-5", "-2", "-1", "5"},
            {"-8", "-4", "-2", "7"},
            {"-11", "-10", "11", "10"},
            {"true", "false", "1", "0"},
            {"true", "false", "1", "0"},
            {"8", "7", "1", "2"},
            {"1", "0", "-1", "7"},
            {"2", "1", "3", "7"}
    };
    public static String[] answers = {
            "13",
            "20",
            "8",
            "24",
            "16",
            "-5",
            "15",
            "1",
            "0",
            "14",
            "0",
            "1",
            "1073741822",
            "-8",
            "-11",
            "true",
            "true",
            "8",
            "1",
            "2"
    };
}
