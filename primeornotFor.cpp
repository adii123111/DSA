#include <iostream>
using namespace std;

int main()
{
  int a;
  cout<<"enter your no ";
  cin>>a;

  for(int i = 2; i<a-1; i++){
    if(i%2==0){
      cout<<"this is prime no";
    }
  }

  cout<<"this is not a prime no";

  return 0;
}