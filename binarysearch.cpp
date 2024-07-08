
#include<iostream>
using namespace std;
int main()
{
    int a[20]={2,4,5,7,9,19,27,46,71,77,81,82,85,91};
    int l=0,r=13,serch,i,m;
    cout<<"enter number you want to search ";
    cin>>serch;
    while(l<=r)
    {
      m=(l+r)/2;
      if(a[m]==serch)
      {
          cout<<"number is found";
          break;
      }
      else if(a[m]>serch)
      {
          r=m-1;
      }
      else if(a[m]<serch)
      {
          l=m+1;
      }

    }
    if(l>r)
    {
        cout<<"number is not found";
    }
return 0;

}
