#include<iostream>
using namespace std;
int main()
{
  int n;
  cin>>n;
  int n1=(n%2==0)?1:0;
  if(n1==1)
    cout<<"Possible";
  else
    cout<<"Not possible";
}