package com.java8.eg.Records;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface LogParameters {
    boolean enabled() default true;
}

class MyClass {

    @LogParameters
    public void myMethod(String param1, int param2) {
        System.out.println("Executing myMethod with parameters: " + param1 + ", " + param2);
    }
}

public class AnnotationTest {
    public static void main(String[] args) throws Exception {
        MyClass obj = new MyClass();
        Method method = obj.getClass().getMethod("myMethod", String.class, int.class);

        // Check if the method has the LogParameters annotation
        if (method.isAnnotationPresent(LogParameters.class)) {
            LogParameters annotation = method.getAnnotation(LogParameters.class);

            // If annotation is enabled, print the parameters
            if (annotation.enabled()) {
                Object[] parameters = { "Hello", 42 }; // Example parameters
                method.invoke(obj, parameters);
            } else {
                // Invoke method without printing parameters
                method.invoke(obj, "Hello", 42);
            }
        } else {
            // If method doesn't have the annotation, invoke it normally
            method.invoke(obj, "Hello", 42);
        }
    }
}
