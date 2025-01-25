#include <iostream>
using namespace std;

int main()
{
    char ch;
    cout << "Enter your char ";
    cin >> ch;

    if (ch >= 'a' && ch < 'z')
    {
        cout << "This is LowerCase"; 
    }
    else
    {
        cout << "This is UpperCase";
    }

    return 0;
}