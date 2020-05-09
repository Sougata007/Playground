#include<iostream>
using namespace std;
int main()
{
  int fa,fd,fs;
  int sa,sd,ss;
  int aa,ad,as;
  cin>>fa;
  cin>>fd;
  cin>>fs;
  cin>>sa;
  cin>>sd;
  cin>>ss;
  cin>>aa;
  cin>>ad;
  cin>>as;
  
  int fp=fa-((fd*fa)/100)+fs;
  int sp=sa-((sd*sa)/100)+ss;
  int ap=aa-((ad*aa)/100)+as;
  cout<<"In Flipkart Rs."<<fp;
  cout<<"\nIn Snapdeal Rs."<<sp;
  cout<<"\nIn Amazon Rs."<<ap<<endl;
  int min=fp;
  if(sp<min)
    min=sp;
  else if(ap<min)
    min=ap;
  if(min==fp)
    cout<<"He will prefer Flipkart";
  else if(min==sp)
    cout<<"He will prefer Snapdeal";
  else if(min==ap)
    cout<<"He will prefer Amazon";
  

}