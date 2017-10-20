class Cow implements Animal 
{     
     //your code here  
  private String mySound;
  private String myType;
  public Cow(String type, String sound)
  {
    myType = type;
    mySound = sound;
  }
  public Cow()
  {
    myType = "unknown";
    mySound = "unknown";
  }
  public String getSound()
  {
    return mySound;
  }
  public String getType()
  {
    return myType;
  }
}