package com.example.chemestriygame;

import java.util.ArrayList;

public class DAQuestion {

   private ArrayList<Question> questions = new ArrayList<>();
    public DAQuestion (){
        questions.add(new Question("What is the state of the element hydrogen ?"));
        questions.add(new Question("Which is the symbol of Iron ?"));
        questions.add(new Question("What is the chemical formula for water ?"));
        questions.add(new Question("What is the normal state of water ?"));
        questions.add(new Question("What is the symbol of Chlorine ?"));
    }

    public ArrayList<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(ArrayList<Question> questions) {
        this.questions = questions;
    }
}
