package data;

import exception.IngredientNotFoundException;

import java.util.List;

public interface IData {
    List<String> getAllIngredients(); //returnerer alle ingredienser i String-format
    String getIngredientName(int id) throws IngredientNotFoundException; //returnerer navn for ingrediens
    int getIngredientAmount(int id) throws IngredientNotFoundException; //returnerer m�ngde for ingrediens
    void setIngredientName(int id, String name) throws IngredientNotFoundException; //�ndrer navn for ingrediens til angivet v�rdi i 'name'
    void setIngredientAmount(int id, int amount) throws IngredientNotFoundException; //�ndrer m�ngde for ingrediens til angivet v�rdi i 'amount'
    void createIngredient(int id, String name, int amount); //opretter en ny ingrediens med de angivne v�rdier
}
