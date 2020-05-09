#include<iostream>
using namespace std;
int main()
{int p,r,t;
 cin>>p;
  cin>>r;
 cin>>t;
 int i=(p*r*t)/100;
  int amt=i+p;
 cout<<i<<endl;
 cout<<amt<<endl;
 cout<<.02*i<<endl;
 cout<<amt-(.02*i);

}