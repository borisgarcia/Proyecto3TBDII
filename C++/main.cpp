#include <stdio.h>
#include <string>
#include <iomanip>
#include <tgmath.h>
#include <iostream>
#include <stdlib.h>
#include <sstream>
using namespace std;

/*int ping(String ipAddress)
{
    InetAddress inet = InetAddress.getByName(ipAddress);
    return (inet.isReachable(5000) ? 1 : 0);
}*/

double PMT(double ti, int npr, double pv)
{
    return  ((pv*ti)/(1 - (pow((1 + ti), -npr))));
}

int BIN2DEC(string number)
{
    int result = 0, pow = 1;
    for ( int i = number.length() - 1; i >= 0; --i, pow <<= 1 )
        result += (number[i] - '0') * pow;

    return result;
}

string DEC2BIN(int number)
{
    if ( number == 0 ) return "0";
    if ( number == 1 ) return "1";

    if ( number % 2 == 0 )
        return DEC2BIN(number / 2) + "0";
    else
        return DEC2BIN(number / 2) + "1";
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

int HEX2DEC(string hexadecimal){
    int _res;
    stringstream ss;
    ss << hex << hexadecimal;
    ss >> _res;
    return _res;
}

string DEC2HEX(int decimal)
{
    stringstream ss;
    ss << hex << decimal;
    string _h = ss.str();
    return _h;
}

int CompareString(string cadena1, string cadena2)
{
    if(cadena1 < cadena2)
        return -1;
    else if(cadena1 == cadena2)
        return 0;
    else if(cadena1 > cadena2)
        return 1;
    return 9999999;
}

string Trim(string cadena, string remover){
    int y;
    for(int x = 0;x<cadena.size();x++)
    {
        if(cadena.at(x) != remover.at(0))
        {
            y = x;
            break;
        }
    }

    cadena.erase(0,y);
    for(int x = cadena.size()-1;0<x;x--)
    {
        if(cadena.at(x) != remover.at(0))
        {
            y = x;
            break;
        }
    }
    cadena.erase(y+1,cadena.size()-y);
}

string Repeat(string cadena, int rep){
    string temp = "";
    for(int x = 0; x<rep; x++){
        temp+=cadena;
    }
    return temp;
}


int main()
{
    Trim("xxHolaxxxxxxxxxxx","x");


    return 0;
}
