package modele.decoration;

import modele.Message;

public class EncodeurDeMessage extends Message {
	private Message message;
    private String code;

    public EncodeurDeMessage(Message message) {
        this.message = message;
        this.encoder();
    }

 

	@Override
    public String getAuteur() {
        return message.getAuteur();
    }

    @Override
    public String getTexte() {
        return code;
    }
    
    private void encoder() {
 		String texte = message.getTexte();
 		
 		String inversion = new StringBuffer(texte).reverse().toString();
 		
 		StringBuilder messageADecale = new StringBuilder();
        for (char msg : inversion.toCharArray()) {
            messageADecale.append((char)(msg + 2));
        }
 		String messageDecale = messageADecale.toString();
 		
 		
 		byte[] octets = messageDecale.getBytes();
		byte[] nouvelles = new byte[octets.length];
		
		for (int position = 0; position < octets.length; position++) {
			byte octet = octets[position];
			byte nouveau = (byte)(octet ^ 'X');
			nouvelles[position] = nouveau;
		  }
		
		this.code = new String(nouvelles);
 	}

}
