# IntroClass Java

This repository contains the IntroClass for Java.

This benchmark is automatically generated from the IntroClass for C presented in the Autorepair Benchmark Suite, a joint project between Carnegie-Mellon University and the University of Massachusetts. The homepage for the Autorepair Benchmark Suite is located at http://dijkstra.cs.virginia.edu/genprog/resources/autorepairbenchmarks.

| Project   | # wb ok | # wb ko | # bb ok | # bb ko | # both ko | # program |
|-----------|---------|---------|---------|---------|-----------|-----------|
| digits    |      15 |      60 |      24 |      51 |        36 |        75 |
| grade     |       1 |      88 |       0 |      89 |        88 |        89 |
| checksum  |       0 |      11 |       4 |       7 |         7 |        11 |
| median    |       9 |      48 |       6 |      51 |        42 |        57 |
| smallest  |       7 |      45 |       5 |      47 |        40 |        52 |
| syllables |       1 |      12 |       0 |      13 |        12 |        13 |
|         6 |      33 |     264 |      39 |     258 |       225 |       297 |


## Directory Overview

```
introclassJava/
 |-lib/
 |--data/
 |---dataset.xml
 |--CToJava.py
 |--evalIntroClassJava.py
 |-dataset/
 |--checksum/
 |---f4a823174201234546789abcdeffff<repository ID hex string>.../
 |----000/
 |-----src/
 |------main/
 |-------java/introclassJava
 |--------digits_f4a823174201234546789abcdeffff_000.java
 |------test/
 |-------java/introclassJava
 |--------digits_f4a823174201234546789abcdeffff_000BackboxTest.java
 |----001/
 |--------<same as above>
 |---09F911029D74E35BD84156C5635688C0<next repository ID hex string>.../
 |--digits/
 |-...
 ```

The folder ```lib``` contains the python scripts use to transform the C dataset to a Java dataset.

The file ```lib/data/dataset.xml``` contains the dataset IntroClass transformed into xml via the following command: 
```console
srcml --language=C --literal --operator --modifier `find  IntroClass -name "*.c"` -o IntroClassJava/lib/data/dataset.xml
```

The folder ```dataset``` contains the assignment programs:

* checksum -- compute a simple checksum of a string
* digits -- compute the number of digits in an integer
* grade -- compute the letter grade corresponding to a percentage
* median -- give the median of three numbers
* smallest -- give the smallest of three numbers
* syllables -- give the number of English syllables in a string

Each subdirectory below represents a student's submitted repository which contains several revisions. Each revision is a maven project. 