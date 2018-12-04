//pastpaper 2015 for practicing string and class
public class HiddenWord{
  private String puzzle;
  
  public HiddenWord(String a){
    puzzle=a;}
  
  public String getHint(String a){
    String hidden="";
    for(int i=0;i<a.length();i++){
      if((puzzle.substring(i,i+1)).equals.(a.substring(i,i+1)))
      {hidden+=puzzle.substring(i,i+1));}
      else(if(!puzzle.indexOf(a.substring(i,i+1)))
           {hidden+="*";}
           else
           {hidden+="+";}
           }
     return hidden;
           }
