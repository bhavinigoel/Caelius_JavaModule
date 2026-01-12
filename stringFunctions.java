//length()
class LengthDemo{
  public static void main(string[] args){
    string s ="OpenAI";
    int count=0;
    for(char c:s.toCharArray()) count++;
    system.out.println("Length= " + s.length());
  }
}


// charAt()
class CharAtDemo {
    public static void main(String[] args) {
        String s = "Computer";
        System.out.println("Middle character: " + s.charAt(s.length()/2));
    }
}

//Concat

class ConcatDemo {
    public static void main(String[] args) {
        String first = "Data";
        String result = first.concat("Base");
        System.out.println(result);
    }
}

//Equals
class EqualsDemo {
    public static void main(String[] args) {
        String pwd = "admin123";
        String input = "admin123";
        System.out.println(pwd.equals(input) ? "Login Success" : "Login Failed");
    }
}

class EqualsIgnoreCaseDemo {
    public static void main(String[] args) {
        String city1 = "Delhi";
        String city2 = "DELHI";
        System.out.println(city1.equalsIgnoreCase(city2));
    }
}


class CompareToDemo {
    public static void main(String[] args) {
        String s1 = "Apple";
        String s2 = "Banana";
        System.out.println("Difference = " + s1.compareTo(s2));
    }
}

class SubstringDemo {
    public static void main(String[] args) {
        String email = "student@gmail.com";
        System.out.println("Username: " + email.substring(0, email.indexOf('@')));
    }
}

class IndexOfDemo {
    public static void main(String[] args) {
        String s = "Java Programming";
        System.out.println("Index of 'Programming' = " + s.indexOf("Programming"));
    }
}

class UpperCaseDemo {
    public static void main(String[] args) {
        String name = "rahul";
        System.out.println(name.toUpperCase());
    }
}

class LowerCaseDemo {
    public static void main(String[] args) {
        String word = "HELLO";
        System.out.println(word.toLowerCase());
    }
}

class TrimDemo {
    public static void main(String[] args) {
        String input = "   Java Exam   ";
        System.out.println("After trim: '" + input.trim() + "'");
    }
}






                      
