package oop.lesson16;

import java.util.Arrays;

public class EnumRunner {
    public static void main(String[] args) {
        ProccesorType proccesorType = ProccesorType.BIT_32;
        System.out.println(proccesorType);
        System.out.println(proccesorType.name());
        System.out.println(proccesorType.toString());
        System.out.println(ProccesorType.valueOf("BIT_32"));
        System.out.println(Arrays.toString(ProccesorType.values()));
        System.out.println(ProccesorType.BIT_32.ordinal());
        System.out.println(proccesorType.getName());
        System.out.println(proccesorType.getDescription());
    }
}
