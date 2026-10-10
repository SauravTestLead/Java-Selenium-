package JavaFundamental.Coding;

public class RemoveDuplicateNormal {
    public static void main(String [] args){
        String str = "Programming";
        StringBuilder res = new StringBuilder();
        Boolean [] see = new Boolean[256];

        for(char c :str.toCharArray()){
            if(!see[c]){
                res.append(c);
                see[c]= true;
            }
        }
        System.out.println("the remove duplicate :"+res.toString());
    }
}
