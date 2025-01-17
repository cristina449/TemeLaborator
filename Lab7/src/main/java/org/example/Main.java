package org.example;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        ObjectMapper mapper = new ObjectMapper();

        File file = new File("src/main/resources/carti.json");
        Map<Integer, Carte> carti = mapper.readValue(file, new TypeReference<>() {});

        System.out.println("Colecția inițială de cărți:");
        carti.forEach((id, carte) -> System.out.println(id + ": " + carte));

        int idToRemove = 2;
        carti.remove(idToRemove);
        System.out.println("\nColecția după ștergerea cărții cu ID " + idToRemove + ":");
        carti.forEach((id, carte) -> System.out.println(id + ": " + carte));

        int newId = 4;
        Carte newCarte = new Carte("Baltagul", "Mihail Sadoveanu", 1930);
        carti.putIfAbsent(newId, newCarte);
        System.out.println("\nColecția după adăugarea unei noi cărți:");
        carti.forEach((id, carte) -> System.out.println(id + ": " + carte));

        mapper.writerWithDefaultPrettyPrinter().writeValue(file, carti);
        System.out.println("\nModificările au fost salvate în fișierul JSON.");
    }
}
