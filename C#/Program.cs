using System;
using System.Net.NetworkInformation;
namespace C_
{
    class Program
    {
        static void Main(string[] args)
        {
            Program p = new Program();
            Console.WriteLine(p.CompareString("hola","hola"));
            
        }
        double pmt (double ti, int npr, double pv)
        { 
            return  ((pv*ti)/(1 - (Math.Pow((1 + ti), -npr))));
        }

        int BIN2DEC(string number)
        {
            return Convert.ToInt32(number, 2);;
        }

        string DEC2BIN(int number)
        {
            string binary = "";
            int i =0;
            while (number > 0){
                binary+=(number%2);
                i++;
                number = number/2;
            }
            return binary;
        }
        int C2F(int c)
        {
            return ((int)(c * 1.8) + 32);
        }

        int F2C(int f)
        {
            return ((int)((f-32) *  0.5556));
        }

        int Factorial(int val)
        {
            int res = 1;

            for(int x=1;x<=val;x++){
                res=res*x;
            }
            return res;
        }

        int HEX2DEC(string hexadecimal)
        {
            return int.Parse(hexadecimal, System.Globalization.NumberStyles.HexNumber);
        }

        string DEC2HEX(int _decimal)
        {
            return _decimal.ToString("X");;
        }

        int CompareString(string cadena1, string cadena2)
        {
            if(cadena1.Length < cadena2.Length)
                return -1;
            else if(cadena1 == cadena2)
                return 0;
            else if(cadena1.Length > cadena2.Length)
                return 1;
            return 9999999;
        }
        public String trim(String cadena, String remover)
        { 
            char myChar = cadena[0];
            string x = cadena.Trim(myChar);
            return x;
        }

        string Repeat(string cadena, int rep)
        {
            string temp = "";
            for(int x = 0; x<rep; x++){
                temp+=cadena;
            }
            return temp;
        }
    } 
}
