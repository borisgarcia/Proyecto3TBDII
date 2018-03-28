import java.io.*;
import java.net.*; 
public class EXTERNAL_FUNCTION{

    public static void main(String[] args)
    {
        System.out.println(Trim("HXOLA", "X")); 
    }

    public static int ping(String ipAddress) throws UnknownHostException, IOException
    {
        try{
            InetAddress inet = InetAddress.getByName(ipAddress);
            return (inet.isReachable(5000) ? 1 : 0);

        } catch (UnknownHostException e) {
            return 0;
        } catch (IOException e) {
            return 0;
        }
    }
    public static double PMT(double ti, int npr, double pv)
    {
        return  ((pv*ti)/(1 - (Math.pow((1 + ti), -npr))));
    }

    public static int BIN2DEC(String bin)
    {
        return Integer.parseInt(bin, 2);
    }

    public static String DEC2BIN(int num)
    {
        StringBuilder bin = new StringBuilder();
        while(num > 0)
        {
            bin.append(num%2);
            num = num/2;
        }
        return bin.reverse().toString();
    }

    public static int C2F(int c)
    { 
        return ((int)(c * 1.8) + 32);
    }

    public static int F2C(int f)
    { 
        return ((int)((f-32) *  0.5556));
    }

    public static int Factorial(int val)
    {
        int res = 1;  
        
        for(int x=1;x<=val;x++){    
            res=res*x;    
        }    
        return res;
    }

    public static int HEX2DEC(String hexadecimal)
    {
        return Integer.parseInt(hexadecimal, 16);
    }

    public static String DEC2HEX(int decimal)
    {
        return Integer.toHexString(decimal);
    }

    public static int CompareString(String cadena1, String cadena2)
    {
        if(cadena1.length() < cadena2.length())
            return -1;
         else if(cadena1.equals(cadena2))
            return 0;
        else if(cadena1.length() > cadena2.length())
            return 1;
        return 9999999;
    }

    public static String Trim(String cadena, String remover){ 
        String _new = cadena;
        Boolean flag = true,flag2 = true;
        while(flag || flag2)
        {
            if(_new.charAt(0) == remover.charAt(0))
            {
                StringBuilder temp = new StringBuilder(_new);
                _new = temp.deleteCharAt(0).toString();
            }
            else 
                flag = false;
            
            if(_new.charAt(_new.length()-1) == remover.charAt(0))
            {
                StringBuilder temp = new StringBuilder(_new);
                _new = temp.deleteCharAt(_new.length()-1).toString();
            }
            else 
                flag2 = false;
        }
        return _new;
    }

    public static String Repeat(String cadena, int rep){
        String temp = "";
        for(int x = 0; x<rep; x++){
            temp+=cadena;
        }
        return temp;
    }
}