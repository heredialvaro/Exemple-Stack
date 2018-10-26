import java.util.ArrayList;

/**
 * 
 * Classe: Stack <br/>
 * 
 * Implementa una pila estatica de numeros enters.
 * 
 * @author Xavi Sole - xsole@salleurl.edu
 * @author <br/>Eduard de Torres - edetorres@salleurl.edu
 * @version 24/10/2016
 *  
 */
public class Stack {
	
	/** Array amb els elements de la pila */
	private ArrayList<Integer> elements;
	
	/**
	 * Crea una pila de 10 posicions).
	 */
	public Stack() {
		elements = new ArrayList<Integer>();
	}
	
	/**
	 * Crea una pila de tantes posicions com s'indica per par�metres.
	 * 
	 * @param numElements Posicions de la pila.
	 */
	public Stack(int numElements) {
		elements = new ArrayList<Integer>(numElements);
	}
	
	/**
	 * Afegeix un element (enter) a la pila, si la pila est� plena, mostra un missatge 
	 * d'error per pantalla. 
	 * 
	 * @param element Element (enter) a inserir.
	 */
	public void push(int element) {
        elements.add(element);
	}
	
	/**
	 * Elimina el top de la pila, si la pila est� buida mostra un missatge d'error 
	 * per pantalla. 
	 */
	public void pop() {
		if (!elements.isEmpty()) {
            elements.remove(elements.size() - 1);
		} else {
			System.out.println("Error al fer pop, la pila est� buida!");
		}
	}
	
	/**
	 * Retorna el top del la pila (un enter). Si la pila est� buida mostra un missatge d'error
	 * per pantalla i retorna l'enter -1.
	 */
	public int top() {
		if (!elements.isEmpty()) {
            return elements.get(elements.size() - 1);
		} else {
			System.out.println("Error al fer top, la pila est� buida!");
			return -1;
		}
	}
	
	/**
	 * Retorna cert (true) si la pila est� buida, altrament fals (false).
	 */
	public boolean isEmpty() {
	    if(elements.isEmpty()) {
            return true;
        }
	    else{
	        return false;
        }
	}
	
	public void show() {
		System.out.print("[");
		for(int i=0; i < elements.size(); i++) {
			System.out.print(elements.get(i)+" ");
		}
		System.out.print("<--> IN/OUT\n");		
	}
}