class DuplicateWord{    
    public static void main(String [] ak){    
        String string = "Finding duplicate words that are duplicate words";    
        int count;    
   
        string = string.toLowerCase();    
        String words[] = string.split(" ");    
            
        System.out.println("\nDuplicate words in a given string : ");     
        for(int i=0; i < words.length; i++){    
            count = 1;    
            for(int j = i+1; j < words.length; j++){    
                if(words[i].equals(words[j])){    
                    count++;      
                    words[j] = "0";    
                }    
            }
            
            if(count > 1 && words[i] != "0")    
                System.out.println(words[i]);    
        }    
    }    
}  