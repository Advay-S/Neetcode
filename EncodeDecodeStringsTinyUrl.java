package ArraysAndHashing;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;


public class EncodeDecodeStringsTinyUrl {

    private static final String CHARSET = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final BigInteger BASE = BigInteger.valueOf(CHARSET.length());

    public String encode(String longUrl) {
        if(longUrl == null || longUrl.isEmpty()){
            return "";
        }

        byte[] bytez = longUrl.getBytes(StandardCharsets.UTF_8);
        BigInteger num = new BigInteger(1, bytez);

        StringBuilder sb = new StringBuilder();

        while(num.compareTo(BigInteger.ZERO) > 0){
            BigInteger[] divmod = num.divideAndRemainder(BASE);
            sb.append(CHARSET.charAt(divmod[1].intValue()));
            num = divmod[0];
        }

        return sb.reverse().toString();
    }

    public String decode(String shortUrl) {

        if(shortUrl == null || shortUrl.isEmpty()){
            return  "";
        }

        BigInteger num = BigInteger.ZERO;
        for(int i = 0 ; i < shortUrl.length(); i++){
            num = num.multiply(BASE).add(BigInteger.valueOf(CHARSET.indexOf(shortUrl.charAt(i))));}

            byte[] decodedBYtes = num.toByteArray();

            if(decodedBYtes.length > 1 && decodedBYtes[0] == 0){
                byte[] trimmed = new byte[decodedBYtes.length -1];
                System.arraycopy(decodedBYtes, 1,trimmed ,0,trimmed.length);
                decodedBYtes = trimmed;



        }
        return new String(decodedBYtes, StandardCharsets.UTF_8);
    }
}