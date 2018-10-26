
/**
 * 
 * Classe: Principal <br/>
 * 
 * Compren un "main" que mostra el funcionament de la classe "Stack".
 * 
 * @author Xavi Sole - xsole@salleurl.edu
 * @author <br/>Eduard de Torres - edetorres@salleurl.edu
 * @version 24/10/2016
 *  
 */
public class Principal {
	/**
	 * Procediment principal que ilustra el funcionament de la pila.
	 */
	public static void main(String[] args) {
		// Creem una pila de 5 elements
		StackLinkedList p = new StackLinkedList();
		
		// Mostrem la pila creada
		System.out.println("\nMostrem la pila");
		p.show();

		// Comprovem si est� o no buida
		System.out.println("\nEsta buida la pila? "+p.isEmpty());
		
		// Omplim la pila
		for (int i=0; i<5; i++) {
			p.push(i+1);
		}
		
		// Mostrem la pila un cop plena
		System.out.println("\nMostrem la pila");
        p.show();
		// Intentem fer un altre push
		System.out.println("\nIntentem fer un altre push");
		p.push(6);
		// Consultem el top de la pila
		System.out.println("\nConsultem el top de la pila");
		System.out.println("El top de la pila: "+p.top());
		
		// Fem un pop
		System.out.println("\nFem un pop");
		p.pop();
		// Mostrem la pila
		System.out.println("\nMostrem la pila");
        p.show();
		
		// Consultem el top de la pila
		System.out.println("\nEl top de la pila: "+p.top());
		// Consultem el top de la pila
		System.out.println("\nEsta buida la pila? "+p.isEmpty());

		System.out.println("Fem 5 pops...");
		// Buidem la pila fent pops
		p.pop();
		p.pop();
		p.pop();
		p.pop();
		p.pop();
		// Consultem el top de la pila
		System.out.println("\nEsta buida la pila? "+p.isEmpty());
	}
}