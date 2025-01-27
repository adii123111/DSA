#include <iostream>
using namespace std;

int main()
{
  int n;
  cout << "enter your no ";
  cin >> n;
  char num = 'A';

  for (int i = 0; i < n; i++)
  {
    for (int j = 0; j < n; j++)
    {
      cout << num;
      num = num+1;
    }
    cout << endl;
  }

  return 0;
}