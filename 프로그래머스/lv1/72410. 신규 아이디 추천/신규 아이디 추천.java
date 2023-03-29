class Solution {
    public String solution(String new_id) {
        String answer = "";
        new_id=new_id.toLowerCase();//1단계
        new_id=new_id.replaceAll("[^a-z0-9-_.]",""); //2단계
        new_id=new_id.replaceAll("[.]{2,}","."); //3단계
        
        new_id=new_id.replaceAll("^[.]","");
        new_id=new_id.replaceAll("[.]$","");//4단계
        
        if(new_id.length()==0) //5단계
            new_id="a";
        
        if(new_id.length()>15){//6단계
            new_id = new_id.substring(0,15);
            new_id=new_id.replaceAll("[.]$","");
        }
        
        if(new_id.length()<=2){
            char last = new_id.charAt(new_id.length()-1);
            while(new_id.length()!=3){
                new_id+=last;
            }
        }
        
        answer=new_id;
        return answer;
    }
}