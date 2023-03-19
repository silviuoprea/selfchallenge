# VII. Word Game

<br>Write a program that simulates a word game between a given number of players.
<br><br>
At the beginning of the game there is a bag containing a number of tiles. Each tile represents a letter and has a number of points. The application will also use a dictionary that contains a list of acceptable words. Each player extracts 7 tiles from the bag and must create a word from the dictionary with them. When a player creates a word, it submits it to the board and receives a number of points (the value of tile points multiplied by the length of the word). After submitting a word of length k, the player will immediately request other tiles k from the bag(if this is possible). If the player cannot create a word, it will discard all the tiles and extract others (and passes its turn). The game ends when the bag becomes empty. The winner is the player with the highest score.
The players might take turns (or not...) and a time limit might be imposed (or not...).

<br>


## 1. Basic requirements


- [x] a. Create an object oriented model of the problem. You may assume that there are 10 tiles for each letter in the alphabet and each letter is worth a random number of points (between 1 and 10).
- [ ] b. Each player will have a name and they must perform in a concurrent manner, extracting repeatedly tokens from the board.
- [ ] c. After each extraction, the player will submit to the board all the letters.
- [ ] d. Simulate the game using a thread for each player.
<br>Pay attention to the synchronization of the threads when extracting tokens from the bag and when putting words on the board.


#### Proof :

## 2. Expanding and reworking features

- [ ] a. Use the following number of tiles for each letter: A-9, B-2, C-2, D-4, E-12, F-2, G-3, H-2, I-9, J-1, K-1, L-4, M-2, N-6, O-8, P-2, Q-1, R-6, S-4, T-6, U-4, V-2, W-2, X-1, Y-2, Z-1
- [ ] b. Use the following points for the letters:
<br> (1 point)-A, E, I, O, U, L, N, S, T, R
<br> (2 points)-D, G
<br> (3 points)-B, C, M, P
<br> (4 points)-F, H, V, W, Y
<br> (5 points)-K
<br> (8 points)- J, X
<br> (10 points)-Q, Z
- [ ] c. Create an implementation of a dictionary, using some collection of words. 
<br>Use an appropriate collection to represent the dictionary. This collection should be large enough; you may use aspell to generate a text file containing English words, or anything similar: WordNet, dexonline, etc.
- [ ] d. Implement the scoring and determine who the winner is at the end of the game.
- [ ] e. Make sure that players wait their turns, using a wait-notify approach.
- [ ] f. Implement a timekeeper thread that runs concurrently with the player threads, as a daemon. This thread will display the running time of the game and it will stop the game if it exceeds a certain time limit.

#### Proof :

## 3. Advanced features

- [ ] a. The dictionay must offer the possibility to search not only for a word, but for words which start with a given prefix (lookup).
- [ ] b. Implement the prefix search (for a classical collection) using a multi-threaded approach (parallel streams, ForkJoin, etc).
- [ ] c. Represent the words in the dictionary as a prefix tree or directed acyclic word graph for memory efficiency and prefix lookups.
- [ ] d. Compare the running time for the lookup operation between a standard collection and the one above (prefix tree or dawg).


#### Proof :

