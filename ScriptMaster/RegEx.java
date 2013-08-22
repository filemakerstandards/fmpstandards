// Needs documentation about use
import java.util.regex.*;String regex = pattern;
Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE | Pattern.MULTILINE | Pattern.DOTALL);
Matcher matcher = pattern.matcher(text);
List result = new LinkedList();
while (matcher.find()) { result.add( matcher.group(1) );}
return result;