package com.example.erphome;

import java.io.FileReader;
import java.io.IOException;

public class ExNote implements Note {

    @Override
    public String getNote(String date) {
        try(FileReader reader = new FileReader(date + ".txt"))
        {
            // читаем посимвольно
            int c;
            while((c=reader.read())!=-1){

                System.out.print((char)c);
                return String.valueOf((char)c);
            }
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
        return null;
    }
}
