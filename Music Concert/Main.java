#include<iostream>
using namespace std;
int main(){
  int *a;
  int n,i,j=0,k=0;
  cin>>n;
  a=(int*)malloc(n*sizeof(int));
  for(i=0;i<n;i++)
  {
    cin>>*(a+i);
    if(*(a+i)%2==0)
    {
      j++;
    }
    else
    {
      k++;
    }
  }
  cout<<k<<"\n"<<j;
  return 0;
}