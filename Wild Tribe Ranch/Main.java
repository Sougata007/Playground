#include<iostream>
using namespace std;
int main()
{
  int max;
  int w;
  cin>>max;
  cin>>w;
  if(max>w)
    cout<<"Yes, you can enter.";
  else if(max==w)
    cout<<"Yes, you can enter. Kindly use a rope.";
  else
    cout<<"Sorry, you can't enter";
  return 0;
}
