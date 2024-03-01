=class SqueakyClean {
    static String clean(String identifier) {

        identifier = identifier.replace(' ', '_');
        identifier = identifier.replace('3', 'e');
        identifier = identifier.replace('0', 'o');
        identifier = identifier.replace('7', 't');
        identifier = identifier.replace('1', 'l');
        identifier = identifier.replace('4', 'a');
        
        String newStr = "";
        
        for(int i = 0; i < identifier.length(); i++)
        {
            if(identifier.charAt(i) != '_' 
                    && identifier.charAt(i) != '-' 
                    && !Character.isLetter(identifier.charAt(i)))
                continue;
            
            if(identifier.charAt(i) == '-')
            {
                if(!(identifier.charAt(i+1) >= 65 && identifier.charAt(i+1) <= 90) )
            		newStr += (char)(identifier.charAt(i+1)-32);
            	else 
            		 newStr += identifier.charAt(i+1);
     
                i++;
            } 
            else {
                newStr += identifier.charAt(i);
            }
        }

        identifier = newStr; 
        return identifier;
    }
}
