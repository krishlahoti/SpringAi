package com.example.springai.SpringAI.nonreactive;

import java.util.List;

public class ChatResponse {

    private List<Choice> choices;

    // constructors, getters and setters
    
    public static class Choice {

        private int index;
        private Message message;

        // constructors, getters and setters

        public Choice(int index, Message message) {
            this.index = index;
            this.message = message;
        }

        public int getIndex() {
            return index;
        }

        public void setIndex(int index) {
            this.index = index;
        }

        public Message getMessage() {
            return message;
        }

        public void setMessage(Message message) {
            this.message = message;
        }
    }

    public List<Choice> getChoices() {
        return choices;
    }

    public void setChoices(List<Choice> choices) {
        this.choices = choices;
    }
}
