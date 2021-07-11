package nl.novi.tictactoe;

//Class are a blueprint or a set of instructions to build a specific type of object.
public class Player {

    //field , ook wel attributen genoemd
    //waarden parameters worden hierin opgeslagen
    //gebruikelijk is om alle velden private te maken
    private String name;
    private String token;
    private int score;

    //constructors : code that is used to create new objects and initialize the object’s attributes.
    //public betekent: toegankelijk voor ieder die een instantie van dit object heeft
    //private: alleen toegankelijk binnen de eigen klasse
    //.this verwijst naar het object dat op dat moment aangemaakt wordt
    public Player(String name, String token){
        this.name = name;
        this.token = token;
        this.score = 0;
    }

    //methoden, ook wel functies genoemd
    //altijd public
    //getters en setters zijn methoden die waarden ophalen uit een field of een waarde toewijzen aan een veld
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
