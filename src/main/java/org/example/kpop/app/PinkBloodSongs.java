package org.example.kpop.app;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Random;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.type.TypeReference;
import org.example.kpop.model.KpopMusic;

/**
 * Main application to randomly recommend a K-pop song from a JSON file.
 */
public class PinkBloodSongs {
    public static void main(String[] args) {
        try {
            List<KpopMusic> songs = loadSongs();
            KpopMusic randomSong = getRandomSong(songs);
            displayRecommendation(randomSong);
        } catch (IOException e) {
            System.out.println("Error loading song: " + e.getMessage());
        }
    }

    /**
     * Loads K-pop songs from a JSON file in the classpath.
     * @return A list of KpopMusic objects
     * @throws IOException If there is an error reading the file
     */
    private static List<KpopMusic> loadSongs() throws IOException {
        try (InputStream inputStream = PinkBloodSongs.class.getClassLoader().getResourceAsStream("pink_blood_songs.json")) {
            if (inputStream == null) {
                throw new IOException("File not found: pink_blood_songs.json");
            }

            String json = new String(inputStream.readAllBytes(), StandardCharsets.UTF_8);
            ObjectMapper mapper = new ObjectMapper();
            return mapper.readValue(json, new TypeReference<>() {});
        }
    }

    /**
     * Selects a random song from the provided list.
     * @param songs List of available K-pop songs
     * @return A randomly selected KpopMusic object
     */
    private static KpopMusic getRandomSong(List<KpopMusic> songs) {
        Random random = new Random();
        return songs.get(random.nextInt(songs.size()));
    }

    /**
     * Displays the recommended song in a user-friendly format.
     * @param song The selected KpopMusic object
     */
    private static void displayRecommendation(KpopMusic song) {
        System.out.printf("""
                🎵 Pink Blood Random Songs 🎵
                Group: %s
                Song: %s
                Year: %d
                Concept: %s
                MV: %s
                %n""", song.group(), song.title(), song.year(), song.concept(), song.mvLink());
    }
}
