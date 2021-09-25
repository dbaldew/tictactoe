package nl.novi.tictactoe;

//Class are a blueprint or a set of instructions to build a specific type of object.
public class Player {

    //initialize variables for class Player
    //gebruikelijk is om alle velden private te maken

    private String name;
    private String token;
    private int score;

    //constructor : assign properties to class with .this
    //public betekent: toegankelijk voor ieder die een instantie van dit object heeft
    //private: alleen toegankelijk binnen de eigen klasse

    public Player(String name, String token){
        this.name = name;
        this.token = token;
        this.score = 0;
    }

    //Class methods: included methods that operate on this class
    //getters en setters are entry points for anything outside of the class to get or set the values inside the class
    //therefore getters and setters are always public

    public int getScore(){
        //return this.score; kan verkort worden tot:
        return score;
    }
    public String getName(){
        //return this.name;
        return name;
    }
    public String getToken(){
        //return this.token;
        return token;
    }
    //Een setter methode: return altijd void
    //heeft altijd 1 parameter met dezelfde naam als het attribuut waarvan de waarde in de methode veranderd wordt.
    // De naam begint altijd met set vervolgd door de naam van het attribuut (met een hoofdletter).
    public void setScore(int extraPoints){
        score = score + extraPoints;
    }

}
