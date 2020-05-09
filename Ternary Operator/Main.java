#include<iostream>
using namespace std;
int main()
{
int n;
cin>>n;
int k=(n%2==0)?0:1;
if(k==1)
cout<<"Odd";
else
cout<<"Even";
  return 0;
}