package com.java.infinite.agent;

public enum Gender {
	MALE, FEMALE
}
Program in C++:

#include<iostream>

using namespace std;

int main()

{

int P;

cout<<“Enter total number of Participants : “;

cin>>P;

if(P < 0 || P > 200)

{

 cout<<“Invalid input.”;

 return 0;

}

int a = P / 4;

int b = P % 4;

if(P%2 == 0)

{

 if(b == 0)

 {

  cout<<“Group A = “<<a<<endl;

  cout<<“Group B = “<<a<<endl;

  cout<<“Group C = “<<a<<endl;

  cout<<“Group D = “<<a<<endl;

 }

 else if(a%2 == 0)

 {

  cout<<“Group A = “<<a<<endl;

  cout<<“Group B = “<<a<<endl;

  cout<<“Group C = “<<a<<endl;

  cout<<“Group D = “<<a+b<<endl;

 }

 else

 {

  cout<<“Group A = “<<a+1<<endl;

  cout<<“Group B = “<<a+1<<endl;

  cout<<“Group C = “<<a+1<<endl;

  cout<<“Group D = “<<a+b-3<<endl;

 }

}

else

{

  cout<<“Group A = “<<a<<endl;

  cout<<“Group B = “<<a<<endl;

  cout<<“Group C = “<<a<<endl;

  cout<<“Group D = “<<a+b<<endl;

}

return 0;

}