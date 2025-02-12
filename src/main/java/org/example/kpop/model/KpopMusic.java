package org.example.kpop.model;

/**
 * Represents a K-pop song with relevant metadata.
 * This class is implemented as a Java record, making it immutable and concise.
 *
 * Why use record:
 * - Reduces boilerplate code by automatically generating getters, equals(), hashCode(), and toString().
 * - Ensures immutability, preventing unintended modifications to song data.
 * - Improves readability and maintainability of the code.
 *
 * Example usage:
 * KpopMusic song = new KpopMusic("NCT Dream", "Hello Future", 2021, "Bright, youthful, futuristic", "https://www.youtube.com/watch?v=QPUjV7epJqE");
 */
public record KpopMusic(String group, String title, int year, String concept, String mvLink) {}