package modele.decoration;

import modele.Message;

public class ChiffreurMessage extends Message {
    private Message message;
    private String chiffrement;
    private int decalage = 13;

    public ChiffreurMessage(Message message) {
        this.message = message;
        this.chiffrer();
    }

    @Override
    public String getTexte() {
        return chiffrement;
    }

    private void chiffrer() {
        StringBuilder messageChiffré = new StringBuilder();
        for (char msg : message.getTexte().toCharArray()) {
            messageChiffré.append((char)(msg + decalage));
        }
        this.chiffrement = messageChiffré.toString();
    }
}
