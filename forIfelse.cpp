#include <iostream>
using namespace std;

int main()
{
    int sum = 0;
    int n;
    cout << "enter your no";
    cin >> n;

    for (int i = 0; i <= n; i++)
    {
        if (i % 3 == 0)
        {
            sum += i;
        }
    }
    cout << sum;

    return 0;
}