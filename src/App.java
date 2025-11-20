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
		
	}

}
