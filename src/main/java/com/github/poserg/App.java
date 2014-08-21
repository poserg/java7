package com.github.poserg;

import java.io.BufferedReader;
import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class App
{
    public static void main( final String[] args )
    {
        try (BufferedReader reader = Files.newBufferedReader(Paths.get(App.class.getResource("/version.txt").toURI()),
                StandardCharsets.UTF_8)) {
            String line = reader.readLine();
            System.out.println("my version is : " + line);
        } catch (IOException | URISyntaxException e) {
            e.printStackTrace();
        }
    }
}
