#include<iostream>
using namespace std;
int main()
{
  int arr[3],i,j,a;
          for (i = 0; i < 3; ++i)
            cin>>arr[i];

      for (i = 0; i < 3; ++i) 
        {
 
            for (j = i + 1; j < 3; ++j)
            {
 
                if (arr[i] > arr[j]) 
                {
 
                    a =  arr[i];
                    arr[i] = arr[j];
                    arr[j] = a;
 
                }
 
            }
 
        }
  cout<<"The treasure is in box which has number "<<arr[1];
  for(i=arr[0];i>=1;i--)
  {
    if((arr[0]%i==0)&&(arr[1]%i==0)&&(arr[2]%i==0)){
      cout<<"\nThe code to open the box is "<<i;break;}
  }
}