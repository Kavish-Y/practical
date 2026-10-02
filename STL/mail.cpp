#include <iostream>
#include <string>
#include <algorithm>
#include <cctype>
// Helper function to convert a string to lowercase
std::string toLowercase(std::string str) {
    std::transform(str.begin(), str.end(), str.begin(), [](unsigned char c) {
        return std::tolower(c);
    });
    return str;
}
int main() {
    std::string firstName;
    std::string lastName;
    std::cout << "=========================================\n";
    std::cout << "      Company Email Generator            \n";
    std::cout << "=========================================\n\n";
    std::cout << "Enter First Name: ";
    if (!(std::cin >> firstName)) {
        std::cerr << "Error reading first name.\n";
        return 1;
    }
    std::cout << "Enter Last Name: ";
    if (!(std::cin >> lastName)) {
        std::cerr << "Error reading last name.\n";
        return 1;
    }
    std::string email = toLowercase(firstName) + "." + toLowercase(lastName) + "@company.com";
    std::cout << "\n-----------------------------------------\n";
    std::cout << "Generated Email: " << email << "\n";
    std::cout << "=========================================\n";
    return 0;
}