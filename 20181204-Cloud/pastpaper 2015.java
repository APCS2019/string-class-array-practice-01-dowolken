//pastpaper 2015 for practicing string and class
public class HiddenWord{
  private String str;
  public HiddenWord(String a){
    str=a;}
  public String getHint(String a){
    String hidden="";
    for(int i=0;i<a.length();i++){
      if((str.substring(i,i+1)).equals.(a.substring(i,i+1)))
      {hidden+=str.substring(i,i+1));}
      else(if(!str.indexOf(a.substring(i,i+1)))
           {hidden+="*";}
           else
           {hidden+="+";}
           }
     return hidden;
