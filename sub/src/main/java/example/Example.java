package example;

import com.google.common.base.Joiner;

public class Example {

    public static String join(String... args){
        if (true) {
            System.out.println("boom");
        }
        return Joiner.on(' ').join(args);
    }
    @Override
    public boolean equals(Object obj) {
        return ((Example)obj) == this;
    }
}
