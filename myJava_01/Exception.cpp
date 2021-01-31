#include <iostream>

int main ()
{
    
    int a;
    int b;


    std::cout << "This result the division" << std::endl;

    std::cout << "input a:";
    std::cin >> a;

    std::cout << "input b:";
    std::cin >> b;
    
    try
    {
        
        if(b == 0)
        {
            throw 1;
        }

        std::cout<< "Result: ";
        std::cout << (double)a/(double)b << std::endl;
    }
    catch (...)
    {
        std::cout << "Can't divided by 0" << std::endl;
    }

    return 0;

}