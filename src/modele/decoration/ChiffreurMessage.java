package modele.decoration;

import modele.Message;

public class ChiffreurMessage extends Message {
    private Message message;
    private String chiffrement;
    private int decalage = 5;

    public ChiffreurMessage(Message message) {
        this.message = message;
        this.chiffrer();
    }

    @Override
    public String getTexte() {
        return chiffrement;
    }

    private void chiffrer() {
        StringBuilder messageChiffre = new StringBuilder();
        for (char msg : message.getTexte().toCharArray()) {
            messageChiffre.append((char)(msg + decalage));
        }
        this.chiffrement = messageChiffre.toString();
    }
}
