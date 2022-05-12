package prog_1.eliza_project;

import java.util.Random;

public class PromptBank {

    String[] questions;
    String[] statements;

    public PromptBank() {
        questions = new String[4];
        statements = new String[4];
    }

    public void populateStatementsArray() {
        statements[0] = "Tell me more about BLANK1 and BLANK2.";
        statements[1] = "BLANK1 seems important to you, so does BLANK2. Please tell me more.";
        statements[2] = "BLANK1 and BLANK2 seem to be on your mind. Let's talk about it.";
        statements[3] = "Oh... I am now interested to learn more about BLANK1 and BLANK2. This will be exiting!!";
    }

    public void populateQuestionsArray() {
        questions[0] = "Is there anything else about BLANK1 and BLANK2?";
        questions[1] = "Does BLANK1 bother you? How about BLANK2?";
        questions[2] = "Are BLANK1 and BLANK2 things you think about often?";
        questions[3] = "What do you like about BLANK1 and BLANK2?";
    }

    public String getRandomStatementTrunk() {
        populateStatementsArray();
        return statements[new Random().nextInt(statements.length)];
    }

    public String getRandomQuestionTrunk() {
        populateQuestionsArray();
        return questions[new Random().nextInt(questions.length)];
    }

    public String question(String str) {
        String[] words = str.split(" ");
        String blank1 = words[0];
        String blank2 = words[words.length - 1].substring(0, words[words.length - 1].length() - 1);
        return getRandomQuestionTrunk().replace("BLANK1", blank1).replace("BLANK2", blank2);
    }

    public String statement(String str) {
        String[] words = str.trim().split(" ");
        String blank1 = words[0];
        String blank2 = words[words.length - 1].substring(0, words[words.length - 1].length() - 1);
        return getRandomStatementTrunk().replace("BLANK1", blank1).replace("BLANK2", blank2);
    }
}
