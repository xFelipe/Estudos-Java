
package idiomasistema;

import java.util.Locale;

public class IdiomaSistema {

    
    public static void main(String[] args) {

       
        Locale loc = Locale.getDefault();
        
        System.out.println(loc.getDisplayLanguage());
        System.out.println(loc.getLanguage());
        
        
        System.out.println(System.getProperty("user.language"));
        
    }
    
}
