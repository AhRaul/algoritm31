package com.example.erphome;

public class CreateNoteFactory implements NoteFactory {

    @Override
    public Note createNote() {
        return new ExNote();
    }
}
