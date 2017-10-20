class Chick implements Animal 
{//your code here
  private String mySound;
  private String myType;
  public Chick(String type, String sound, String sound2)
  {
    myType = type;
    if(Math.random() < 0.5)
      mySound = sound;
    else
      mySound = sound2;
  }
  public Chick()
  {
    myType = "unknown";
    mySound = "unkown";
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