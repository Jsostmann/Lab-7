/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg7;


/**
 *
 * @author jamesostmann
 */
public class Card implements Comparable<Card> {

    private String color;
    private String value;

    public Card() {
        this(null, null);
    }

    public Card(String color, String value) {
        this.color = color;
        this.value = value;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.color + "," + this.value;
    }

    @Override
    public int compareTo(Card other) {
        
        int colorComparator = this.getColor().compareTo(other.getColor());
        int valueComparator = this.getValue().compareTo(other.getValue());
        
        boolean equalColor = colorComparator == 0;
        boolean equalValue = valueComparator == 0;
        
        if(equalColor) {
            
            if(equalValue) {
                
                return 0;
            
            }
            
            return valueComparator;
        }
        
        return colorComparator;
        
    }
   /* @Override
    public int compareTo(Card o) {

        int firstComparator = this.getColor().compareTo(o.getColor());
        int secondComparator = this.getValue().compareTo(o.getValue());
        
        if (firstComparator == 0) { //this color == other color

            
            if (secondComparator == 0) { // this value == other value

                return 0;

            } else if (secondComparator < 0) { // this value < other value

                return 1;

            } else { // this value > other value
                
                return -1;
            }
            
        } else if(firstComparator < 0) { // this color < other color
            
            if (secondComparator == 0) {

                return 0;

            } else if (secondComparator < 0) {

                return 1;

            } else {
                
                return -1;
            }
          
        
        } else { // this color > other color
        
            if (secondComparator == 0) {

                return 0;

            } else if (secondComparator < 0) {

                return 1;

            } else {
                
                return -1;
            }
        
        }

    }
*/

}
