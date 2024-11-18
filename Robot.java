public class Robot
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    private String name;
    private int xPosition;
    private int yPosition;
    private String colourBody;
    public final static int MIN_NAME_LENGTH= 3; 
    public final static int MIN_POSITION= -10; 
    public final static int MAX_POSITION= 10;
    public static int numberOfUnnamedRobots = 1;
    
    private CanvasRobot canvasRobot;
    
    /**
     * Constructeur d'objets de classe Robot avec 2 paramètres
     * Pas d'initialisation des positions car elles sont générées aléatoirement
     */
    public Robot(String name, String colourBody) {
        setName(name);
        setColourBody(colourBody);
        canvasRobot = new CanvasRobot(this.colourBody);
        canvasRobot.drawRobot(xPosition,yPosition);

    }
    
    
    /**
     * Constructeur d'objets de classe Robot avec 4 paramètres
     */
    public Robot(String name, int xPosition, int yPosition, String colourBody) { // Correction ici
        setName(name); 
        setXPosition(xPosition); 
        setYPosition(yPosition);
        setColourBody(colourBody);
        canvasRobot = new CanvasRobot(this.colourBody);
        canvasRobot.drawRobot(xPosition,yPosition);

    }
    
    /**
     * Méthode pour définir le nom du robot
     */
    public void setName(String newName){
        newName = newName.trim();
        if (newName.length() >= MIN_NAME_LENGTH){
            this.name = newName;
        } 
        else{
            this.name = "iRobot" + numberOfUnnamedRobots;
            numberOfUnnamedRobots++;
        }
    }
    
    /**
     * Méthode pour obtenir le nom du robot
     */
    public String getName() {
        return name;
    }
    
    /**
     * Méthode pour définir la position x du robot
     */
    private void setXPosition(int newXPosition){
        if(newXPosition < MIN_POSITION || newXPosition > MAX_POSITION){
            this.xPosition = 0;
        }
        else{
            this.xPosition = newXPosition;
        }
    }
    
    /**
     * Méthode pour obtenir la position x du robot
     */
    public int getXPosition() {
        return xPosition;
    }
    
     /**
     * Méthode pour obtenir la position y du robot
     */
    public int getYPosition() {
        return yPosition;
    }
    
    /**
     * Méthode pour définir la position y du robot
     */
    private void setYPosition(int newYPosition){
        if(newYPosition < MIN_POSITION || newYPosition > MAX_POSITION){
            this.yPosition = 0;
        }
        else{
            this.yPosition = newYPosition;
        }
    }
    
    public void setColourBody(String nColor) {
    String[] validColors = {"RED", "BLACK", "BLUE", "YELLOW", "GREEN", "MAGENTA", "WHITE", "PURPLE"};
    String normalizedColor = nColor.toUpperCase();
    
    for (String validColor : validColors) {
        if (validColor.equals(normalizedColor)) {
            colourBody = normalizedColor;
            return; 
        }
        else {
            colourBody = "BLUE"; }
    }
    
  }
  
   public String getColourBody(){
    return colourBody;
  }
  
   public void move() 
    {
        if (xPosition < MAX_POSITION && yPosition < MAX_POSITION ) {
        
            yPosition ++;
            xPosition ++;
            canvasRobot.drawRobot(xPosition,yPosition);
    
        }

    }

 
}


