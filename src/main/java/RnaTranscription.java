import java.util.HashMap;
import java.util.Map;

class RnaTranscription {

    String transcribe(String dnaStrand) {
        Map<String,String> strands = new HashMap<String, String>(){
            {
                put("G","C");
                put("C","G");
                put("T","A");
                put("A","U");
            }};

            String resultRNA = "";
            if(dnaStrand.length()==0)
                return "";
            else {
                for (int i = 0; i < dnaStrand.length(); i++) {
                    char ch = dnaStrand.charAt(i);
                    //System.out.println(strands.get()
                    resultRNA+=strands.get(Character.toString(ch))+"";

                }
            }

            //System.out.println("The resultant RNA is "+" "+resultRNA);
            return  resultRNA;

        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

}
