package com.github.fge.jsonschema.examples;

public class Test {
    static float balance = 0.0f;
    static float rate = 1 + ((7.1f - 5.6f) * 2 - 0.2f) / 100f; //1.029f;

    public static void main(String[] args) {
        float origin = 1000000;

        int loop = 365 / 11;

        for (int i = 0; i <loop; i++) {
            origin = computer(origin);
        }

        System.out.println(origin + balance);
        System.out.println((origin + balance) / 1000000);
    }

    public static float computer(float origin) {
        balance = balance + origin % 1000;

        origin = origin - origin % 1000;

        return origin * rate;
    }
}
