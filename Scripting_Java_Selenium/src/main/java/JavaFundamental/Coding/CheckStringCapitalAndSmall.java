package JavaFundamental.Coding;

public class CheckStringCapitalAndSmall {
    public static void main(String[] args){
        String str = "abc";
        int capitalCount = 0;
        int smallCount = 0;
        for(int i=0; i < str.length(); i++){
//            if(Character.isUpperCase(str.charAt(i))){
//                capitalCount++;
//            }else{
//                smallCount++;
//            }
            char ch = str.charAt(i);
            if(ch>='A' && ch <= 'Z'){
                capitalCount++;
            }else{
                smallCount++;
            }
        }
        System.out.println("Number of UpperCase " + capitalCount);
        System.out.println("Number of LowerCase " + smallCount);
    }

}
