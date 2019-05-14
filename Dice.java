import java.util.Random;
public class Dice {
    int value; // Value of the Dice
    
   // Initalize with a value the default no-arg will be used mostly  
    Dice(int value) {
        this.value = value;         
    }

    // Rolls the dice by changing the value of the class using the random class 0-5 
    public void rollDice() {
        Random i = new Random();
        this.value = i.nextInt(6);  
    }

}
