package com.example.iem.pokecard.Model;

/**
 * Created by alexandre on 09/03/2018.
 */

public class PokemonListJson {
    public static final String json =
            "\"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/1.png\",\n" +
            "\"bulbasaur\",\n" +
            "\"45,\n" +
            "\"65,\n" +
            "\"65,\n" +
            "\"49,\n" +
            "\"49,\n" +
            "\"45\n";

            /*"{\n" +
            "\t\"previous\": null,\n" +
            "\t\"next\": \"http://local.project.com/PokeCardAPI/web/index.php/pokemon/get/20\",\n" +
            "\t\"pokemons\": [\n" +
            "\t\t{\n" +
            "\t\t\t\"icon\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/1.png\",\n" +
            "\t\t\t\"name\": \"bulbasaur\",\n" +
            "\t\t\t\"pv\": 45,\n" +
            "\t\t\t\"att\": 65,\n" +
            "\t\t\t\"def\": 65,\n" +
            "\t\t\t\"spA\": 49,\n" +
            "\t\t\t\"spD\": 49,\n" +
            "\t\t\t\"spe\": 45\n" +
            "\t\t},\n" +
            "\t\t{\n" +
            "\t\t\t\"icon\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/2.png\",\n" +
            "\t\t\t\"name\": \"ivysaur\",\n" +
            "\t\t\t\"pv\": 60,\n" +
            "\t\t\t\"att\": 80,\n" +
            "\t\t\t\"def\": 80,\n" +
            "\t\t\t\"spA\": 63,\n" +
            "\t\t\t\"spD\": 62,\n" +
            "\t\t\t\"spe\": 60\n" +
            "\t\t},\n" +
            "\t\t{\n" +
            "\t\t\t\"icon\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/3.png\",\n" +
            "\t\t\t\"name\": \"venusaur\",\n" +
            "\t\t\t\"pv\": 80,\n" +
            "\t\t\t\"att\": 100,\n" +
            "\t\t\t\"def\": 100,\n" +
            "\t\t\t\"spA\": 83,\n" +
            "\t\t\t\"spD\": 82,\n" +
            "\t\t\t\"spe\": 80\n" +
            "\t\t},\n" +
            "\t\t{\n" +
            "\t\t\t\"icon\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/4.png\",\n" +
            "\t\t\t\"name\": \"charmander\",\n" +
            "\t\t\t\"pv\": 65,\n" +
            "\t\t\t\"att\": 50,\n" +
            "\t\t\t\"def\": 60,\n" +
            "\t\t\t\"spA\": 43,\n" +
            "\t\t\t\"spD\": 52,\n" +
            "\t\t\t\"spe\": 39\n" +
            "\t\t},\n" +
            "\t\t{\n" +
            "\t\t\t\"icon\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/5.png\",\n" +
            "\t\t\t\"name\": \"charmeleon\",\n" +
            "\t\t\t\"pv\": 80,\n" +
            "\t\t\t\"att\": 65,\n" +
            "\t\t\t\"def\": 80,\n" +
            "\t\t\t\"spA\": 58,\n" +
            "\t\t\t\"spD\": 64,\n" +
            "\t\t\t\"spe\": 58\n" +
            "\t\t},\n" +
            "\t\t{\n" +
            "\t\t\t\"icon\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/6.png\",\n" +
            "\t\t\t\"name\": \"charizard\",\n" +
            "\t\t\t\"pv\": 100,\n" +
            "\t\t\t\"att\": 85,\n" +
            "\t\t\t\"def\": 109,\n" +
            "\t\t\t\"spA\": 78,\n" +
            "\t\t\t\"spD\": 84,\n" +
            "\t\t\t\"spe\": 78\n" +
            "\t\t},\n" +
            "\t\t{\n" +
            "\t\t\t\"icon\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/7.png\",\n" +
            "\t\t\t\"name\": \"squirtle\",\n" +
            "\t\t\t\"pv\": 43,\n" +
            "\t\t\t\"att\": 64,\n" +
            "\t\t\t\"def\": 50,\n" +
            "\t\t\t\"spA\": 65,\n" +
            "\t\t\t\"spD\": 48,\n" +
            "\t\t\t\"spe\": 44\n" +
            "\t\t},\n" +
            "\t\t{\n" +
            "\t\t\t\"icon\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/8.png\",\n" +
            "\t\t\t\"name\": \"wartortle\",\n" +
            "\t\t\t\"pv\": 58,\n" +
            "\t\t\t\"att\": 80,\n" +
            "\t\t\t\"def\": 65,\n" +
            "\t\t\t\"spA\": 80,\n" +
            "\t\t\t\"spD\": 63,\n" +
            "\t\t\t\"spe\": 59\n" +
            "\t\t},\n" +
            "\t\t{\n" +
            "\t\t\t\"icon\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/9.png\",\n" +
            "\t\t\t\"name\": \"blastoise\",\n" +
            "\t\t\t\"pv\": 78,\n" +
            "\t\t\t\"att\": 105,\n" +
            "\t\t\t\"def\": 85,\n" +
            "\t\t\t\"spA\": 100,\n" +
            "\t\t\t\"spD\": 83,\n" +
            "\t\t\t\"spe\": 79\n" +
            "\t\t},\n" +
            "\t\t{\n" +
            "\t\t\t\"icon\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/10.png\",\n" +
            "\t\t\t\"name\": \"caterpie\",\n" +
            "\t\t\t\"pv\": 45,\n" +
            "\t\t\t\"att\": 20,\n" +
            "\t\t\t\"def\": 20,\n" +
            "\t\t\t\"spA\": 35,\n" +
            "\t\t\t\"spD\": 30,\n" +
            "\t\t\t\"spe\": 45\n" +
            "\t\t},\n" +
            "\t\t{\n" +
            "\t\t\t\"icon\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/11.png\",\n" +
            "\t\t\t\"name\": \"metapod\",\n" +
            "\t\t\t\"pv\": 30,\n" +
            "\t\t\t\"att\": 25,\n" +
            "\t\t\t\"def\": 25,\n" +
            "\t\t\t\"spA\": 55,\n" +
            "\t\t\t\"spD\": 20,\n" +
            "\t\t\t\"spe\": 50\n" +
            "\t\t},\n" +
            "\t\t{\n" +
            "\t\t\t\"icon\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/12.png\",\n" +
            "\t\t\t\"name\": \"butterfree\",\n" +
            "\t\t\t\"pv\": 70,\n" +
            "\t\t\t\"att\": 80,\n" +
            "\t\t\t\"def\": 90,\n" +
            "\t\t\t\"spA\": 50,\n" +
            "\t\t\t\"spD\": 45,\n" +
            "\t\t\t\"spe\": 60\n" +
            "\t\t},\n" +
            "\t\t{\n" +
            "\t\t\t\"icon\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/13.png\",\n" +
            "\t\t\t\"name\": \"weedle\",\n" +
            "\t\t\t\"pv\": 50,\n" +
            "\t\t\t\"att\": 20,\n" +
            "\t\t\t\"def\": 20,\n" +
            "\t\t\t\"spA\": 30,\n" +
            "\t\t\t\"spD\": 35,\n" +
            "\t\t\t\"spe\": 40\n" +
            "\t\t},\n" +
            "\t\t{\n" +
            "\t\t\t\"icon\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/14.png\",\n" +
            "\t\t\t\"name\": \"kakuna\",\n" +
            "\t\t\t\"pv\": 35,\n" +
            "\t\t\t\"att\": 25,\n" +
            "\t\t\t\"def\": 25,\n" +
            "\t\t\t\"spA\": 50,\n" +
            "\t\t\t\"spD\": 25,\n" +
            "\t\t\t\"spe\": 45\n" +
            "\t\t},\n" +
            "\t\t{\n" +
            "\t\t\t\"icon\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/15.png\",\n" +
            "\t\t\t\"name\": \"beedrill\",\n" +
            "\t\t\t\"pv\": 75,\n" +
            "\t\t\t\"att\": 80,\n" +
            "\t\t\t\"def\": 45,\n" +
            "\t\t\t\"spA\": 40,\n" +
            "\t\t\t\"spD\": 90,\n" +
            "\t\t\t\"spe\": 65\n" +
            "\t\t},\n" +
            "\t\t{\n" +
            "\t\t\t\"icon\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/16.png\",\n" +
            "\t\t\t\"name\": \"pidgey\",\n" +
            "\t\t\t\"pv\": 56,\n" +
            "\t\t\t\"att\": 35,\n" +
            "\t\t\t\"def\": 35,\n" +
            "\t\t\t\"spA\": 40,\n" +
            "\t\t\t\"spD\": 45,\n" +
            "\t\t\t\"spe\": 40\n" +
            "\t\t},\n" +
            "\t\t{\n" +
            "\t\t\t\"icon\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/17.png\",\n" +
            "\t\t\t\"name\": \"pidgeotto\",\n" +
            "\t\t\t\"pv\": 71,\n" +
            "\t\t\t\"att\": 50,\n" +
            "\t\t\t\"def\": 50,\n" +
            "\t\t\t\"spA\": 55,\n" +
            "\t\t\t\"spD\": 60,\n" +
            "\t\t\t\"spe\": 63\n" +
            "\t\t},\n" +
            "\t\t{\n" +
            "\t\t\t\"icon\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/18.png\",\n" +
            "\t\t\t\"name\": \"pidgeot\",\n" +
            "\t\t\t\"pv\": 101,\n" +
            "\t\t\t\"att\": 70,\n" +
            "\t\t\t\"def\": 70,\n" +
            "\t\t\t\"spA\": 75,\n" +
            "\t\t\t\"spD\": 80,\n" +
            "\t\t\t\"spe\": 83\n" +
            "\t\t},\n" +
            "\t\t{\n" +
            "\t\t\t\"icon\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/19.png\",\n" +
            "\t\t\t\"name\": \"rattata\",\n" +
            "\t\t\t\"pv\": 72,\n" +
            "\t\t\t\"att\": 35,\n" +
            "\t\t\t\"def\": 25,\n" +
            "\t\t\t\"spA\": 35,\n" +
            "\t\t\t\"spD\": 56,\n" +
            "\t\t\t\"spe\": 30\n" +
            "\t\t},\n" +
            "\t\t{\n" +
            "\t\t\t\"icon\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/20.png\",\n" +
            "\t\t\t\"name\": \"raticate\",\n" +
            "\t\t\t\"pv\": 97,\n" +
            "\t\t\t\"att\": 70,\n" +
            "\t\t\t\"def\": 50,\n" +
            "\t\t\t\"spA\": 60,\n" +
            "\t\t\t\"spD\": 81,\n" +
            "\t\t\t\"spe\": 55\n" +
            "\t\t}\n" +
            "\t]\n" +
            "}";*/
}
