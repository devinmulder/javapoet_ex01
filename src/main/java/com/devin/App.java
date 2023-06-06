package com.devin;

import com.squareup.javapoet.JavaFile;
import com.squareup.javapoet.MethodSpec;
import com.squareup.javapoet.TypeSpec;

import java.io.IOException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );


        MethodSpec methodSpec = MethodSpec.methodBuilder("getSuccess")
                .build();


        TypeSpec typeSpec = TypeSpec.classBuilder("Mudler")
                .addMethod(methodSpec)
                .build();


        try {
            JavaFile.builder("com.devin.generated", typeSpec)
                    .build()
                    .writeTo(System.out);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
