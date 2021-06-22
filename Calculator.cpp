/*
 * Calculator.cpp
 *
 *  Date: 05/22/2021
 *  Author: Clay Dodson
 *  Description: This program is used to add, subtract, mulitply, and divide numbers inputted by the user.
 */

#include <iostream>

using namespace std;

int main()                                                            // Changed "void" to "int".
{
	char statement[100];
	int op1, op2;
	char operation;
	char answer = 'y';                                                // Changed to single quotations. Changed "Y" to "y" and added ";" at the end of line.
	while (answer == 'y')
	{
		cout << "Enter expression" << endl;
		cin >> op2 >> operation >> op1;

		if (operation == '+')
		    cout << op1 << " + " << op2 << " = " << op1 + op2 << endl;    // After "op2" the ">>" was changed to "<<".
		if (operation == '-')
		    cout << op1 << " - " << op2 << " = " << op1 - op2 << endl;    // After "cout" the ">>" was changed to "<<".
		if (operation == '*')
		    cout << op1 << " * " << op2 << " = " << op1 * op2 << endl;    
		if (operation == '/')                                             // Changed if statement to same indention as other if statements. Swapped "*" and "/" symbols.
		    cout << op1 << " / " << op2 << " = " << op1 / op2 << endl;    // Adjusted indention for "cout" statements and added whitespace for readability.

		cout << "Do you wish to evaluate another expression? " << endl;
		cin >> answer;
	}
	return 0;                                                         // Added "return 0;" to complete while loop.
}
