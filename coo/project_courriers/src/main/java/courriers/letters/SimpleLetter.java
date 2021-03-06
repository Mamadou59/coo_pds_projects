/**
 * 
 */
package courriers.letters;

import courriers.content.Text;
import courriers.inhabitant.Inhabitant;

/**
 * manage the simple letters those content a text
 * @author diallo and fungwa
 *
 */
public class SimpleLetter extends Letter<Text> {
	
	
	protected float COST = 0.5F;

	
	public SimpleLetter(Text content, Inhabitant sender, Inhabitant receiver) {
		super(content,sender, receiver);
	}
	
	/**
	 * the action to do when the letter is receiving by the inhabitant
	 */
	@Override
	public void action() {
		System.out.println(this.receivingDescription());
	}

	/**
	 * @return the cost of the letter
	 */
	@Override
	public float cost() {
		return COST;
	}
	
}
