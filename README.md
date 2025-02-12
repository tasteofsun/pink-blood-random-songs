# 🎀 Pink Blood Random Songs

Welcome to my **Pink Blood Random Songs Recommendation**, a simple Java application that randomly recommends a song from some of SM Entertainment's artists between 2014-2025!

## 🎶 Features
✅ Randomly selects a K-pop song from a curated list.
✅ Displays the group, song title, release year, concept, and MV link.
✅ Reads song data from a JSON file for easy updates and expansion.

## 🛠 Installation & Usage
### 1️⃣ Clone this repository:
```sh
git clone https://github.com/nammelie/pink-blood-random-songs.git
```

### 2️⃣ Open the project in your preferred Java IDE:
Supports **IntelliJ IDEA, Eclipse, VS Code, etc.**

### 3️⃣ Compile and run the application:
```sh
mvn compile
mvn exec:java -Dexec.mainClass="org.example.kpop.app.PinkBloodSongs"
```

Alternatively, you can run it directly from your IDE by executing `PinkBloodSongs.java`.

## 📂 Project Structure
```
Pink-Blood-Random-Songs/
│── src/
│   ├── main/
│   │   ├── java/org/example/kpop/app/
│   │   │   ├── PinkBloodSongs.java   # Main application file
│   │   ├── java/org/example/kpop/model/
│   │   │   ├── KpopMusic.java        # Record representing a song
│   │   ├── resources/
│   │   │   ├── pink_blood_songs.json # JSON file with song data
│── pom.xml
│── README.md
│── .gitignore
```

## ☕ Technologies Used
- **Java 17+**
- **Maven** (for project management)
- **Jackson Library** (for JSON parsing)
- **Object-Oriented Programming (OOP) & Java Records**

## 📝 How Songs Are Stored
Songs are stored in `pink_blood_songs.json` using the following format:
```json
[
  {
    "group": "NCT Dream",
    "title": "Hello Future",
    "year": 2021,
    "concept": "Bright, youthful, futuristic",
    "mvLink": "https://www.youtube.com/watch?v=QPUjV7epJqE"
  }
]
```
You can edit this file to add or remove songs!

## 🤝 Contributions
Feel free to **fork**, **submit pull requests**, or **open issues** for improvements! 🚀