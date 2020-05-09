#include<iostream>
using namespace std;
int main()
{
  int w,na,nc;
  cin>>w;
  cin>>na;
  cin>>nc;
  int ta=na*75;
  int tc=nc*30;
  int t=ta+tc;
  if(t<w)
    cout<<"Boat is stable";
  else
    cout<<"Boat will drow";
}