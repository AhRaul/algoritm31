package com.example.erphome;

//имеются файлы, название файла это - дата и время в формате дд.мм.гг_чч.мм
//содержание файла это - напоминание.
public interface Note {
    String getNote(String date);
}
