import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class ReverseString {
    public static void main(String[] args) {
        String name="java";
        String reverse = "";
        int length=name.length();
        for (int i=length-1;i>=0;i--){
            reverse=reverse+name.charAt(i);
        }
        System.out.println(reverse);
    }

}