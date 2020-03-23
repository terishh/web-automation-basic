package general;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class Logger {
  // Variables
  private SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");
  private final String INFO = "[INFO]";
  // Methods
  public void info(String str){
    output(infoContent(str));
  }
  public void compare(List<String> expected, List<String> actual) {
    output(compareContent(expected, actual));
  }
  // Private Methods
  private void output(String str){
    System.out.println(str);
  }
  private String getTime(){
    String date = sdf.format(new Date());
    return "[" + date + "]";
  }
  private String infoContent(String str){
    String INFO_ = INFO + ": ";
    return getTime() + INFO_ + str;
  }
  private String compareContent(List<String> expected, List<String> actual){
    String comparingStr = getTime() + INFO + "[COMPARING]";
    String expectedStr = getTime() + INFO + "[EXPECTED]: " + expected.toString();
    String actualStr = getTime() + INFO + "[ACTUAL]  : " + actual.toString();
    return comparingStr + "\n" + expectedStr + "\n" + actualStr;
  }
}
