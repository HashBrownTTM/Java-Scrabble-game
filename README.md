# Java-Scrabble-game
You are firstly required to prompt the user to enter in a one to start the game. If the users decide
to play the game, prompt for the two player names. 

![image](https://user-images.githubusercontent.com/93540733/215362177-1d2ea7d3-1fef-4e21-9099-c197e71c0b83.png)

The players will then be presented with the alphabet. Each player has to enter a word with the
available letters in the alphabet list. When a player enters a word the letters of that word get
removed from the alphabet list. Only vowels are not removed from the alphabet list. Before a
word can be accepted both players must agree if the word entered is valid or not. 

![image](https://user-images.githubusercontent.com/93540733/215362239-9b69ae94-e0bb-4883-bfa9-3ab086953e60.png)

It is suggested that players have a dictionary present to determine the validity of the word. If the
word is accepted, the player is awarded one point for each letter in the word. This letter tally will 
determine who the winner is when the game is finished. A letter can be used more than once in
the creation of a word, but then must be removed from the alphabet list. For example, the word
“FILL” contains two “L”, which must be removed from the alphabet list.

Once a letter has been removed from the alphabet list, a player cannot enter a word that contains
the missing letters. You are required to display a suitable message for this and prompt the player
to enter in a new word.

![image](https://user-images.githubusercontent.com/93540733/215362325-6265c8d0-7235-4bdc-becd-8b3cdc62c7fe.png)

The game continues until a player cannot create any more words with the remaining alphabet list.
If a player cannot create a word, they are required to enter in a sentinel value of three question
marks “???”. Once a player has quit the game, display who the winner of the game is with their
accumulated points or if the game is tied.

![image](https://user-images.githubusercontent.com/93540733/215362372-6cb93d6f-6389-41b6-866a-5ece1715bea3.png)
