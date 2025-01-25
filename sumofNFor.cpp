#include <iostream>
using namespace std;

int main()
{
    int a;
    int sum = 0;
    cout << "Enter a number ";
    cin >> a;

    for (int i = 0; i <= a; i++)
    {
        if (i % 2 != 0)
        {

            sum += i;
        }
    }
    cout << sum;

    return 0;
}