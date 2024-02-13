#include <iostream>
using namespace std;
void name(string& nom){
    cout << "Hola, com et dius?" << endl;
    cin >> nom;
}
void intro(string nom){
    cout << "Benvingut/da a l'assignatura d'estructura de dades " << nom << endl;
}

void outro(string nom){
    cout << "Fins a la propera " << nom << endl;
}

int main(){
    string nom;
    int option;
    string arr_options[] = {"Sortir", "Benvinguda"};
    name(nom);
    do{
        cout << "Hola " << nom << ", que vols fer?" << endl;
        for(int i = 0; i < 2; i++){
            cout << i + 1 << "." << arr_options[i] << endl;
        }
        cin >> option;
        if(option == 2){
            intro(nom);
        }
    }while(option != 1);
    outro(nom);
    return 0;
}