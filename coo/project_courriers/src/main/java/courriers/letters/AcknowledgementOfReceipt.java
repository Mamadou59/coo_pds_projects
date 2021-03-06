/**
 * 
 */
package courriers.letters;

import courriers.content.Text;
import courriers.inhabitant.Inhabitant;

/**
 * @author diallo and fungwa
 *
 */
public class AcknowledgementOfReceipt extends SimpleLetter {

	public AcknowledgementOfReceipt(Text content, Inhabitant sender, Inhabitant receiver) {
		super(content, sender, receiver);
	}
	
	/**
	 * return the cost of the letter
	 */
	@Override
	public float cost() {
		return 0.0F;
	}
	
	/**
	 * @return the description of the letter
	 */
	public String description() {
		return super.description() + " of acknowledgment of receipt ";
	}

}
