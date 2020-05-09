#include<iostream>
#include<math.h>
using namespace std;
int main()
{
  float r,s;
  cin>>r;
  cin>>s;
  //float d=math.sqrt(2*s*s);
  float d=r*2;
  if(d<=s)
    cout<<"circle can be inside a square";
  else
    cout<<"circle cannot be inside a square";
  
}