#include<iostream>
using namespace std;
int main()
{
  int n;
  cin>>n;
  float h;
  cin>>h;
    if(n>3)
    cout<<"Number of items is more";
  else if(n==2)
  {
    h=h+(h*0.5);
    cout<<h;
  }
  else if(n==3)
  {
    cout<<(h*2);
  }
    
    
}