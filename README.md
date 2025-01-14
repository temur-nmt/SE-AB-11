# SE-AB-11

## Vorbereitung
Um diese Aufgabe zu bearbeiten, laden Sie bitte das beiliegende Archiv gilded-rose.zip aus
Moodle herunter und entpacken Sie es. Das Archiv enthält:
* Eine Maven-Projektstruktur mit allen nötigen Abhängigkeiten
* Die zu bearbeitenden Klassen im Verzeichnis src/main/java
* Ein Test-Template im Verzeichnis src/test/java
Tipp: Zum Ausführen der Tests:
1. Öffnen Sie das Projekt in einer IDE Ihrer Wahl (z.B. Eclipse, IntelliJ, oder VS Code)
2. Führen Sie mvn test aus oder nutzen Sie den „Test“-Button Ihrer IDE
## Aufgabe 1: Code-Analyse
Analysieren Sie den Code in der Klasse GildedRose und beschreiben Sie in eigenen Worten:
1. Was sind die grundlegenden Eigenschaften eines Items (Artikel)? Welche Attribute gibt es und
was bedeuten diese?
2. Wie verändert sich die Qualität von normalen Items über die Zeit? Geben Sie die Regeln in
eigenen Worten wieder.
3. Welche besonderen Items gibt es und wie unterscheiden sich deren Qualitätsregeln von denen
normaler Items?
## Aufgabe 2: Tests schreiben
1. Ein Test, der das Verhalten eines normalen Items über mehrere Tage hinweg überprüft
2. Ein Test für das spezielle Item „Aged Brie“
3. . Ein Test für das legendäre Item „Sulfuras“
```
  @Test
  void should_VERHALTEN_when_BEDINGUNG() {
  // Ihr Test hier
  }
```
Tipp: Überlegen Sie sich für jeden Test aussagekräftige Anfangswerte für sellIn und quality.
## Aufgabe 3: Refactoring
Refaktorisieren Sie den Code durch mindestens zwei von Ihnen gewählte Verbesserungen. Für jede
Verbesserung gilt:
1. Beschreiben Sie kurz, was Sie geändert haben und warum.
2. Stellen Sie durch Ausführen aller Tests sicher, dass Ihr Refactoring keine Fehler eingeführt hat.
## Abgabe
Laden Sie Ihre Lösung als ZIP-Datei hoch. Diese sollte enthalten:
* Die Antworten zu den Fragen wie gewohnt als PDF
* Den Quellcode inkl. Tests in Form der .java-Dateien.
Achten Sie darauf, keine unnötigen Dateien (z.B. Kompilierungs- oder IDE-Artefakte) hochzuladen.
