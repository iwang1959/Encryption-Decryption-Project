class Main {
//level 1 shifts text up by 10 units
  public static String f1(String s){
    String result="";
    for(int x=0;x<s.length();x++){
      result+= (char)(s.charAt(x)+10);
    }
    return result;
  }
   //decryt 1
   public static String d1(String s){
    String result="";
    for(int x=0;x<s.length();x++){
      result+= (char)(s.charAt(x)-10);
    }
    return result;
  }


  //level 2 shifts text down by 5 letters
  public static String f2(String s){
    String result="";
    for(int x = 0; x<s.length();x++){
      result += (char)(s.charAt(x)-5);
    }
    return result;
  }
  //decryt 2 
    public static String d2(String s){
    String result="";
    for(int x = 0; x<s.length();x++){
      result += (char)(s.charAt(x)+5);
    }
    return result;
  }
  

  //level 3 multply text by 2
  public static String f3(String s){
    String result="";
    for(int x=0;x<s.length();x++){
      char mult = s.charAt(x);
      int ascii = mult*2; 
      result+=(char)ascii; 
    }     
    return result;
    }
    //decryt 3 
    public static String d3(String s){
    String result="";
    for(int x=0;x<s.length();x++){
      char divi = s.charAt(x);
      int ascii = divi/2; 
      result+=(char)ascii; 
    }     
    return result;
    }



  // level 4 Add a to every letter
  public static String f4(String s){
    String result="";
    for(int x=0;x<s.length();x++){
      String txt = s.substring(x,x+1);
      if(s.length()==s.length()){
        result+="a"+txt;
      }
    }     
    return result;
    }
    
  // decrypt 4
  public static String d4(String s){
    return s.replace("a","");
    }
   
  // level 5 reverse
  public static String f5(String s){
    String result="";
    for (int x=s.length()-1; x>=0; x--){ 
      char rev=s.charAt(x);
      int asc=rev;
      result+=(char)asc;
    }
    return result;
  }

  // decrypt 5 
  public static String d5(String s){
    String result="";
    for(int x=s.length()-1; x>=0; x--){ 
      char rev=s.charAt(x);
      int asc=rev;
      result+=(char)asc;
    }
    return result;
  }
  

  public static void main(String[] args) {
    String decision;
    System.out.println("If you want to encrpt or decrpt something else, change the text in line.txt");
    System.out.println("Press e to encrpt and press d to decrypt");
    decision=Input.readString();

    if(decision.toLowerCase().equals("e")){
      System.out.println("Select level(1-5) of encryption");
      int level = Input.readInt();
      if(level == 1){
        String file = Input.readFile("line.txt");
        System.out.println("Level 1 \n");
        file = f1(file);
        System.out.println(file);
      }else if(level == 2){
        String file2 = Input.readFile("line.txt");
        System.out.println("Level 2 \n");
        file2 = f2(file2);
        System.out.println(file2 );
      }else if(level == 3){
        String file3 = Input.readFile("line.txt");
        System.out.println("Level 3 \n");
        file3 = f3(file3);
        System.out.println(file3 );
      }else if(level == 4){
        String file4 = Input.readFile("line.txt");
        System.out.println("Level 4 \n");
        file4 = f4(file4);
        System.out.println(file4);
      }else if(level == 5){
        String file5 = Input.readFile("line.txt");
        System.out.println("Level 5 \n");
        file5 = f5(file5);
        System.out.println(file5 + "\n");
      }
    }

    if(decision.toLowerCase().equals("d")){
      System.out.println("Select level(1-5) of decryption");
      int level = Input.readInt();
      if(level == 1){
        String file = Input.readFile("line.txt");
        //System.out.println("Level 1 \n");
        file = f1(file);
        //System.out.println(file );
        String dd1 = d1(file);
        System.out.println(dd1 +"\n");
      }else if(level == 2){
        String file2 = Input.readFile("line.txt");
        //System.out.println("Level 2 \n");
        file2 = f2(file2);
        //System.out.println(file2 );
        String dd2 = d2(file2);
        System.out.println(dd2 +"\n");
      }else if(level == 3){
        String file3 = Input.readFile("line.txt");
        //System.out.println("Level 3 \n");
        file3 = f3(file3);
        //System.out.println(file3 );
        String dd3 = d3(file3);
        System.out.println(dd3 +"\n");
      }else if(level == 4){
        String line4 = Input.readFile("line.txt");
        System.out.println(line4);
      }else if(level == 5){
        String file5 = Input.readFile("line.txt");
        //System.out.println("Level 5 \n");
        file5 = f5(file5);
        //System.out.println(file5 + "\n");
        String dd5 = d5(file5);
        System.out.println(dd5);
      }
    }
    }
  


/*    //level1
    String line = Input.readFile("line.txt");
    String file = Input.readFile("line.txt");
    System.out.println("Level 1 \n");
    file = f1(file);
    System.out.println(file );
    String dd1 = d1(file);
    System.out.println(dd1 +"\n");
    //Input.writeFile("line.txt",file);
    //String file = Input.readFile("line.txt");

    //level2
    String line2 = Input.readFile("line.txt");
    String file2 = Input.readFile("line.txt");
    System.out.println("Level 2 \n");
    file2 = f2(file2);
    System.out.println(file2 );
    String dd2 = d2(file2);
    System.out.println(dd2 +"\n");


    // level 3
    //shift text up by.... 2!!! 
    String line3 = Input.readFile("line.txt");
    String file3 = Input.readFile("line.txt");
    System.out.println("Level 3 \n");
    file3 = f3(file3);
    System.out.println(file3 );
    String dd3 = d3(file3);
    System.out.println(dd3 +"\n");

//level 4
// shift text down by..... 2!!!
    String line4 = Input.readFile("line.txt");
    String file4 = Input.readFile("line.txt");
    System.out.println("Level 4 \n");
    file4 = f4(file4);
    System.out.println(file4);
    //String dd4 = d4(file4);
    System.out.println(line4);
    
    // level 5
    // change change text to ascii values
    String line5 = Input.readFile("line.txt");
    String file5 = Input.readFile("line.txt");
    System.out.println("Level 5 \n");
    file5 = f5(file5);
    System.out.println(file5 + "\n");
    String dd5 = d5(file5);
    System.out.println(dd5);
   
  }
}
*/
}

    