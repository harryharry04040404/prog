#include <iostream>
#include <vector>
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

int menu(string nom, int option, vector<string> arr_options){
    cout << "Hola " << nom << ", que vols fer?" << endl;
    for(int i = 0; i < arr_options.size(); i++){
        cout << i + 1 << "." << arr_options[i] << endl;
    }
    cin >> option;
    return option;
}

int main(){ 
    string nom;
    int option;
    bool end = false;
    vector<string> arr_options = {"Sortir", "Benvinguda", "Redefinir nom"};
    name(nom);

    do{
        option = menu(nom, option, arr_options);
        switch (option)
        {
        case 1:
            end = true;
            break;
        case 2:
            intro(nom);
            break;
        case 3:
            name(nom);
            break;    
        default:
            break;
        }
    }while(!end);
    outro(nom);
    return 0;
}