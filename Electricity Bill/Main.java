#include<iostream>
using namespace std;
int main()
{
  int n,m;
  cin>>n;
  if(n<=200)
    m=n*.5;
  else if(200>n<=400)
    m=100+((n-200)*.65);
  else if(400>n<=600)
    m=200+((n-400)*.80);
  else if(n>600)
    m=425+((n-600)*1.25);
  cout<<"Rs."<<m;
}