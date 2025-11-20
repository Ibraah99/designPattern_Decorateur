import modele.Message;
import modele.decoration.*;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Message secret = new Message("Vive  L'HIVER");
		System.out.println(secret.getTexte());
		
		Message secretInverse = new InverseurDeMessage(secret);
		System.out.println(secretInverse.getTexte());
		
		Message doubleSecretInverse = new InverseurDeMessage(secretInverse);
		System.out.println(doubleSecretInverse.getTexte());
		
		Message messageRot1 = new RotateurDeLettre(doubleSecretInverse);
		System.out.println(messageRot1.getTexte());
		
		Message secret1 = new Message("Je connais l\'identite du flapacha !");
		System.out.println(secret1.getTexte());
		
		
		Message messageCrypte = new CrypteurXOR (secret1);
		System.out.println(messageCrypte.getTexte());
		
		Message messageDecrypte = new CrypteurXOR (messageCrypte);
		System.out.println(messageDecrypte.getTexte());
		
		Message messageChiffre = new ChiffreurMessage (secret1);
		System.out.println(messageChiffre.getTexte());
		
		Message secret2 = new Message("Bonjour Matane");
		System.out.println(secret2.getTexte());
		
		Message messageEncode = new EncodeurDeMessage(secret2);
		System.out.println(messageEncode.getTexte());
	}

}
